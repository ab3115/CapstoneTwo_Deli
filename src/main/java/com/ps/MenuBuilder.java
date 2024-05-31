package com.ps;

import java.util.ArrayList;

public class MenuBuilder {

    public static void printMenu(String title, ArrayList<String> options) {
        StringBuilder sb = new StringBuilder();
        printHeader(sb, title);
        printBody(sb, options);
        sb.append(String.format("%s\n", "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"));
        System.out.println(sb);

    }

    //Overloads based on if menu has two strings in title or not.
    public static void printMenu(String title, String subtitle, ArrayList<String> options) {
        StringBuilder sb = new StringBuilder();
        printHeaderWithSubtitle(sb, title, subtitle);
        printBody(sb, options);
        sb.append(String.format("%s\n", "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"));
        System.out.println(sb);

    }

    public static StringBuilder printHeader(StringBuilder sb, String title) {
        sb.append(String.format("%s\n", "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"));
        sb.append(String.format(calculateBuffer(title), "", title, ""));
        sb.append(String.format("%s\n", "|                                                                    |"));
        sb.append(String.format("%s\n", "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"));
        sb.append(String.format("%s\n", "|                                                                    |"));
        return sb;
    }

    public static StringBuilder printHeaderWithSubtitle(StringBuilder sb, String title, String subtitle) {
        sb.append(String.format("%s\n", "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"));
        sb.append(String.format(calculateBuffer(title), "", title, ""));
        sb.append(String.format(calculateBuffer(subtitle), "", subtitle, ""));
        sb.append(String.format("%s\n", "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"));
        sb.append(String.format("%s\n", "|                                                                    |"));
        return sb;
    }

    public static StringBuilder printBody(StringBuilder sb, ArrayList<String> menuOptions) {
        for (String option : menuOptions) {
            sb.append(String.format(calculateBuffer(option), "", option, ""));
            sb.append(String.format("%s\n", "|                                                                    |"));
        }
        return sb;
    }

    public static String calculateBuffer(String str) {
        char[] charArray = str.toCharArray();
        int bufferMinusStrLength = 68 - charArray.length;
        int leftBuffer = 0;
        int rightBuffer = 0;

        if (bufferMinusStrLength % 2 == 0) {
            leftBuffer = rightBuffer = (bufferMinusStrLength / 2);
        } else {
            int tempBuffer = (bufferMinusStrLength - 1) / 2;
            leftBuffer = tempBuffer + 1;
            rightBuffer = tempBuffer;
        }

        String result = String.format("|%%%ds%%s%%-%ds|\n", leftBuffer, rightBuffer);
        return result;
    }
}
