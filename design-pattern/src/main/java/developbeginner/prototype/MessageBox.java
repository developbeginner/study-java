package developbeginner.prototype;

import developbeginner.prototype.framework.Product;

public class MessageBox implements Product {
    private char decoCharacter;

    public MessageBox(char decoCharacter) {
        this.decoCharacter = decoCharacter;
    }

    @Override
    public void use(String s) {
        int decoLength = s.length() + 2;
        for (int i = 0; i < decoLength; i++) {
            System.out.print(decoCharacter);
        }
        System.out.println();
        System.out.println(decoCharacter + s + decoCharacter);
        for (int i = 0; i < decoLength; i++) {
            System.out.print(decoCharacter);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
