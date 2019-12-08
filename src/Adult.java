public class Adult extends Human implements Telling {

    @Override
    void move(Place place) {
        System.out.println(getName() + " идет на локацию " + place.getName());
        this.place = place;
    }

    @Override
     public void sniff(String smthng) {
        if(smthng != null && smthng != "перец"){
            System.out.println(name + " чует " + smthng + "!");
        }
        else if(smthng == "перец") {
            System.out.println(name + " чует " + smthng + "!");
            setCond(Condition.SNEEZE);
            showCond();
        }
        else {
            System.out.println(name + " ничего не чует");
        }
    }

    public void tell(String phrase){
        System.out.println(name + ": \"" + phrase + "\"");
    }

    public Adult(String name, int age, Gender gender, Place place) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.place = place;
        this.noOfObjects++;
        System.out.println("Создан взрослый человек по имени " + name + " с возрастом " + age + " гендера " + gender + " находящийся в месте " + place.getName());
    }
    public Adult(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.noOfObjects++;
        System.out.println("Создан взрослый человек по имени " + name + " с возрастом " + age + " гендера " + gender);
    }
    public Adult(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.noOfObjects++;
        System.out.println("Создан взрослый человек по имени " + name + " гендера " + gender);
    }
    public Adult() {
        this.noOfObjects++;
        System.out.println("Создан безликий взрослый человек");
    }

}
