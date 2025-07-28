import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter a, b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        float result = b*b-4*a*c;
        if(result < 0){
            System.out.println("No real roots exist");
            
        }
        else{
            double sqr_root = Math.sqrt(result);
            double root1 = (-b+sqr_root)/2*a;
            double root2 = (-b-sqr_root)/2*a;
            System.out.println("Roots are: "+ root1 + ","+ root2);
        }
        
    }
}
