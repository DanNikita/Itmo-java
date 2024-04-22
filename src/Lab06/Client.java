package Lab06;

public class Client extends Person {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String display() {
        return "Client of bank" + bankName + surname + name;
    }
}
