import Entities.Department;
import Entities.Employee;

import java.util.HashMap;
import java.util.TreeMap;


/** Prosit 11 */
public class AffectationHashMap {
    private HashMap<Employee, Department> affectations;


    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }


    public void ajouterEmployeDepartement(Employee e, Department d) {
        affectations.put(e, d);
    }


    public void afficherEmployesEtDepartements() {
        affectations.forEach((employe, department) ->
                System.out.println("Employee: " + employe + " -> Department: " + department));
    }


    public void supprimerEmploye(Employee e) {
        affectations.remove(e);
    }


    public void supprimerEmployeEtDepartement(Employee e, Department d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }


    public void afficherEmployees() {
        affectations.keySet().forEach(System.out::println);
    }

    public void afficherDepartments() {
        affectations.values().forEach(System.out::println);
    }


    public boolean rechercherEmployee(Employee e) {
        return affectations.containsKey(e);
    }


    public boolean rechercherDepartement(Department d) {
        return affectations.containsValue(d);
    }


    public TreeMap<Employee, Department> trierMap() {
        return new TreeMap<>(affectations);
    }
}
