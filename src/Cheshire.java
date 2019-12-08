public class Cheshire extends Cat implements Telling, ICondition{
    private Condition cond = Condition.SMILE;

    @Override
    void move(Place place) {
        System.out.println(name + " идет на локацию " + place.getName());
        this.place = place;
    }

    @Override
    void meow() {
        System.out.println("Meow!");
    }
    public void sniff(String smthng) {
        if(smthng != null){
            System.out.println(name + " чует " + smthng + "!");
        }
        else {
            System.out.println(name + " ничего не чует");
        }
    }

    @Override
    void inspectPlace(){
        System.out.println(name + " осматривает место " + place.getName());
        setCond(Condition.INTERESTED);
        showCond();
        if(place.getDescription() != null) System.out.println(name + " получает информацию о месте: " + place.getDescription());
    }

    @Override
    void interact(String smthng,String discr) {
        System.out.println(name + " взаимодействует с " + smthng + "(" + discr + ")");
    }

    @Override
    void interact(Human smthng, String discr) {
        System.out.println(name + " взаимодействует с " + smthng.getName() + "(" + discr + ")");
    }

    public void tell(String phrase){
        System.out.println(name + ": \"" + phrase + "\"");
    }

    public void showCond(){

    }
    void setCond(Condition cond) {
        this.cond = cond;
    }
    Condition getCond() {
        return cond;
    }

    public Cheshire(String name, int age, Place place) {
        this.name = name;
        this.age = age;
        this.place = place;
        System.out.println("Создан Чеширский Кот по имени " + name + " с возрастом " + age + " находящийся в месте " + place.getName());
    }
    public Cheshire(Place place) {
        this.name = "Чеширский Кот";
        this.place = place;
        System.out.println("Создан Чеширский Кот" + " находящийся в месте " + place.getName());
    }
}
