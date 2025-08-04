import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find fibonacci series:");
        int num = sc.nextInt();
        sc.close();
        int temp = 0,curr = 1,prev = 0;
        while(temp <= num){
        if(prev == 0){
            System.out.println(temp);
            System.out.println(curr);
        }
        temp = curr + prev;
        prev = curr;
        curr = temp;
        System.out.println(temp);
        }
    }
}

