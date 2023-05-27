package Util;

public class Menu {
    public static void menuOperation() throws Exception{
        while (true) {
            int menu = InputUtil.requireNumber("""
                     What do you want to do?
                    1.Register Student
                    2.Show all Student
                    3.Find Student
                    4.Update Student information
                    5.Exit the System
                    """);

            switch (menu) {
                case 1 -> StudentUtil.registerStudents();
                case 2 -> StudentUtil.printAllStudents();
                case 3 -> StudentUtil.findStudent();
                case 4 -> StudentUtil.updateStudentsWithStrArr();
                case 5 -> System.exit(0);
            }
            System.out.println("---------------------------------------------------");
        }
    }
}
