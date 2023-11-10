package developbeginner.abstractFactory.problem.answer1;

import developbeginner.abstractFactory.example.factory.Page;

public class Main {
    public static void main(String[] args)  {
        if (args.length != 2) {
            System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
            System.out.println("Example1: java Main list.html listfactory.ListFactory");
            System.out.println("Example2: java Main div.html divfactory.DivFactory");
            System.exit(0);
        }

        String filename = args[0];
        String classname = args[1];

        Factory factory = Factory.getFactory(classname);
        Page page = factory.createNaverPage();
        page.output(filename);
    }
}
