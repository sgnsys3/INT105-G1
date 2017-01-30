package int105;
import java.util.Objects;
public class Person {
    private String name;
    private String surname;
    private long cardId;

    public Person() {
        System.out.println("Person constructor is working !!!");
    }
    
    public Person(String name, String surname, long cardId) {
        this.name = name;
        this.surname = surname;
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getCardId() {
        return cardId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", cardId=" + cardId + '}';
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Person other = (Person) obj;
//        if (this.cardId != other.cardId) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.surname, other.surname)) {
//            return false;
//        }
//        return true;
        if(obj!=null && obj instanceof Person){
            Person pers = (Person)obj;
            if(cardId==pers.cardId)
                return true;
        }
        return false;
    }
}
