package developbeginner.singleton.problem;

public class TicketMakerMain {
    public static void main(String[] args) {
        System.out.println("ticket counting program started...");

        TicketMaker ticketMaker = TicketMaker.getInstance();
        System.out.println(ticketMaker.getNextTicketNumber());
        System.out.println(ticketMaker.getNextTicketNumber());
        System.out.println(ticketMaker.getNextTicketNumber());

        System.out.println("ticket counting program ended...");
    }
}
