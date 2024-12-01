import Entities.Employee;
import Interfaces.IGestion;

import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayLis implements IGestion {

    public ArrayList<Employee> listEmp = new ArrayList<>();



    @Override
    public void ajouterEmploye(Object o) {
        if(o !=null && o.getClass() == Employee.class){
            Employee emp = (Employee) o;
            listEmp.add(emp);
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
    public boolean rechercherEmploye(Object o) {
        if(o !=null && o.getClass() == Employee.class){
            Employee emp = (Employee) o;
            for (Employee e : listEmp){
                if (e.equals(emp)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Object o) {
        if(rechercherEmploye(o)){
            listEmp.remove(o);
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
