package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        boolean isFileEx = false;
        do {
            try {
                InputStream fileInputStream = getInputStream(sourceFileName);
                OutputStream fileOutputStream = getOutputStream(destinationFileName);

                isFileEx = true;

                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    fileOutputStream.write(data);
                }

                fileInputStream.close();
                fileOutputStream.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
                destinationFileName = reader.readLine();
            }
        }
        while (!isFileEx);
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

