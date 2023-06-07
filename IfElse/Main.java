package IfElse;

public class Main {
    public static void main(String[] args) {
        boolean start = false;
        int age = 18;
        char c = 'T';

        if(start == true){
            System.out.println("The program has started");
        }else{
            System.out.println("Program hasn't started");
        }

        if(age < 16){
            System.out.println("Young");
        }else if(age>=16 && age < 24){
            System.out.println("Youngblood");
        }else{
            System.out.println("Elder");
        }
        
        System.out.println(18<20 ? "18 is smaller than 20" : "18 is not smaller than 20");
    }
}
