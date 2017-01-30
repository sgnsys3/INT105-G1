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
    protected long cardId;
    private String name;
    private String surname;
    
    public Person(){
        System.out.println("Person const. is working");
    }
    public Person(long cardId, String name, String surname) {
        this.cardId = cardId;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "cardId=" + cardId + ", name=" + name + ", surname=" + surname + '}';
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
    public boolean equals(Object obj) {
        if(obj!=null&&obj instanceof Person){
            Person pers=(Person)obj;
            if(cardId==pers.cardId)
                return true;
        }
        return false;
    }
    
}
