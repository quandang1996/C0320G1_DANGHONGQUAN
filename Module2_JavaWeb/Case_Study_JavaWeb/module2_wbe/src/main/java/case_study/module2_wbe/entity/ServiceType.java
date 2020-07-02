package case_study.module2_wbe.entity;

import javax.persistence.*;

@Entity
@Table(name = "servicetypes")

public class ServiceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_type_id")
    private long id;

    @Column(name = "service_type_name", length = 10)
    private String name;

    public ServiceType() {
    }

    public ServiceType(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
