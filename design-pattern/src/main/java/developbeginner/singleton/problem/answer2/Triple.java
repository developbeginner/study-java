/**
 * 문제 5-2
 * 인스턴스 수를 3개로 제한하는 Triple 클래스를 만드시오.
 * 인스턴스는 "ALPHA", "BETA", "GAMMA" 이름을 갖고 있으며, getInstance(name)으로 name의 인스턴스를 가져올 수 있다.
 */

package developbeginner.singleton.problem.answer2;

public class Triple {
    private static Triple ALPHA = new Triple();
    private static Triple BETA = new Triple();
    private static Triple GAMMA = new Triple();

    public static Triple getInstance(String name) {
        if (name.equals("ALPHA")) {
            System.out.println("this is ALPHA object");
            return ALPHA;
        }
        if (name.equals("BETA")) {
            System.out.println("this is BETA object");
            return BETA;
        }
        if (name.equals("GAMMA")) {
            System.out.println("this is GAMMA object");
            return GAMMA;
        }
        return null;
    }
}
