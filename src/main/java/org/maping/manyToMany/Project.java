package org.maping.manyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    private int pId;
    @Column(name = "project_name")
    private String projectname;

    @ManyToMany(mappedBy = "projects")
    private List<Emp> emps;

    public Project() {
    }


    public Project(int pId, String projectname, List<Emp> emps) {
        this.pId = pId;
        this.projectname = projectname;
        this.emps = emps;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}
