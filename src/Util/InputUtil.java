package Util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);

        return sc.nextLine();
    }

    public static int requireNumber(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextInt();
    }
    public static String requireName(){
        return requireText("Enter Name :");
    }
    public static String requireSurname(){
        return requireText("Enter Surname :");
    }
    public static String requireClassName(){
        return requireText("Enter ClassName :");
    }
    public static int requireAge(){
        return requireNumber("Enter Age :");
    }
    public static void completedOperation(){
        System.out.println("Registration system completed successfully");
    }



}
