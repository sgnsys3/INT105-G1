/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INT105.Person;

import java.util.Objects;

/**
 *
 * @author INT105
 */
public class Person {
    protected long cardId;
    protected String name;
    private String surname;

    public Person() {
        //super() Parent Class is Object Class 
        System.out.println("Person constructor is working!!");
    }

    public Person(long cardId, String name, String surname) {
        this.cardId = cardId;
        this.name = name;
        this.surname = surname;
    }

    
    
    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "cardId=" + cardId + ", name=" + name + ", surname=" + surname + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null && obj instanceof Person){
            Person p = (Person)obj;
            if(cardId==p.cardId){
                result = true;
            }
            else
                result = false;
            
                
        }
        return result;
    }
    
    
    
   
    
}
