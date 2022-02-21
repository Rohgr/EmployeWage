
public class EmployeeWage {


        public static void main(String[] args) {
            System.out.println("Welcome to Employee wage program");

        double empcheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empcheck);
        if ( empcheck == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
        }
}
