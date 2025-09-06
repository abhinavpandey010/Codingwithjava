public class Array {
    int[] numbers = {2,4,1,9,7,10,5,6,3,8};
    int max,min,sum;
    
    public static void main(String[] args) {
        Array obj = new Array();

        System.out.println("Maximum number is:"+obj.maximum(obj.numbers));
        System.out.println("Minimum number is:"+obj.minimum(obj.numbers));
        System.out.println("total sum of numbers is:"+obj.total_sum(obj.numbers));
    }


    public int minimum(int[] arr){
        min = arr[0];
        for(int i = 1;i < arr.length;i++){
            
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public int maximum(int[] arr){
        max = arr[0];
        for(int i = 1;i < arr.length;i++){
            
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


    public int total_sum(int[] arr){
        sum = 0;
        for(int i = 0;i < arr.length;i++){
            
            sum += arr[i];

        }
        return sum;
    }


}
