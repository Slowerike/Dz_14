import java.io.Serializable;

public class Student  implements Serializable {
    public String name;
    public String faculty;
    public double averageScore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }

    public Student(String name, String faculty, double averageScore) {
        this.name = name;
        this.faculty = faculty;
        this.averageScore = averageScore;
    }
}
