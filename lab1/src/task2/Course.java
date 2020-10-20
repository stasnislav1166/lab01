package task2;

import java.util.ArrayList;

public class Course {
    private String title;
    private String description;
    private Student[] students;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public ArrayList<Student> filterStudent(int a) {
        ArrayList<Student> listStudenti = new ArrayList<>();

        for (Student student : students) {
            if (student.getYear() == a) {
                listStudenti.add(student);
            }
        }
        return listStudenti;
    }

}
