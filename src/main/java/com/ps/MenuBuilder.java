package com.ps;

import java.util.ArrayList;

public class MenuBuilder {
    public static void makeMenu(String title, ArrayList<String> options){
        StringBuilder sb = new StringBuilder();
        printHeader(sb, title);
        printBody(sb, options);
    }

    public static void makeMenu(String title, String subtitle, ArrayList<String> options){

    }

    public static void makeHeader(StringBuilder sb, String title){

    }
}
