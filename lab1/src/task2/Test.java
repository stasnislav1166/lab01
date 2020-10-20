package task2;

public class Test {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    Course course = getCourse();

    task2(course, a);
    task3();
}

    private static Course getCourse() {
        Student student1 = new Student();

        student1.setName("Veronica");
        student1.setYear(2000);

        Student student2 = new Student();
        student2.setName("Cristina");
        student2.setYear(1999);

        Student student3 = new Student();
        student3.setName("Ion");
        student3.setYear(2000);

        Student[] students = {student1, student2, student3};

        Course course = new Course();
        course.setTitle("POO");
        course.setDescription("Interesant");
        course.setStudents(students);

        return course;
    }

    private static void task2(Course course, int year) {
        System.out.println(course.filterStudent(year));
    }

    private static void task3() {

        Student student1 = new Student();
        student1.setName("Veronica");
        student1.setYear(2000);

        Student student2 = new Student();
        student2.setName("Veronica");
        student2.setYear(2000);

        System.out.println(student1.equals(student2));
    }

}
