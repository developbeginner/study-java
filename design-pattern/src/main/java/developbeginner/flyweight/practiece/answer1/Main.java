package developbeginner.flyweight.practiece.answer1;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 123123");
            System.exit(0);
        }

        BigString bigString;
        bigString = new BigString(args[0], false);
        bigString.print();
        bigString = new BigString(args[0], true);
        bigString.print();
    }
}
