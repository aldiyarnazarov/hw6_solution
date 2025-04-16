abstract class SupportHandler {
    protected SupportHandler next;

    public SupportHandler setNext(SupportHandler nextHandler) {
        this.next = nextHandler;
        return nextHandler;
    }

    public abstract void handle(String issue);
}
