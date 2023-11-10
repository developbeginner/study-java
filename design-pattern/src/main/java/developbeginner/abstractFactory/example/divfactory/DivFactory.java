package developbeginner.abstractFactory.example.divfactory;

import developbeginner.abstractFactory.example.factory.Factory;
import developbeginner.abstractFactory.example.factory.Link;
import developbeginner.abstractFactory.example.factory.Page;
import developbeginner.abstractFactory.example.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
