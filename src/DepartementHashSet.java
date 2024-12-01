import Entities.Department;
import Interfaces.IDepartment;
import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartment<Department>{
    private HashSet<Department> depList;


    @Override
    public void ajouterDepartement(Department department) {
        if(department!=null)
         depList.add(department);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        if(nom!=null){
          for (Department d : depList){
              if(d.depName==nom)
                  return true;
          }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Department department) {
        if(department!=null){
            for (Department d : depList){
                if(d.equals(department))
                    return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Department department) {
        if(rechercherDepartement(department))
            depList.remove(department);
    }

    @Override
    public void displayDepartement() {
        depList.toString();
    }

    @Override
    public TreeSet<Department> trierDepartementById() {
        TreeSet<Department> sortedHashSet= new TreeSet<>(new Comparator<Department>() {
            @Override
            public int compare(Department d1 , Department d2){
                return  Integer.compare(d1.id,d2.id);
            }
        });
        sortedHashSet.addAll(depList);
        return sortedHashSet;
    }
}
