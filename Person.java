/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author INT105
 */
public class Person {

    public Person(String name, long cardId, String surname) {
        this.name = name;
        this.cardId = cardId;
        this.surname = surname;
    }
    
    public Person(){
        System.out.println("PerSon constructor is working it");
    }
    public Person(long cardId) {
        this.cardId = cardId;
    }

    public Person(String name) {
        this.name = name;
    }
    protected String name;
    private long cardId;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", cardId=" + cardId + ", surname=" + surname + '}';
    }
    
    public boolean equals (Object obj){
        boolean result = false;
        if (obj!=null && obj instanceof Person){
           Person pers = (Person) obj;
           if (cardId == pers.cardId)
               return true;
        }
        return false;
    }
}
