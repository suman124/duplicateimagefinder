package com.suman.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List<File> listFiles(String path){
        File file = new File(path);
        return listFiles(file);
    }

    public List<File> listFiles(File folder){
        List list = new ArrayList<File>();
        if(folder!=null){
            if(folder.isDirectory()){
                for (File file : folder.listFiles()) {
                    List subList = listFiles(file);
                    list.addAll(subList);
                }
            }else{
                list.add(folder);
            }
        }
        return list;
    }
}
