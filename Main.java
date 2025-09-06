final class Final{
    public void show() {
        System.out.println("This is a final class. No class can extend me!");
    }
}


public class Main {
    final int mass;// value of mass cant changed after once intialised through contructor

    Main(){
        mass = 50;
    }

    // this method cant be override again because of final keyword
    final public void display(){
        System.out.println("Mass is constant:"+mass);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
        //obj.mass = 100; // can not changed // it shows error
    }

}

class A extends Main{
    //Cannot override the final method from Main
//  public void display(){
//         System.out.println("Mass is constant:"+mass);
//     }
}

