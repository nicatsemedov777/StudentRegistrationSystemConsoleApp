package Util;

import java.io.*;

public class FileUtil {
    public static void writeObj (Object ob,String fileName) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(ob);
        objectOut.close();
        System.out.println("The Object  was succesfully written to a file");


    }
    public static Object readObj(String fileName) throws Exception {
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        Object obj = objectIn.readObject();
        System.out.println("The Object has been read from the file");
        objectIn.close();
        return obj;
    }
}
