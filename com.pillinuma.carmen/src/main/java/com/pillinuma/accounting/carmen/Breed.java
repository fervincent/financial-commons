package com.pillinuma.accounting.carmen;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Breed {

    @Id
    //@GeneratedValue(generator = "uuid")
    //@GenericGenerator(name="uuid", strategy="uuid2")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    private String id;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    private String name;
}