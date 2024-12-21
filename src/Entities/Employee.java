package Entities;


/**please note that I use english out of habit when coding**/





public class Employee {
    public int id ;
    public String name;
    public String lastName;
    public String department;
    public int rank;


    public Employee (int id ,String name,String lastName,String department,int rank){
        this.id = id;
        this.name = name;
        this.lastName=lastName;
        this.department=department;
        this.rank=rank;
    }

    public Employee(){
        this.id = 0;
        this.name = "";
        this.lastName="";
        this.department="";
        this.rank=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank= rank;
    }

    @Override
    public boolean equals(Object obj){

    if(this==obj){
        return true;
    } else if (obj==null|| getClass() != obj.getClass()) {
        return false;
    }
    Employee other = (Employee) obj;
    return ((this.id== other.id)&&(this.name== other.name));

    }

    @Override
        public String toString(){
            return ("Name :\n"+this.name+"Last Name :\n"+this.lastName+" Id :\n"+this.id+"Department\n"+this.department+"Rank\n"+this.rank);
        }

}
