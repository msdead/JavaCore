import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Student {
    private  String name;
    private List<Double> gradeArray;

    private Double grade;

    private  String specialty;

    Student(String name, List<Double> grades, Double grade, String specialty){
        this.name = name;
        this.gradeArray = new ArrayList<>();
        this.grade = grade;
        this.specialty = specialty;
    }

    Student(String name, String specialty){
        this.name = name;
        this.gradeArray = new ArrayList<>();
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<Double> getListGrade() {
        return gradeArray;
    }

    public Double getGrade() {
        return grade;
    }

    public Double setGrade(Double x){
        return this.grade = x;
    }

    public List<Double> setRandomGrade() {
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            double x = ran.nextInt(1,10);

            gradeArray.add(x);
        }
        return gradeArray;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                ", Оценки = " + gradeArray +
                ", Средняя оценка = " + grade +
                ", Специальность = " + specialty + '\n';
    }

}
