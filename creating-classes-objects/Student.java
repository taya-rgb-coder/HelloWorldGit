public class Student {
    private String name;
    private String surname;
    private String index;

    public Student (String name, String surname, String index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }

    public String get StudentInfo() {
        return "Student: " + this.name + " " + this.surname + " " + this.index;
    }

    public void informationStudent () {
        System.out.println ("Student:" + name + surname + index);
    }
}

