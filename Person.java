package Person;

public class Person {
    private String name;
    private String surname;
    protected long cardId;

    public Person() {
//        System.out.println("Person Constructor Work NAJA");
    }

    public Person(String name, String surname, long cardId) {
        this.name = name;
        this.surname = surname;
        this.cardId = (long)cardId;
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
    
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null && obj instanceof Person){
            Person ps = (Person)obj;
            if(name.equals(ps.name)
               &&surname.equals(ps.surname)
               &&cardId==ps.cardId){
                result=true;
            
            }
        }
        return result;
    }
    
}
