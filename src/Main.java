import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Kuba";
        student.dateofbrith = LocalDate.of(2006, 8, 17);
        student.nationality = "Kyrgyz";
        student.phoneNumber = "0226 43 54 63";

        System.out.println(student.name + "\n" + student.dateofbrith + "\n" +
                student.nationality + "\n" + student.phoneNumber);
        System.out.println(" ");

        Student student2 = new Student();
        student2.name = "Musa";
        student2.dateofbrith = LocalDate.of(2007, 07, 16);
        student2.nationality = "Kyrgyz";
        student2.phoneNumber = "0226 43 76 12 ";
        System.out.println(student2.name + "\n" + student2.dateofbrith + "\n" +
                student2.nationality + "\n" + student2.phoneNumber);
        System.out.println(" ");


        Student student3 = new Student();
        student3.name = "Eldiyar";
        student3.dateofbrith = LocalDate.of(2008, 07, 15);
        student3.nationality = "Kyrgyz";
        student3.phoneNumber = "0226 98 68 45";
        System.out.println(student3.name + "\n" + student3.dateofbrith + "\n" +
                student3.nationality + "\n" + student3.phoneNumber);

        System.out.println(" ");

        Student student4 = new Student();
        student4.name = "Muxa";
        student4.dateofbrith = LocalDate.of(1998, 04, 26);
        student4.nationality = "Kyrgyz";
        student4.phoneNumber = "0226 12 32 54 ";
        System.out.println(student4.name + "\n" + student4.dateofbrith + "\n" +
                student4.nationality + "\n" + student4.phoneNumber);
        System.out.println(" ");


        Student student5 = new Student();
        student5.name = "Ulan ";
        student5.dateofbrith = LocalDate.of(2000, 02, 16);
        student5.nationality = "Kyrgyz";
        student5.phoneNumber = "0226 55 65 41 ";
        System.out.println(student5.name + "\n" + student5.dateofbrith + "\n" +
                student5.nationality + "\n" + student5.phoneNumber);
        System.out.println(" ");

        Student[] students = new Student[]{student, student2, student3, student4, student5};
       for (Student name: students){
           System.out.println(name);
       }

    }
}