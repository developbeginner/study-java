/**
 * 문제 5-1
 * TicketMaker 클래스는 getNextTicketNumber 메소드를 호출할 때마다 ticket 개수를 1씩 증가시킨다.
 * Singleton 패턴을 적용하여 하나의 인스턴스만 만들어지도록 변경하라.
 */

package developbeginner.singleton.problem;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private int ticket = 1000;

    private TicketMaker() {}

    /**
     * Ticket을 1씩 증가시키는 동기화 메소드.
     * @return
     */
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    /**
     * 외부에 정적 TicketMaker 인스턴스를 반환한다.
     * @return
     *      정적 TicketMaker 인스턴스
     */
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}
