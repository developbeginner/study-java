package developbeginner.prototype;

import developbeginner.prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulCharacter;

    public UnderlinePen(char ulCharacter) {
        this.ulCharacter = ulCharacter;
    }

    @Override
    public void use(String s) {
        int ulLength = s.length();
        System.out.println(s);
        for (int i = 0; i < ulLength; i++) {
            System.out.print(ulCharacter);
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
