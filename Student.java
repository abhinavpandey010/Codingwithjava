class Parent{
    int age;  
    String name;  

    // Constructor to initialize values
    public Parent(int age, String name) {
        this.age= age;// this keyword refers to current class instance
        this.name = name;
    }

}

class Student extends Parent{

    public Student(int age, String name){
        super(age, name);// use super keeyword to initialize value in parent class throught its constructor
        this.display();  
    }
  
    // Method to display info
    public void displayInfo() {
        System.out.println("this function is called without using this:");
        System.out.println("Name :"  + name);
        System.out.println("age :" + age);
       
    }

    public void display(){
        System.out.println("this function is called by using this keyword:");
         System.out.println("name and age are initialised using super keyword to call base class contructor from derived class constructor:");
        System.out.println("Name :"  + name);
        System.out.println("age :" + age);
    }


    public static void main(String[] args) {
        Student obj = new Student(22,"Abhinav");
        obj.displayInfo();
    }
}
