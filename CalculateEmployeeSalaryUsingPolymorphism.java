class Employee{
    double calculateSalary(){
        return 0.0;
    }
}
class FullTimeEmployee extends Employee{
    double calculateSalary(){
        return 50000.0;
    }

}
class PartTimeEmployee extends Employee{
    double calculateSalary(){
        return 25000.0;
    }

}
class ContractEmployee extends Employee{
    double calculateSalary(){
        return 40000.0;
    }

}
public class CalculateEmployeeSalaryUsingPolymorphism {

    public static void main(String[] args) {
        Employee e1 = new PartTimeEmployee();
        Employee e2 = new FullTimeEmployee();
        Employee e3 = new ContractEmployee();

        System.out.println("Part time Employee Salary : " + e1.calculateSalary());
        System.out.println("Full time Employee Salary : " + e2.calculateSalary());
        System.out.println("Contract Employee Salary : " + e3.calculateSalary());
    }
}