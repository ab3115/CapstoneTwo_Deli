package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void buffWriter(){

        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(""));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
