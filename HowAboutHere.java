package School;
    public class HowAboutHere {
        public static void inc(int x) {
            x = x + 1;
            System.out.println(x);

        }
        
        public static void main(String [] args) {
            int x = 10;
            inc(x);
            System.out.println(x);
        }
    }
    