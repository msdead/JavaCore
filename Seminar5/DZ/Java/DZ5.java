import java.util.*;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DZ5 {


    public static List<Student> students = new ArrayList<Student>();


    static {
        students.add(new Student("Иван","Информатика" ));
        students.add(new Student("Петр", "Физика"));
        students.add(new Student("Дарья", "Информатика"));
        students.add(new Student("Павел", "Биология"));
        students.add(new Student("Михаил", "Информатика"));

        students.add(new Student("Тимофей","Физика" ));
        students.add(new Student("Азамат", "Физкультура"));
        students.add(new Student("Наташа", "Биология"));
        students.add(new Student("Сергей", "Информатика"));
        students.add(new Student("Милана", "Информатика"));

        students.add(new Student("Роман","Физкультура" ));
        students.add(new Student("Екатерина", "Физика"));
        students.add(new Student("Надежда", "Информатика"));
        students.add(new Student("Александр", "Биология"));
        students.add(new Student("Александра", "Информатика"));
    }
    private static double getAverage(List<Double> list) {
        return list.stream()
                .mapToDouble(a -> a)
                .average().orElse(0);
    }
    public static void main(String[] args) {

        for (Student student: students) {
            student.setRandomGrade();
            double average = getAverage(student.getListGrade());
            student.setGrade(average);
        }

        System.out.println(students);

        List<Student> sortedStudent = students.stream().
                filter(student -> student.getSpecialty() == "Информатика")
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .limit(5).collect(Collectors.toList());

        System.out.println(sortedStudent);

    }
}



