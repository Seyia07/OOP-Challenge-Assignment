public class Variable {
    private int value;

    public Variable() {
        this.value = 0;
    }

    public Variable(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Variable var = new Variable(100);
        System.out.println("Initial value: " + var.getValue());

        var.setValue(200);
        System.out.println("Updated value: " + var.getValue());
    }
}