package exerciciosPOO_02.entities;

public class Bank {
    private int id;
    private String name;
    private double balance;

    public Bank() {
    }
    public Bank(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }

    public void removeBalance(double balance) {
        this.balance -= balance + 5;
    }

    public String toString() {
        return "Account "
                + id
                + ", "
                + name
                + ", "
                + "Balance: "
                + "$ "
                + balance;
    }
}
