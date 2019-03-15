package com.gpedu.practice.designmode.singleton.test;

import com.gpedu.practice.designmode.singleton.SerializableSingleTon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Heavin on 2019/3/15.
 * Des
 */
public class SerializableSingleTonTest {

    public static void main(String[] args) {
        SerializableSingleTon serializableSingleTon1 = null;
        SerializableSingleTon serializableSingleTon2 = SerializableSingleTon.getInstance();

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("SerializableSingleTon.obj");
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(fos);
            objectOutputStream.writeObject(serializableSingleTon2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fis = new FileInputStream("SerializableSingleTon.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            serializableSingleTon1 = (SerializableSingleTon) ois.readObject();
            ois.close();

            System.out.println(serializableSingleTon1);
            System.out.println(serializableSingleTon2);



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
