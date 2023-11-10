package developbeginner.abstractFactory.example.listfactory;

import developbeginner.abstractFactory.example.factory.Factory;
import developbeginner.abstractFactory.example.factory.Link;
import developbeginner.abstractFactory.example.factory.Page;
import developbeginner.abstractFactory.example.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
