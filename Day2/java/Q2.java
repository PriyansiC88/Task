class Student{
    int studentId;
    String studentName;
    char grade;

    public Student(int studentId,String studentName,char grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public void display(){
        System.out.println("Student Id: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Grade: "+grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"John",'A');
        student1.display();


    }
}