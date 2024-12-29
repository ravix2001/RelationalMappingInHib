package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;

    /*@ManyToOne
    private Student std;*/

    @ManyToMany
    private List<Student> std = new ArrayList<Student>();

    public int getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public List<Student> getStudent() {
        return std;
    }
    public void setStudent(List<Student> std) {
        this.std = std;
    }
}
