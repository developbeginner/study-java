package developbeginner.factory.example.idcard;

import developbeginner.factory.example.framework.Factory;
import developbeginner.factory.example.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + " registered");
    }
}
