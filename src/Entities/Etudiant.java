package Entities;

public class Etudiant {
    private int id;
    private String name;
    private int age;



    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.name = nom;
        this.age = age;
    }

    public Etudiant() {
        this.id = 0;
        this.name = "";
        this.age = 0;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

