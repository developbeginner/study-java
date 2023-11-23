package developbeginner.flyweight.practiece.answer1;

import developbeginner.flyweight.example.BigChar;
import developbeginner.flyweight.example.BigCharFactory;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        initShared(string);
    }

    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnshared(string);
        }
    }

    public void print() {
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }

    private void initShared(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigchar(string.charAt(i));
        }
    }

    private void initUnshared(String string) {
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = new BigChar(string.charAt(i));
        }
    }
}
