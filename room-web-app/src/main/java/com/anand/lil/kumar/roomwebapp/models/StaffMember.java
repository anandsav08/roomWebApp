package com.anand.lil.kumar.roomwebapp.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="EMPLOYEE")
public class StaffMember {
    @Id
    @Column(name="EMPLOYEE_ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="POSITION")
    private String position;

    public StaffMember(){
        this.ID = UUID.randomUUID().toString();
    }

    public StaffMember(String ID, String firstName, String lastName, String position) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
