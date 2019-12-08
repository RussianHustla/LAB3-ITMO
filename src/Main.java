public class Main {

    public static void main(String[] args) {
        //creating space

        Place BigKitchen = new Place("Большая кухня", "зачетная кухня, воняет только чем то...");

        //creating characters

        Adult Alice = new Adult("Алиса", 12, Gender.FEMALE);
        Adult Gertsoginya = new Adult("Герцогиня", 40, Gender.FEMALE,
                BigKitchen);
        Cooker Cooker = new Cooker("Повариха", 38, Gender.FEMALE, Grade.II, BigKitchen);
        Baby Baby = new Baby("Младенец", 1, Gender.MALE, BigKitchen);

        Actor[] actors = new Actor[]{Alice,Gertsoginya,Cooker,Baby};

        //action!

        Alice.interact("дверь","решительно распахнула");
        Alice.move(BigKitchen);
        Alice.inspectPlace();
        Gertsoginya.interact(Baby,"держит на коленях");
        Cooker.cook("суп", "перец", actors);
    }
}

