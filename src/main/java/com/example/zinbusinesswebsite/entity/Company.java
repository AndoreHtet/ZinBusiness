package com.example.zinbusinesswebsite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String companyName;
    private String companyAddress;
    private String contactNumber;
    private String email_address;
    @OneToMany(mappedBy = "company")
    private List<Service> services=
            new ArrayList<>();
    @OneToMany(mappedBy = "company")
    private List<Courses> coursesList=
            new ArrayList<>();

    public void addService(Service service){
        service.setCompany(this);
        services.add(service);
    }
    public void addCourse(Courses courses){
        courses.setCompany(this);
        coursesList.add(courses);
    }

    public Company(String companyName, String companyAddress, String contactNumber, String email_address) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.contactNumber = contactNumber;
        this.email_address = email_address;
    }
}
