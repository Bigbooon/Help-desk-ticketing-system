class SoftwareHandler implements SupportHandler {
    private SupportHandler successor;

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equals("Software")) {
            System.out.println("Software team is handling the request #"+ request.getId() + " : " + request.getDescription());
        } else if (successor != null) {
            successor.handleRequest(request);
        } else {
            System.out.println("No handler available for the request: " + request.getDescription());
        }
    }

    public void setSuccessor(SupportHandler successor) {
        this.successor = successor;
    }
}
