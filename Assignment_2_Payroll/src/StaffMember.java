abstract class StaffMember {
    private String firstname;
    private String lastname;
    private int deptnumber;
    private double hoursWorked;
    public StaffMember(){
        this.firstname = "";
        this.lastname = "";
        this.deptnumber = 0;
        this.hoursWorked = 0.0;
    }
    public StaffMember(String fname, String lname, int deptnum, double hrswrked){
        this.firstname = fname;
        this.lastname = lname;
        this.deptnumber = deptnum;
        this.hoursWorked = hrswrked;
    }
    public String getFirstname(){
        //System.out.println(firstname);
        return firstname;
    }

    public String toString(){
        return "Name: "+ getFirstname() +" "+ getLastname() + " \nDepartment number: "+ getDeptnumber()+" "+ "\nHours worked: "+ getHoursWorked();
    }
    public String getLastname(){
        return this.lastname;
    }
    public int getDeptnumber(){
        return this.deptnumber;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }

    public abstract double CalculateSalary();

    public void display(){
        System.out.print("\n>>>>Staff Member<<<<\n");
        System.out.print("First Name: "+ firstname +"\n");
        System.out.print("Last Name: "+ lastname +"\n");
        System.out.print("Department Number: "+ deptnumber +"\n");
        System.out.print("Hours Worked: "+ hoursWorked);
    }

}
