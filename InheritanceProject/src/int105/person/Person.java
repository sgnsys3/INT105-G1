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
    protected long cardId;
    
    public Person(){
        System.out.println("Person constructor is working !!");
    }
    
    public Person(String name, String surname, long cardId) {
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
        return "Person{" + "name=" + name + ", surname=" + surname + ", cardId=" + cardId + '}';
    }

    @Override
    public boolean equals(Object obj) {
        /*if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.cardId != other.cardId) {
            return false;
        }
        return true;*/
       if(obj != null && obj instanceof Person){
           Person p = (Person) obj;
           if(p.cardId == cardId){
               return true;
           }
       }
       return false;
    }
    
}
