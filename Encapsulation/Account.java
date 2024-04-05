package Encapsulation;

public class Account {
    private String name, email;
    private long Acc_no;
    private float amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAcc_no() {
        return Acc_no;
    }

    public void setAcc_no(long acc_no) {
        Acc_no = acc_no;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
