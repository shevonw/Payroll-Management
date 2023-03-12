import java.util.ArrayList;

public class Payroll {

    public static void main(String[] args) {

        //StaffMember sobj = new StaffMember("Tyreek", "Thomas", 6727, 67);
        //sobj.display();

        ArrayList<SalesRep> Reps = new ArrayList<SalesRep>();
        SalesRep agent1 = new SalesRep("Mark","Smith",234,72,1000.00);
        SalesRep agent2 = new SalesRep("Paul","Dart",235,48,1000);
        SalesRep agent3 = new SalesRep("Alex","Gayle",236,100,1000);
        SalesRep agent4 = new SalesRep("Shane","Nugent",237,36,1000);
        SalesRep agent5 = new SalesRep("John","Black",238,80,1000);
        Reps.add(agent1);
        Reps.add(agent2);
        Reps.add(agent3);
        Reps.add(agent4);
        Reps.add(agent5);

        for (int i = 0; i<Reps.size(); i++){
            System.out.println(Reps.get(i) + "\n");
        }

        StaffMember mobj = new Manager("Tyreek","Thomas",738,4,20.89);
        mobj.display();

        StaffMember salesobj = new SalesRep("Tyreek","Thomas",784,56,78.98);
        salesobj.display();


    }
}
