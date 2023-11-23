public class Main {
    public static void main(String[] args) {
        HardwareHandler hardwareHandler = new HardwareHandler();
        SoftwareHandler softwareHandler = new SoftwareHandler();
        NetworkHandler networkHandler = new NetworkHandler();

        hardwareHandler.setSuccessor(softwareHandler);
        softwareHandler.setSuccessor(networkHandler);

        SupportRequest request1 = new SupportRequest("Hardware", "Mouse is not working", "High");
        SupportRequest request2 = new SupportRequest("Software", "Application is quganski", "Medium");
        SupportRequest request3 = new SupportRequest("Network", "Internet connection issues", "Low");

        hardwareHandler.handleRequest(request1);
        hardwareHandler.handleRequest(request2);
        hardwareHandler.handleRequest(request3);
    }
}