package Programs;

public class ExampleStud {
    private int Roll;
    private String name;

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Roll No." + Roll);
        System.out.println("Name" + name);
    }
}
