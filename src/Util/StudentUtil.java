package Util;

import beans.Config;
import beans.Student;

import java.io.IOException;

public class StudentUtil {
    public static Student[] fillStudent(int n) {
        Student[] st = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ".Register");
            String name = InputUtil.requireName();
            String surname = InputUtil.requireSurname();
            String className = InputUtil.requireClassName();
            int age = InputUtil.requireAge();
            st[i] = new Student(name, surname, className, age);
        }


        return st;
    }

    public static void printAllStudents() throws Exception {
        if (Config.configStudent== null) {
            return;
        }


        for (int i = 0; i < Config.configStudent.length; i++) {
            Student st = Config.configStudent[i];
            System.out.println((i + 1) + ". " + st.getName() + " " + st.getSurname() + " " + st.getClassName() + " " + st.getAge());
        }
    }

    public static void findStudent() {
        int count = 0;
        String text = InputUtil.requireText("Enter the what do you search : ");


        for (int i = 0; i < Config.configStudent.length; i++) {
            Student st = Config.configStudent[i];
            if ((st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) ||
                    st.getName().equalsIgnoreCase(text) || st.getSurname().equalsIgnoreCase(text) || st.getClassName().equalsIgnoreCase(text)) {
                count++;
            }
        }
        if(count==0) {
            System.out.println("There is no Student in this name!!!");
            return;
        }

        Student[] result = new Student[count];

        int last = 0;

        for (int i = 0; i < Config.configStudent.length; i++) {
            Student st = Config.configStudent[i];

            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[last] = st;

                last++;
            }

        }


        for (int i = 0; i < count; i++) {
            System.out.println(result[i].getName() + " " + result[i].getSurname() + " " + result[i].getClassName());

        }
        System.out.println();

    }

    public static void registerStudents() throws Exception {
        int num = InputUtil.requireNumber("How many students will you register?");
        Config.configStudent = new Student[num];
        Config.configStudent = StudentUtil.fillStudent(num);
        InputUtil.completedOperation();

        for (int i = 0; i < num; i++) {

            FileUtil.writeObj(Config.configStudent[i],"data.txt");

        }

    }

    public static void updateStudentsWithStrArr() throws Exception {
        StudentUtil.printAllStudents();
        int index = InputUtil.requireNumber("Which student do you choose?");
        String parameters = InputUtil.requireText("What do you want to update?(name,surname,classname or age)");
        String[] arr = parameters.split(",");

        for (String s : arr) {
            if (s.equalsIgnoreCase("name")) {
                Config.configStudent[index - 1].setName(InputUtil.requireText("name :"));
            } else if (s.equalsIgnoreCase("surname")) {
                Config.configStudent[index - 1].setSurname(InputUtil.requireText("surname :"));
            } else if (s.equalsIgnoreCase("classname")) {
                Config.configStudent[index - 1].setClassName(InputUtil.requireText("classname :"));
            } else if (s.equalsIgnoreCase("age")) {
                Config.configStudent[index - 1].setAge(InputUtil.requireNumber("age :"));
            }
        }
        InputUtil.completedOperation();
    }


}
