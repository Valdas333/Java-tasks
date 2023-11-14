import java.util.ArrayList;

public class Room {

    private ArrayList<Person> roomPersons;

    public Room(){
        this.roomPersons = new ArrayList<>();
    }

    public void add(Person person){
        this.roomPersons.add(person);
    }

    public boolean isEmpty(){
        return this.roomPersons.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.roomPersons;
    }

    public Person shortest(){
        if (this.roomPersons.isEmpty()){
            return null;
        }
        int shortestHeight = this.roomPersons.get(0).getHeight();
        Person returnObject = this.roomPersons.get(0);
        for (Person person:
             this.roomPersons) {
            if (person.getHeight() < shortestHeight){
                shortestHeight = person.getHeight();
                returnObject = person;
            }
        }
        return returnObject;
    }

    public Person take(){
        Person returnObject = this.shortest();
        roomPersons.remove(returnObject);
        return returnObject;
    }
}
