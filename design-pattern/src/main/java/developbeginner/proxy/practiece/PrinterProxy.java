package developbeginner.proxy.practiece;

import developbeginner.proxy.example.Printable;
import developbeginner.proxy.example.Printer;

public class PrinterProxy implements Printable {
    private String name;
    private Printable real;
    private String className;

    public PrinterProxy() {
        this.name = "No Name";
        this.real = null;
    }

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
        this.real = null;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable) Class.forName(className).getDeclaredConstructor().newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException e) {
                System.out.println(className + ".class not exist." );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
