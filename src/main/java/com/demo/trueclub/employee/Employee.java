package com.demo.trueclub.employee;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table
public class Employee {
@Id
@SequenceGenerator(
        name = "employee_sequence",
        sequenceName = "employee_sequence",
        allocationSize = 1
)
@GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "employee_sequence"
)

    private int id;
    private String name;
    private String address;
    private int pincode;
    private String state;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Date timestamp;



    public Employee() {
    }

    public Employee(int id, String name, String address, int pincode, String state, Date timestamp) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pincode = pincode;
        this.state = state;
        this.timestamp = timestamp;
    }

    public Employee(String name, String address, int pincode, String state, Date timestamp) {
        this.name = name;
        this.address = address;
        this.pincode = pincode;
        this.state = state;
        this.timestamp = timestamp;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp=timestamp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                ", state='" + state + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
