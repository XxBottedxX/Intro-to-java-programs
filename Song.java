package School;
//Ethan Noah Ravasco
//Section 001



public class Song {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
        verse6();
    }

    public static void verse1() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
        catSound();
        System.out.println();
    }


    public static void verse2() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
        henSound();
        System.out.println();
    }

    public static void verse3() {
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
        duckSound();
        System.out.println();
    }

    public static void verse4() {
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
        gooseSound();
        System.out.println();
    }

    public static void verse5() {
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed my sheep under yonder tree.");
        sheepSound();
        System.out.println();
    }

    public static void verse6() {
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed my pig under yonder tree.");
        pigSound();
    }

    public static void catSound() {
        System.out.println("Cat goes fiddle-i-fee.");
    }

    public static void henSound() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
        catSound();
    }

    public static void duckSound() {
        System.out.println("Duck goes quack, quack,");
        henSound();
    }

    public static void gooseSound() {
        System.out.println("Goose goes hissy, hissy,");
        duckSound();
    }

    public static void sheepSound() {
        System.out.println("Sheep goes baa, baa,");
        gooseSound();
    }

    public static void pigSound() {
        System.out.println("Pig goes oink, oink,");
        sheepSound();
    }
}
