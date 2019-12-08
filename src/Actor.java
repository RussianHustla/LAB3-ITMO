abstract class Actor {
    String name;
    Place place;

    abstract void interact(String smthng,String discr);
    abstract void interact(Human smthng, String discr);
    abstract void inspectPlace();
    abstract void sniff(String dish);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
