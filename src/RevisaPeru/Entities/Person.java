/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.Entities;

import java.util.Date;

/**
 *
 * @author user
 */
public abstract class Person {
    private int id;
    private String name;
    private String lastName;
    private String dni;
    private char gender;//genero
    private int ubigeoId;
    private Date birthDate;

    public Person() {
    }
    
    
    public Person(int id, String name, String lastName, String dni, char gender, int ubigeoId, Date birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.gender = gender;
        this.ubigeoId = ubigeoId;
        this.birthDate = birthDate;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getUbigeoId() {
        return ubigeoId;
    }

    public void setUbigeoId(int ubigeoId) {
        this.ubigeoId = ubigeoId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    
}
