package developbeginner.flyweight.practiece.answer2;

import developbeginner.flyweight.practiece.answer1.BigString;

public class Main {
    private static BigString[] bigStrings = new BigString[10000];

    public static void main(String[] args) {
        System.out.println("shared case");
        testAllocation(true);
        System.out.println("unshared case");
        testAllocation(false);
    }

    private static void testAllocation(boolean shared) {
        for (int i = 0; i < bigStrings.length; i++) {
            bigStrings[i] = new BigString("123123", shared);
        }
        showMemory();
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used Memory = " + usedMemory);
    }
}
