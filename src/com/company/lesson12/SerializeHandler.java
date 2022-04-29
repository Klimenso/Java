package com.company.lesson12;

import java.io.*;

public class SerializeHandler {

        public static <T> void serialize(String fileName, T o) throws IOException {
                ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream(fileName));
                fos.writeObject(o);
        }

        public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
                ObjectInputStream fis = new ObjectInputStream(new FileInputStream(fileName));
                return fis.readObject();
        }
}
