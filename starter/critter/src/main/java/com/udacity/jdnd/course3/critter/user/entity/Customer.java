package com.udacity.jdnd.course3.critter.user.entity;

import com.udacity.jdnd.course3.critter.pet.entity.Pet;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue(value="C")
public class Customer extends User{

    @Column(nullable = false)
    private String phoneNumber;

    private String notes;

    @OneToMany(mappedBy = "customer"/*, cascade = {CascadeType.ALL}*/)
    private Set<Pet> pets;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
