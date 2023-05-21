package com.sda.she_likes_java.collections.lists;



import com.sda.she_likes_java.collections.Person;

import java.util.ArrayList;
import java.util.List;

public class ListSecondExample {
    private static int a;// this you can`t change because it is statics
    private int b;// this value you can change
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        names.add("Karolina");
        names.add("Ramune");
        names.add("Inese");
        names.add("Agnese");
        names.add(3,"Agnese F.");
        List<String> anotherList = names;
        // you can`t add element at non existed index
        //names.add(300,"Agnese F.");

        a=5;
        System.out.println(a);
        ListSecondExample one = new ListSecondExample();
        one.b = 6;
        ListSecondExample two = new ListSecondExample();
        two.b = 7;
        System.out.println(one.b);
        System.out.println(two.b);
        printNames(names);
        System.out.println("----------------------");
        printOnlySomeNames(names);
        System.out.println("-----------------------");
        printNamesInOneLine(names);
       //System.out.println("-----------------------");
       //printNamesWithSemicolon(names);
        System.out.println("-----------------------");
        System.out.println("Let`s` add some name to the list");
        addNAme(names);
        printNames(names);
        System.out.println("-----------------------");
        System.out.println("Let`s play with names");
        List<Person> personList = List.of(
                new Person("Johny", "I"),
                new Person("Johny", "C"),
                new Person("Jane", "D"),
                new Person("Ivan", "G")
        );
        List <Person> foundPersons = findPersonsByName(personList,"Johny");
        System.out.println("Persons with name Johny: " + foundPersons);
        foundPersons = findPersonsByName(personList, "Ivan");
        System.out.println("Persons with name Ivan: " + foundPersons);
    }

    public static void printNames(List<String>names) {
        for (String singleName:names) {
            System.out.println("name is: " + singleName);
        }//singleNAmes is just how we name what we want to print out, here just names

    }

    public static void printOnlySomeNames(List<String>names){
        //starting from position 1 - second item
        for ( int index =1; index < names.size(); index++){
            System.out.println("name is: " + names.get(index));
        }

    }
   public static void printNamesInOneLine(List<String>names){
        for ( int i = 0; i< names.size(); i++);
       System.out.println("The names are: " + names);

    }
    //name1, name2, name3
    //public static void  printNamesWithSemicolon (List<String>names){
     //String result = names.get(0);
    //  for (int i = 0; i < names.size(); i++);{
     //     result += "; " + names.get(i);
     // }
    //  System.out.println(result);

  //}

    // add name
    public static void addNAme(List<String>stringList){
        stringList.add("Kitija");
    }
    // finding item inside list
    public static List<Person> findPersonsByName (List<Person>persons, String nameToFind){
       //create empty result
        List<Person> result = new ArrayList<>();
        //iterate the list
        for (Person person : persons) {
            // if person has proper name, add it to the result
        if (person.getName().equals(nameToFind))
        {
            result.add(person);
        }
        }
        // return result
        return result;

    }


}
