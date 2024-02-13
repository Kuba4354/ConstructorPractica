import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateofbrith;
    String phoneNumber;
    String nationality;

    public Student() {

    }


    public Student(String name, LocalDate dateofbrith, String phoneNumber, String nationality) {
        this.name = name;
        this.dateofbrith = dateofbrith;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateofbrith=" + dateofbrith +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}


