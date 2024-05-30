package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FileManager {

    public static void buffWriter(ArrayList<Product> order) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String formatted_date_time = localDateTime.format(formatter);
        String file_name = formatted_date_time + ".txt";

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_name));
            bufferedWriter.write(formatted_date_time);
            for(Product product: order){
                bufferedWriter.write(product.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
