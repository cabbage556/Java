package Volume1.chapter12;

public class StudentManager {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        // Student[] students = manager.addStudent();
        // manager.printStudents(students);
        manager.checkEquals();  // Equal
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010xxxxyyyy", "ask@godofjava.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");

        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
