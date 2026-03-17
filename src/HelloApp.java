public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = String.join(", ", args);
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
