package SpringHibernateOracleTemplate.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_persons")
public class Person {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    public Person() {
        this.id = 0;
        this.firstname = "";
        this.lastname = "";
    }

    public Person(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
