abstract class Cat extends Actor{
    int age;
    Place place;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    abstract void move(Place place);
    abstract void meow();
}
