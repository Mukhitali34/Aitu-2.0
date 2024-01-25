public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 0;
    private int id;
    String name, surname;
    Person() {
        id = ++idCounter;
    }
    Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPosition() {
        return "";
    }

    public double getPaymentAmount(){
        return 0.00;
    }

    @Override
    public int compareTo(Person o) {
        return ;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
