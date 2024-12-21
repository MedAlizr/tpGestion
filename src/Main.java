import Entities.Department;
import Entities.Employee;


public class Main {
    public static void main(String[] args) {


        AffectationHashMap gestionAffectations = new AffectationHashMap();


       /** Prosit 11 instruction 3 */
        //creations of employee instances
        Employee e1 = new Employee(1, "Amine", "Ahmed", "Informatique", 5);
        Employee e2 = new Employee(2, "Imane", "wali", "Ressources Humaines", 3);
        Department dep1 = new Department(101, "Ressources Humaines", 5);
        Department dep2 = new Department(102, "Informatique", 10);


        // affecting employees tp different departments
        gestionAffectations.ajouterEmployeDepartement(e1, dep1);
        gestionAffectations.ajouterEmployeDepartement(e2, dep2);

        // display
        gestionAffectations.afficherEmployesEtDepartements();

        // affecting one of the employees to a new department
        gestionAffectations.ajouterEmployeDepartement(e1, dep2);

        // Display again
        gestionAffectations.afficherEmployesEtDepartements();




    }
}