import java.util.ArrayList;

class School {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public void displayStudents() {
        for (Student student : students) {
            student.getDetails();
            System.out.println();
        }
    }
    
    public void displayTeachers() {
        for (Teacher teacher : teachers) {
            teacher.getDetails();
            System.out.println();
        }
    }
    
    public Student searchStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println("Student Found: ");
                student.getDetails();
                return student;
            }
        }
        throw new StudentNotFoundException("Student with ID /'" + studentId + "/' not found.");
    }
    
    public Teacher searchTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                System.out.println("Teacher Found: ");
                teacher.getDetails();
                return teacher;
            }
        }
        throw new TeacherNotFoundException("Teacher not found.");
    }
}