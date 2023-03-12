public class Manager extends StaffMember {
    private double bonus;
    public Manager(double bonus){

        this.bonus = bonus;
    }
    public Manager(String firstname, String lastname, int deptnum, double hoursworked, double bonus){
        super(firstname,lastname,deptnum,hoursworked);
        this.bonus = bonus;
    }
    public Double setbonus(double bonus){
        return this.bonus = bonus;
    }

    public String toString(){
        return "Name: "+ getFirstname() + getLastname() + " Department number: "+ getDeptnumber()+ "Hours worked: "+ getHoursWorked() + "Bonus: "+ bonus;
    }

    public double CalculateSalary(){
        return (getHoursWorked() * 2500) + bonus;

    }
    public void display(){
        System.out.print("\n>>>>Manager<<<<\n");
        System.out.print("First Name: "+ getFirstname() +"\n");
        System.out.print("Last Name: "+ getLastname() +"\n");
        System.out.print("Department Number: "+ getDeptnumber() +"\n");
        System.out.print("Hours Worked: "+ getHoursWorked()+ "\n");
        System.out.print("Salary: "+ CalculateSalary());
        System.out.println(bonus);
    }
}
