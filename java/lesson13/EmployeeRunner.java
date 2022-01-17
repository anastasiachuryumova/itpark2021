package lesson13;


import lesson13.util.EmployeeUtils;

import java.util.List;

public class EmployeeRunner {


    public static void main(String[] args) {
        List<String>[] Employees = new List[]{EmployeeUtils.getNAMES()};
        for (int i = 0; i < Employees.length; i++) {
            System.out.println(EmployeeUtils.getNAMES());
            System.out.println(EmployeeUtils.getNumbers());
            System.out.println(EmployeeUtils.getWORKAGE());
        }
    }
}

