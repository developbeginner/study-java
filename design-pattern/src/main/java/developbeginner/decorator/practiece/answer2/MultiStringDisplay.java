package developbeginner.decorator.practiece.answer2;

import developbeginner.decorator.example.Display;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> list = new ArrayList<>();
    private int columns = 0;

    public void add(String string) {
        list.add(string);
        if (columns < string.length()) {
            columns = string.length();
        }
        updatePadding();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        return list.get(row);
    }

    private void updatePadding() {
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);
            int padding = columns - line.length();
            if (padding > 0) {
                list.set(i, line + makeSpace(padding));
            }
        }
    }

    private String makeSpace(int count) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < count; i++) {
            spaces.append(' ');
        }
        return spaces.toString();
    }
}
