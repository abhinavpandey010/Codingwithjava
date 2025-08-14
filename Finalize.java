public class Finalize {
    
    public static void main(String[] args) {
        Finalize obj = new Finalize();
        obj.finalize();
    }
    
    public void finalize(){
        System.out.println("The finalize() method in Java is a protected method defined in the Object class, which is the superclass of all Java classes. It is called by the garbage collector just before an object is destroyed from memory to perform cleanup activities. ");
    }
    
}
