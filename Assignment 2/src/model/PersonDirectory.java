/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vedant
 */
public class PersonDirectory {
    
    private ArrayList<PersonProfile> people;
    
    public PersonDirectory(){
        this.people = new ArrayList<PersonProfile>();
    }

    public ArrayList<PersonProfile> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<PersonProfile> people) {
        this.people = people;
    }

    public PersonProfile addPerson(){
        PersonProfile person = new PersonProfile();
        people.add(person);
        return person;
    }
    
    public void deletePerson(PersonProfile person){
        people.remove(person);
    }
    
    public PersonProfile search(String searchInput){
        //write search code here
        for(PersonProfile p : people){
            if(p.getFirstName().contains(searchInput) || p.getLastName().contains(searchInput) || 
                    p.getHomeAddress().getStreetAddress().contains(searchInput) ||
                    p.getWorkAddress().getStreetAddress().contains(searchInput)){
                return p;
            }
        }
        return null;
    }
    
}
