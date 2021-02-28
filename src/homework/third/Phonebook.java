package homework.third;

import java.util.*;

public class Phonebook {
    private String name;
    private String number;
    public HashMap<String, Set<String>> people = new HashMap<>();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void addAndPrint(String name, String number) {
        this.name = name;
        this.number = number;
        Set<String> telephoneNumber = people.getOrDefault(name, new HashSet<>());
        telephoneNumber.add(number);
        people.put(name, telephoneNumber);
        System.out.printf("\nНомер телефона человека с фамилией %s: "+get(name), getName());
    }
    public Set<String> get(String name){
        return people.get(name);
    }

    public String getName () {
        return this.name;
    }

}
