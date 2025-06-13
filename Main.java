public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Tom", "Davis", "555/55");
        System.out.println(student1.getStudentInfo());

        System.out.println("---");

        Subject subject1 = new Subject("Programming");
        System.out.println("Subject name: " + subgect1.getsubname());

        System.out.println("---");

        
        Exam exam1 = new Exam("Databases", "2025-06-15");
        System.out.println("Subject exam: " + exam1.getsubname());
        System.out.println("Date of exam: " + exam1.getdate());

        Exam exam2 = new Exam("Mathematics", "2025-07-01");
        System.out.println("Subject exam: " + exam2.getsubname());
        System.out.println("Date of exam: " + exam2.getdate());
    }
}
