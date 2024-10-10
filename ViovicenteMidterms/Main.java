public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("Alice", 20, "S001", 1.5));
        school.addStudent(new Student("Bob", 21, "S002", 1.8));
        school.addTeacher(new Teacher("Mr. Smith", 40, "T001", "Math"));
        school.addTeacher(new Teacher("Ms. Johnson", 35, "T002", "History"));
        
        
        //case 1
        System.out.println("Case 1");
        school.displayStudents();
        
        
        
        //case 2
        school.addStudent(new Student("Quibs", 21, "S003", 2.0));
        school.displayStudents();
        
        
        
        //case 3
        try {
            school.searchStudent("S001");
        } catch (StudentNotFoundException e) {
            e.getMessage();
        }
        
        
        
        //case 4
        try {
            school.searchStudent("S004");
        } catch (StudentNotFoundException e) {
            e.getMessage();
        }
        
        
       
        //case 5
        school.displayTeachers();
        
        
        
        //case 6
        school.addTeacher(new Teacher("Mr. Brown", 50, "T003", "Physics"));
        school.displayTeachers();
        
        
        
        //case 7
        try {
            school.searchTeacher("T001");
        } catch (TeacherNotFoundException e) {
            e.getMessage();
        }
       
        
        //case 8
        try {
            school.searchTeacher("T004");
        } catch (TeacherNotFoundException e) {
            e.getMessage();
        }
    }
}