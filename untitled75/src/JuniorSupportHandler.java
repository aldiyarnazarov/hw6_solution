class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (next != null) {
            System.out.println("[JuniorSupport] Passed " + issue + " to next level");
            next.handle(issue);
        }
    }
}