package streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question16 {
    public static void main(String[] args) {
        List<Transaction> transctions=List.of(
                new Transaction("deposit", 100.0),
                new Transaction("withdrawal", 50.0),
                new Transaction("deposit", 200.0),
                new Transaction("transfer", 150.0)
        );
        //Given a list of transactions, filter out transactions of a specific type and collect them into a set
        transctions.stream().filter(t-> t.getName().equals("deposit"))
                .collect(Collectors.toSet())
                .forEach(t-> System.out.println(t.getName()+"="+t.getAmount()));

    }
}
class Transaction{
    private String name;
    private double amount;

    public Transaction(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
