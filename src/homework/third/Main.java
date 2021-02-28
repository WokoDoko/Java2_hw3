package homework.third;

import java.util.*;


public class Main {


    static int countOfA;
    static int countOfB;
    static int countOfC;
    static int countOfD;

    public static void main(String[] args) {

        //ArrayList<String> taskNote = new ArrayList<>(Arrays.asList("A", "A", "A", "A", "A", "B", "B", "B", "B", "B", "A", "A", "A", "A", "B", "B", "B")); тут я пытался через итератор, но у меня не вышло
        String [] taskNote = new String[] {"A", "A", "C", "A", "D", "B", "B", "B", "C", "B", "A", "D", "A", "C", "B", "B", "D"};


        for (String s : taskNote) {
            if (s == "A")
                countOfA++;
            else if (s == "B")
                countOfB++;
            else if (s == "C")
                countOfC++;
            else if (s == "D")
                countOfD++;
            else
                System.out.println("Undefined element.");
        }

            System.out.println(countOfA);
            System.out.println(countOfB);
            System.out.println(countOfC);
            System.out.println(countOfD);
            System.out.println(Arrays.deepToString(taskNote));
            Set<String> mySet = new HashSet<>(Arrays.asList(taskNote));
            System.out.println(mySet);


        Phonebook phBook = new Phonebook();
        phBook.addAndPrint("Иванов", "9876543");
        phBook.addAndPrint("Дмитриев", "98765467865");
        phBook.addAndPrint("Семенов", "234512");
        phBook.addAndPrint("asd", "2543546");
        phBook.addAndPrint("asc", "67546352464");

        }

    }

