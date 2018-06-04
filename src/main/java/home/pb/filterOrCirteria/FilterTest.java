package home.pb.filterOrCirteria;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    @Test
    public void FilterTest(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert","MALE", "SINGLE"));
        persons.add(new Person("John","MALE", "MARRIED"));
        persons.add(new Person("Laura","FEMALE", "MARRIED"));
        persons.add(new Person("Diana","FEMALE", "SINGLE"));
        persons.add(new Person("Mike","MALE", "SINGLE"));
        persons.add(new Person("Bobby","MALE", "SINGLE"));
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));
        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));
        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }
    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}