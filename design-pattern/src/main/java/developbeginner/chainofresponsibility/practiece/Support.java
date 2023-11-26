package developbeginner.chainofresponsibility.practiece;

import developbeginner.chainofresponsibility.example.Trouble;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public void support(Trouble trouble) {
        for (Support support = this; true; support = support.next) {
            if (support.resolve(trouble)) {
                support.done(trouble);
                break;
            } else if (support.next == null) {
                support.fail(trouble);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + "is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
