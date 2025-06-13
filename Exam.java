public class Exam extends Subject {
    private String date;

    public Exam(String subname, String date) {
        super(subname);
        this.date = date;
    }

    public String getdate() {
        return date;
    }
}
