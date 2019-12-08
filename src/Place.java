public class Place {
    private String name;
    private String description;

    public Place(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Создана локация " + name + ", описание: " + description);
    }

    public Place(String name) {
        this.name = name;
        System.out.println("Создана локация " + name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}
