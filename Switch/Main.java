package Switch;

public class Main {
    public static void main(String[] args) {
        char character = 'C';
        int num = 3;

        switch(character){
            case 'A' : System.out.println("A");
            break;
            case 'B' : System.out.println("B");
            break;
            case 'C' : System.out.println("C");
            break;
            default : System.out.println("Enter valid character");
            break;
        }

        switch(num){
            case 1 : System.out.println("1");
            break;
            case 2 : System.out.println("2");
            break;
            case 3 : System.out.println("3");
        }


    }
}
