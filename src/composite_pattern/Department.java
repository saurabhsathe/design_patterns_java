package composite_pattern;

import java.util.ArrayList;

public class Department implements DepartmentComponentInterface{

    ArrayList<DepartmentComponentInterface> dept_comps;
    String name;
    String location;
    Department(String deptName, String loc){
        name=deptName;
        dept_comps=new ArrayList<>();
        location=loc;
    }
    void addComponent(DepartmentComponentInterface comp){
        dept_comps.add(comp);
    }

    public void getInfo(){
        System.out.println("Here are the department details"+name);

        for(DepartmentComponentInterface dept:dept_comps){
            dept.getInfo();
        }
    }

}
