package developbeginner.factory.idcard;

import developbeginner.factory.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("Creating " + owner + "'s Card.");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("use " + this);
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
