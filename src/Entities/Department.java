package Entities;

public class Department {
    public int id;
    public String depName;
    public int empNbr;

    public Department(int id, String depName, int empNbr) {
        this.id = id;
        this.depName = depName;
        this.empNbr = empNbr;
    }

    public Department() {
        this.id = 0;
        this.depName = "";
        this.empNbr = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getEmpNbr() {
        return empNbr;
    }

    public void setEmpNbr(int empNbr) {
        this.empNbr = empNbr;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null || obj.getClass() != getClass()){
            return false;
        }
        if(obj==this){
            return true;
        }
        Department dep = (Department) obj;
        return((this.depName==dep.depName)&&(this.id==dep.id));
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", empNbr=" + empNbr +
                '}';
    }
}
