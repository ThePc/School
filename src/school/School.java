package school;

public class School {

    
    public static void main(String[] args) {
        Person joe = 
                Person.addPerson("joe", Person.Gender.Male, 230);
        Person Bob = 
                Person.addPerson("bob", Person.Gender.Female, 110);
        
        Person.printNames(Person.Gender.Male);
        System.out.println(joe.getWeight());
        System.out.println(joe);
        Person.printNames();
        
    }
}
