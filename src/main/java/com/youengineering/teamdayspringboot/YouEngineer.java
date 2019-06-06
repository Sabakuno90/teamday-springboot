package com.youengineering.teamdayspringboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class YouEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private int skillLevel;

    public YouEngineer() {
        this.firstName = "";
        this.lastName = "";
        this.skillLevel = 0;
    }

    public YouEngineer(String firstName, String lastName, int skillLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.skillLevel = skillLevel;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "YouEngineer{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", skillLevel=" + skillLevel + '}';
    }

}
