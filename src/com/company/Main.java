package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Assignment.
        // The employees assignment we did last time.
        // Solve it using an ArrayList.
        // Do a different solution with LinkedList.
        // create a program that will hold 20 students scores, in an arraylist,
        // and return the maximum score in the arrayList

        // Create a class called Person. They should have: // The person class will be the parent class
        // - name, age.
        // Create a class called Employee. This class should inherit // The Employee class will be the child class.
        // the Person class. and should have the extra field of
        // - company id, company name.
        // Create a class called Company. This class should take in employees as
        // an array attribute, name.
        //
        // In your main method, Populate a company's employees attribute and
        // find the average age of the employees.

//        List<Integer> scores = new ArrayList<>();
//        scores.add(87);
//        scores.add(66);
//        scores.add(70);
//        scores.add(89);
//        scores.add(90);
//        scores.add(95);
//        scores.add(79);
//        scores.add(89);
//        scores.add(68);
//        scores.add(77);
//        scores.add(88);
//        scores.add(86);
//        scores.add(92);
//        scores.add(70);
//        scores.add(65);
//        scores.add(80);
//        scores.add(75);
//        scores.add(85);
//        scores.add(71);
//        scores.add(82);
//        scores.add(88);

//        Integer max = Collections.max(scores);
//        System.out.println("Maximum score: " + max);


        List<String> names = new ArrayList<>();
        names.add("Satu");
        names.add("Matti");
        names.add("Taru");
        names.add("Juha");
        names.add("Johanna");


        List<String> idNo = new ArrayList<>();
        idNo.add("C12");
        idNo.add("C45");
        idNo.add("FO56");
        idNo.add("CP76");
        idNo.add("S34");

        List<String> company = new ArrayList<>();
        company.add("Finnair");
        company.add("Finnair");
        company.add("Finnair");
        company.add("Finnair");
        company.add("Finnair");

        List<Integer> ages = new ArrayList<>();
        ages.add(25);
        ages.add(30);
        ages.add(28);
        ages.add(40);
        ages.add(29);

        float sum = 0;

        for (int age : ages){
            sum += age;
        }
        float average = (sum / ages.size());
        System.out.println("The average age is: " + average);

        StringBuilder age = new StringBuilder();
        for (Integer year : ages) {
            age.append(year != null? year.toString() : "");
        }

        int combine = names.size();

        ArrayList<String> employee = new ArrayList<>(combine);
        for (int i = 0; i < combine; i++) {
            String newline = System.lineSeparator();
            employee.add(names.get(i) +  " " + idNo.get(i) + " " + ages.get(i) + " " + company.get(i) + newline);

        }

        System.out.println(employee);


    }
}
