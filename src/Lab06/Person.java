package Lab06;

abstract class Person {
    protected String name;
    protected String surname;

    public Person(String name, String Surname) {
        this.name = name;
        this.surname = Surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    abstract String display();
}
// Can be transformed to interface with standart variables and methods