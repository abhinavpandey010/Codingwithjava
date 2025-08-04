import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to print prime numbers:");
        int num = sc.nextInt();
        sc.close();
        for(int i = 2;i<=num;i++){
            int count = 0;
            for(int j = 1;j<= num;j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
            System.out.println(i);
        }
     }
    }
}
