public class Greeter {
    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void greet() {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Hello, stranger!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
    public static void main(String[] args) {
        // Example usage: change the name as needed
        Greeter greeter = new Greeter("John");
        greeter.greet();
    }
}