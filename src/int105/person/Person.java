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
    private long cardId;
    private String name;
    private String surname;
    
    public Person(){
        //super();
        System.out.println("Person constructor is working !!!");
    }

    public Person(long cardId, String name, String surname) {
        this.cardId = cardId;
        this.name = name;
        this.surname = surname;
    }

    public long getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "cardId=" + cardId + ", name=" + name + ", surname=" + surname + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
    /*    if (this == obj) {
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
        if(obj !=null && obj instanceof Person){
            Person pers=(Person) obj;
            if(cardId==pers.cardId)
                return true;
        }
        return false;
        
        
    }
    
}
