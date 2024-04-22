package Lab06;

public class BankWorker extends Person {
    private String bankName;

    public BankWorker(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String display() {
        return "Bank worker:" + bankName + surname + name;
    }
}

