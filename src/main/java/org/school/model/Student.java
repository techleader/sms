package org.school.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String address;
    private String state;
    private String sex;
    private String maritalStatus;

    public Student() {}

    public Student(String firstName,String lastName,  String email,String password,String address,String state,String sex, String maritalStatus
                    ) {
        this.firstName = firstName;
        this.lastName= lastName;
        this.password = password;
        this.email= email;
        this.address = address;
        this.state = state;
        this.sex =sex;
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s' , lastName='%s', email='%s',password='%s',address='%s', state='%s' , sex = '%s', maritalStatus='%s']",

                id, firstName ,lastName,email,password,address,state,sex,maritalStatus
                );
    }

//  //  public Long getId() {
//        return id;
//    }
}