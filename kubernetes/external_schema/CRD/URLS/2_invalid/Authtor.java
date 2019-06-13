package test_java;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Authtor {
    private int id;
    private String firstname;
    private String lastname;
    private Integer version;
    private AuthtorDetails authtorDetailsById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "VERSION")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authtor authtor = (Authtor) o;
        return id == authtor.id &&
                Objects.equals(firstname, authtor.firstname) &&
                Objects.equals(lastname, authtor.lastname) &&
                Objects.equals(version, authtor.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, version);
    }

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
    public AuthtorDetails getAuthtorDetailsById() {
        return authtorDetailsById;
    }

    public void setAuthtorDetailsById(AuthtorDetails authtorDetailsById) {
        this.authtorDetailsById = authtorDetailsById;
    }
}
