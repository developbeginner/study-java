package developbeginner.builder.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder tb = new TextBuilder();
            Director director = new Director(tb);
            director.construct();
            String result = tb.getTextResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder hb = new HTMLBuilder();
            Director director = new Director(hb);
            director.construct();
            String filename = hb.getHTMLResult();
            System.out.println("HTML파일 " + filename + "이 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text       텍스트로 문서 작성");
        System.out.println("Usage: java Main text       HTML 파일로 문서 작성");
    }
}
