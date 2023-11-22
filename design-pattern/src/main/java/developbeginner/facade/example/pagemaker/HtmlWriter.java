package developbeginner.facade.example.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void writeTitle(String title) throws IOException {
        writer.write("<!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" + title + "</h1>");
        writer.write("\n");
    }

    public void writeParagraph(String message) throws IOException {
        writer.write("<p>" + message + "</p>");
        writer.write("\n");
    }

    public void writeLink(String href, String caption) throws IOException {
        writeParagraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void writeEmailAddress(String mailAddress, String username) throws IOException {
        writeLink("mail to: " + mailAddress, username);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.write("\n");
        writer.close();
    }
}
