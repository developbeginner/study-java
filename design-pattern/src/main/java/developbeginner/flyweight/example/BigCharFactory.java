package developbeginner.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String, BigChar> bigCharMap = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigchar(char charname) {
        BigChar bigChar = bigCharMap.get(String.valueOf(charname));
        if (bigChar == null) {
            bigChar = new BigChar(charname);
            bigCharMap.put(String.valueOf(charname), bigChar);
        }
        return bigChar;
    }
}
