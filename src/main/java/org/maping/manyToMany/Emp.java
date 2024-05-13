package org.maping.manyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "employee")
public class Emp {
    @Id
    private  int id;
    private  String name;
    @ManyToMany
    private List<Project> projects;

    public Emp(int id, String name, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }

    public Emp() {
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

    public List<Project> getProject() {
        return projects;
    }

    public void setProject(List<Project> projects) {
        this.projects= projects;
    }



}
