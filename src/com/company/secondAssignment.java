package com.company;

import java.util.LinkedList;
import java.util.List;

public class secondAssignment {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Satu");
        names.add("Matti");
        names.add("Taru");
        names.add("Juha");
        names.add("Johanna");

        List<String> idNo = new LinkedList<>();
        idNo.add("12U");
        idNo.add("C45");
        idNo.add("FO56");
        idNo.add("CP76");
        idNo.add("S34");

        List<String> company = new LinkedList<>();
        company.add("Finnair");
        company.add("Finnair");
        company.add("Finnair");
        company.add("Finnair");
        company.add("Finnair");

        List<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(30);
        ages.add(28);
        ages.add(40);
        ages.add(29);

        float sum = 0;

        for (int age : ages) {
            sum += age;
        }
        float average = (sum / ages.size());
        System.out.println("The average age is: " + average);

        StringBuilder age = new StringBuilder();
        for (Integer year : ages) {
            age.append(year != null ? year.toString() : "");
        }

        int combine = names.size();

        LinkedList<String> employee = new LinkedList<String> ();
        for (int i = 0; i < combine; i++) {
            employee.add(names.get(i) + " " + idNo.get(i) + " " + ages.get(i) + " " + company.get(i) + '\n');

        }

        System.out.println(employee);
    }
}
