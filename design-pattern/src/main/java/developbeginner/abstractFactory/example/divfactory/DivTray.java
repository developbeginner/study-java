package developbeginner.abstractFactory.example.divfactory;

import developbeginner.abstractFactory.example.factory.Item;
import developbeginner.abstractFactory.example.factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>");
        sb.append(caption);
        sb.append("</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for (Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }

    @Override
    public void add(Item item) {
        super.add(item);
    }
}
