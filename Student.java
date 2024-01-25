public class Student extends Person {
    double gpa;
    Student() {
        super();
    }
    Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    public int getId() {
        return super.getId();
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public String getPosition() {
        return "";
    }
    public double  getPaymentAmount(){
        if (gpa > 2.67)
            return 36660.00;
        return 0.00;
    }

    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() + ' ' + getSurname() + " earns " + getPaymentAmount() + " tenge";
    }
}
