package composite_pattern;

public class Mainscript {
    public static void main(String[] args) {
        DepartmentComponentInterface emp1= new Employee("Saurabh","55484",120000);
        DepartmentComponentInterface emp2= new Employee("Shubham","55484",120000);
        DepartmentComponentInterface emp3= new Employee("Shreyas","55484",120000);

        Department dept1= new Department("BSG","Pune");
        dept1.addComponent(emp1);
        Department dept2 = new Department("KPMG","Mumbai");
        dept1.addComponent(dept2);
        dept2.addComponent(emp2);
        dept2.addComponent(emp3);

        dept1.getInfo();
    }

}
