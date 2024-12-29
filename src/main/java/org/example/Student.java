package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int sid;
    private String sname;
    private int age;
    
    /*@OneToOne
    private Laptop laptop;*/

    /*@OneToMany(mappedBy = "std",fetch = FetchType.EAGER)
    private List<Laptop> laptop = new ArrayList<Laptop>();*/

    @ManyToMany(mappedBy = "std")
    private List<Laptop> laptop = new ArrayList<Laptop>();

    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Laptop> getLaptop() {
        return laptop;
    }
    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }
}
