import static java.lang.Math.random;

public class Cooker extends Human implements Telling{
    private Grade grade;
    private String lastDish = null;

    @Override
    void move(Place place) {
        System.out.println(getName() + " перемещается пешком на локацию " + place.getName());
        this.place = place;
    }

    @Override
    public void sniff(String smthng) {
        if(smthng != null){
            System.out.println(name + " чует " + smthng + "!");
        }
        else {
            System.out.println(name + " ничего не чует");
        }
    }

    public void tell(String phrase){
        System.out.println(name + ": \"" + phrase + "\"");
    }

    void cook(String dish, String spice, Actor[] actors) {
        System.out.println(name + " готовит " + dish);
        System.out.println("На локации " + place.getName() + " дым стоит коромыслом!");
        System.out.println(name + " добавляет " + spice + " в " + dish);
        boolean fail = false;
        if (random() > getAccuracy()) {
            System.out.println(name + " просыпает " + spice);
            tell("лять!");
            setCond(Condition.NEGATIVE);
            fail = true;
        }
        System.out.println("Блюдо " + dish + " готово!");
        for (Actor actor : actors) {
            if (actor.getPlace().equals(place)){
                actor.sniff(dish);
                if(fail) actor.sniff(spice);
            }
        }
    }

    void cook(String dish, Actor[] actors) {
        System.out.println(name + " готовит " + dish);
        System.out.println("На локации " + place.getName() + " дым стоит коромыслом!");
        System.out.println("Блюдо " + dish + " готово!");
        for (Actor actor : actors) {
            if (actor.getPlace().equals(place)){
                actor.sniff(dish);
            }
        }
    }

    void feed(String target, String dish) {
        System.out.println(name + " кормит " + target + " блюдом " + dish);
    }

    public Cooker(String name, int age, Gender gender, Grade grade, Place place) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.place = place;
        this.grade = grade;
        this.noOfObjects++;
        System.out.println("Создан повар по имени " + name + " " +
                grade + " разряда " + " с возрастом " + age + " гендера " + gender +
                " находящийся в месте " + place.getName());
    }
    public Cooker(String name, int age, Gender gender, Grade grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.noOfObjects++;
        System.out.println("Создан повар по имени " + name + " " + grade + " разряда " +
                " с возрастом " + age + " гендера " + gender);
    }
    public Cooker(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.noOfObjects++;
        System.out.println("Создан повар по имени " + name + " с возрастом " + age + " гендера " + gender);
    }
    public Cooker(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.noOfObjects++;
        System.out.println("Создан повар по имени " + name + " гендера " + gender);
    }
    public Cooker() {
        this.noOfObjects++;
        System.out.println("Создан безликий повар");
    }
    //getters
    public String getLastDish() {
        return lastDish;
    }
    public Grade getGrade() {
        return grade;
    }
    public double getAccuracy() {
        switch (grade) {
            case II: return 0.5;
            case III: return 0.65;
            case IV: return 0.72;
            case V: return 0.8;
            case VI: return 0.95;
        }
        return 0;
    }
}
