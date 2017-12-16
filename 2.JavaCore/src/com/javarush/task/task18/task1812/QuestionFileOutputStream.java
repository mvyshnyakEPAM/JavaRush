package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    AmigoOutputStream decoratedStream;

    public QuestionFileOutputStream(AmigoOutputStream decoratedStream) {
        this.decoratedStream = decoratedStream;
    }


    @Override
    public void flush() throws IOException {
        decoratedStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        decoratedStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        decoratedStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        decoratedStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");

        if (reader.readLine().equals("Д"))
            decoratedStream.close();

    }
}

