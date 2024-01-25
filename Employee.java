public class Employee extends Person {
    String position;
    double salary;
    Employee() {
        super();
    }
    Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public int getId(){
        return super.getId();
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double  getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getId() + ". " + getName() + ' ' + getSurname() + " earns " + getPaymentAmount() + " tenge";
    }
}
