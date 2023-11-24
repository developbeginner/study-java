package developbeginner.proxy.practiece;

import developbeginner.proxy.example.Printable;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "Printer");
        System.out.println("printer name is " + p.getPrinterName() + ".");
        p.setPrinterName("Bob");
        System.out.println("printer name is " + p.getPrinterName() + ".");
        p.print("Hello World");
    }
}
