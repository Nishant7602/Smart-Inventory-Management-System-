package com.smartinventory.entity;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String contact;   // ✅ MUST EXIST

    private String address;   // ✅ MUST EXIST

    // Getters & Setters

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

    public String getContact() {   // ✅ REQUIRED
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {   // ✅ REQUIRED
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}