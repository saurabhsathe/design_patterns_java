package composite_pattern;

public class Employee implements DepartmentComponentInterface {

    String name;
    String empID;
    double salary;
    Employee(String nam, String EmpID, double sal){
        name=nam;
        empID=EmpID;
        salary=sal;
    }

    public void getInfo(){
        System.out.println("Here are the employee details"+name+empID+salary);
    }

}
