package com.company;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        try {


            FileInputStream f1 = new FileInputStream("src/hello.txt");
            FileOutputStream f2 = new FileOutputStream("src/hi.txt");
            BufferedInputStream bf1 = new BufferedInputStream(f1);
            BufferedOutputStream bf2 = new BufferedOutputStream(f2);

            DataInputStream dis = new DataInputStream(bf1);

            int data=0;
            while((data=bf1.read())!=-1){
                bf2.write(data);


            }
            bf2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
