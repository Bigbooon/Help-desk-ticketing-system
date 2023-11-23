class SupportRequest {
    private static int nextId = 1; // Static variable to generate unique IDs
    private int id;
    private String type;
    private String description;
    private String priority;

    public SupportRequest(String type, String description, String priority) {
        this.id = nextId++;
        this.type = type;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }
}
