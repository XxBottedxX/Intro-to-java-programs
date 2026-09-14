package School;
//Ethan Noah Ravasco
//Section 001


public class SongOld {

    public static void main(String[] args) {
        first("cat");
        second("cat");  
        noise("Cat", "meow ");
        space();
        first("hen");
        second("hen");
        noise("Hen", "chimmy-chuck ");
        noise("Cat", "meow ");
        space();    
        first("duck");
        second("duck");
        noise("Duck", "quack");
        noise("Hen", "chimmy-chuck ");
        noise("Cat", "meow ");
        space();
        first("goose");
        second("goose");
        noise("Goose", "hissy");
        noise("Duck", "quack");
        noise("Hen", "chimmy-chuck ");
        noise("Cat", "meow ");
        space();
        first("sheep");
        second("sheep");
        noise("Sheep", "baa");
        noise("Goose", "hissy");
        noise("Duck", "quack");
        noise("Hen", "chimmy-chuck ");
        noise("Cat", "meow ");
        space();
        first("pig");
        second("pig");
        noise("Pig", "oink");
        noise("Sheep", "baa");
        noise("Goose", "hissy");
        noise("Duck", "quack");
        noise("Hen", "chimmy-chuck ");
        noise("Cat", "meow ");

    }
    //Method to call for the first sentence to call and enter new animal names
    public static void first(String name) {

        System.out.println("Bought me a " + name + " and the " + name + " pleased me,");
    }
    //Same thing as the first method 
    public static void second(String name) {
        System.out.println("I fed my " + name + " under yonder tree.");
        
    }
    //Method to call for the animal noises and enter new animal names and their respective noises
    public static void noise(String name, String sound) {
        System.out.println(name + " goes " + sound + sound);
    }
    //Method to create a space between the verses
    public static void space() {
        System.out.println(); 
    }
}














