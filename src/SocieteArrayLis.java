import Entities.Employee;
import Interfaces.IGestion;

import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayLis implements IGestion<Employee> {

    public ArrayList<Employee> listEmp = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employee employee) {
        if(employee!=null ){
            listEmp.add(employee);
       }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee e : listEmp){
            if (e.name == nom){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
            for (Employee e : listEmp){
                if (e.equals(employee)){
                    return true;
                }
            }

        return false;
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        if(rechercherEmploye(employee)){
           listEmp.remove(employee);
       }
    }

    @Override
    public void displayEmploye() {
        for(Employee e : listEmp){
           System.out.println(e.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        listEmp.sort(Comparator.comparing(employee -> employee.id));
       System.out.print(listEmp);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        listEmp.sort(Comparator.comparing((Employee emp) -> emp.department).thenComparing(emp ->emp.rank));
    }

}
