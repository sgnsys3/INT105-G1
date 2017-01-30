/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.person;

/**
 *
 * @author INT105
 */
public class Person {
    private String name;
    private String surname;
    private long cardId;

    public Person() {
       
    }

   
     public Person(long cardId,String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Preson{" + "name=" + name + ", surname=" + surname + ", cardId=" + cardId + '}'+"\n";
    }

    @Override
    public boolean equals(Object obj) {
       if(obj != null && obj instanceof Person){
           Person ps = (Person) obj;
           if(cardId==ps.cardId)
               return true;
       }
       return false;
    }
    
}
