package developbeginner.facade.example.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailAddress, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailAddress);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.writeTitle(username + "'s web page");
            writer.writeParagraph("Welcome to " + username + "'s web page!");
            writer.writeParagraph("Nice to meet you!");
            writer.writeEmailAddress(mailAddress, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddress + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
