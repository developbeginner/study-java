package developbeginner.singleton.problem.answer2;

public class TripleMain {
    public static void main(String[] args) {
        System.out.println("multi singleton program started...");

        Triple alpha = Triple.getInstance("ALPHA");
        Triple beta = Triple.getInstance("BETA");
        Triple gamma = Triple.getInstance("GAMMA");

        System.out.println("multi singleton program ended...");
    }
}
