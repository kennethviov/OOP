abstract class Person {
    protected String name;
    protected int age;
    
    public abstract void getDetails();
}

class Student extends Person {
    private String studentId;
    private double grade;
    
    public Student(String name, int age, String studentId, double grade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }
    
    @Override
    public void getDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Grade: " + this.grade);
    }
    
    // getters
    public String getStudentId() {
        return studentId;
    }
}

class Teacher extends Person {
    private String teacherId;
    private String subject;
    
    public Teacher(String name, int age, String teacherId, String subject) {
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
        this.subject = subject;
    }
    
    @Override
    public void getDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Teacher ID: " + this.teacherId);
        System.out.println("Subject: " + this.subject);
    }
    
    // getter
    public String getTeacherId() {
        return teacherId;
    }
}