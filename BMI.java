import java.util.*;
class BMI{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter height and weight of a person");
        float ht = sc.nextFloat();
        float wt = sc.nextFloat();
        sc.close();
        float BMI = wt/ht*ht;
        if(BMI < 18.5){
            System.out.println("Under Weight:");
        }
        else if(BMI > 25){
            System.out.println("Over Weight:");
        }
        else{
            System.out.println("Average:");
        }
    }
}

