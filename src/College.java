/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRAVEEN
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class College {

    int j;
    String collegename;
    List<Department> departments = new ArrayList<>();
    List<Student> Students = new ArrayList<>();

    public List<Department> createDepartment() throws IOException, ParseException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            while (true) {
                Department department = new Department();
                System.out.println("enter Department");
                while (true) {
                    department.departmentname = in.readLine();
                    if (department.departmentname.length() <= 50) {
                        departments.add(department);
                        Students = department.createStudent();
                        j = 0;
                        break;
                    } else {
                        System.out.println("Enter valid department");
                    }
                    if (j == 0) {
                        break;
                    }
                }
            }
        }
        return departments;
    }

    public static void main(String as[]) throws IOException, ParseException {
        List<Department> department1 = new ArrayList<>();
        College college = new College();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter College name");
        while (true) {
            college.collegename = in.readLine();

            if (college.collegename.length() <= 50) {
                department1 = college.createDepartment();
                break;
            } else {
                System.out.println("enter valid Collegename:");
            }

        }
    }

}
