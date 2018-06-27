package com.suman;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.suman.file.FileProcessor;
import com.suman.model.FileMetadata;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DuplicateFinder {
    public static void main(String[] args) {
        String rootPath = "D:\\Users\\PolimS\\Desktop\\temp\\test";
        new DuplicateFinder().processDuplicates(rootPath);
    }

    public void processDuplicates(String rootFilePath){
        List<File> allFiles = new FileProcessor().listFiles(rootFilePath);
        List<FileMetadata> metadataList = new ArrayList<>();
        allFiles.stream().forEach((File file) ->{
            try {
                Metadata metadata = ImageMetadataReader.readMetadata(file);
                FileMetadata fileMetadata = new FileMetadata();
                fileMetadata.setFileName(file.getName());
                fileMetadata.setFilePath(file.getCanonicalPath());
                fileMetadata.setFileSize(file.length());
                metadata.getDirectories().forEach(directory -> {
                    if(directory.getName().toUpperCase().contains("EXIF")) {
                        directory.getTags()
                                .stream()
                                .forEach(tag -> {
                                    if(tag.getTagName().equals("Date/Time")){
                                        fileMetadata.setCreationDateStr(tag.getDescription());
                                    }else if(tag.getTagName().equals("dateTimeDigitized")){
                                        fileMetadata.setDateTimeDigitized(tag.getDescription());
                                    }else if(tag.getTagName().equals("dateTimeOriginal")){
                                        fileMetadata.setDateTimeOriginal(tag.getDescription());
                                    }
//                                    System.out.println(directory.getName() + " :" + tag.getTagName() + " -->" + tag.getDescription());
                                });
                    }
                });
                System.out.println(fileMetadata);
            }catch(IOException |ImageProcessingException e){
                e.printStackTrace();
            }
        });
    }
}
