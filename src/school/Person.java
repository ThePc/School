package school;
import java.util.ArrayList;

public class Person {
    
    
//     public static int numPeople =10;
//     public static int currentPeopleIndex =0;
     //private static Person people[]=new Person[numPeople];
     private static ArrayList<Person>people = new ArrayList<Person>();
     
     
     
     
    enum Gender {
    Male,Female
    }

private Gender gender;
private String name;
private int weight;
 
public static Person addPerson (String _name,Gender _gender, int _weight)
{
Person temp = new Person(_name,_gender,_weight);
//people[currentPeopleIndex++]=temp;
people.add(temp);

return(temp);     
}
 Person()
 {
     name="None";
     weight =100;
     gender = Gender.Female;
 }
 Person(String _name, Gender _gender, int _weight)
 {
     name = _name;
     weight = _weight;
     gender = _gender;
     
 }
 public void setGender(Gender _gender)
 {
  gender=_gender;
 }
 public Gender getGender()
 {
 return(gender);
 }
 
 public void setName(String _name)
 {
  name=_name;
 }
 public String getName()
 {
 return(name);
 }
 public void setGender(int _weight)
 {
  weight=_weight;
 }
 public int getWeight()
 {
 return(weight);
 }
 public static void printNames()
 {
 System.out.println("----printNames---");
//         for(int index=0;index<people.length;index++)
//         {
//         if(people[index]!=null)
//         System.out.println(people[index].getName());
//         }
 for(Person temp : people)
         {
         System.out.println(temp.getName());
         }
 }

 public String toString()
 {
     return(name + " " + gender + " " + weight);
 }
 
 
  public static void printNames(Gender _gender)
  {
      for(Person temp : people)
         {
         if(temp.gender==_gender)    
         System.out.println(temp.getGender());
         }
  }
 
 
}