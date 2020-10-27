package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //ObjectInputStream and ObjectOutputStream

//        Customer c1 = new Customer(1L,"m","123",new Date(),12.0,15.0,new Date(),5.0);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/objectFile.txt"));
//        objectOutputStream.writeObject(c1);
//
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/objectFile.txt"));
//        Customer c2 = (Customer)objectInputStream.readObject();
//        System.out.println(c2);


        //DataInputStream and DataOutputStream
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/primitiveFile.txt"));
        dataOutputStream.writeInt(5);
        dataOutputStream.writeChars("HI Hello");

        dataOutputStream.close();

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/primitiveFile.txt"));



//        System.out.println(dataInputStream.readInt());
//
//        System.out.println(dataInputStream.readChar());

//        byte[] byteArr = new byte[10];
//        dataInputStream.read(byteArr,0,9);
//        System.out.println(Arrays.toString(byteArr));
//        dataInputStream.close();





    }
}
