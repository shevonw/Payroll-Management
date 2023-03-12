import java.util.ArrayList;
public class SalesRep extends StaffMember {
    private double allowance;

    public SalesRep(double allowance) {
        this.allowance = allowance;
    }

    public double setallowance(double allowance){
        return this.allowance = allowance;
    }

    public SalesRep(String firstname, String lastname, int deptnumber, double hoursWorked, double allowance) {
        super(firstname, lastname, deptnumber, hoursWorked);
        this.allowance = allowance;
    }

    public String toString(){
        return "Name: "+ getFirstname() + getLastname() + "\nDepartment number: "+ getDeptnumber()+ "\nHours worked: "+ getHoursWorked() + "\nAllowance: "+ allowance;
    }

    public double CalculateSalary(){
        return (getHoursWorked() * 1500) + allowance;
    }

    public void display() {
        System.out.print("\n>>>>Sales Rep<<<<\n");
        System.out.print("First Name: "+ getFirstname() +"\n");
        System.out.print("Last Name: "+ getLastname() +"\n");
        System.out.print("Department Number: "+ getDeptnumber() +"\n");
        System.out.print("Hours Worked: "+ getHoursWorked()+"\n");
        System.out.print("Salary: "+ CalculateSalary());
        System.out.println(allowance);
    }

}
