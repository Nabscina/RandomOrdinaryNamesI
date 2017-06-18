package logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Male names or female names? (m/f)");
        String gender = scanner.nextLine();
        System.out.println("How many? (1-100)");
        int number = Integer.parseInt(scanner.nextLine());

        for (Name n : generateNames(gender, number)) {
            System.out.println(n);
        }
    }

    public static ArrayList<Name> generateNames(String gender, int number) {

        ArrayList<Name> ret = new ArrayList<>();

        if ((!gender.toLowerCase().equals("m") && !gender.toLowerCase().equals("f")) || number > 100 || number < 1) {
            return ret;
        }

        NameList nl = new NameList();
        Random rnd = new Random();

        for (int i = 0; i < number; i++) {
            if (gender.toLowerCase().equals("m")) {
                ret.add(new Name(nl.maleNames().get(rnd.nextInt(nl.maleNames().size())), nl.maleNames().get(rnd.nextInt(nl.maleNames().size())), nl.lastNames().get(rnd.nextInt(nl.lastNames().size()))));
            } else {
                ret.add(new Name(nl.femaleNames().get(rnd.nextInt(nl.femaleNames().size())), nl.femaleNames().get(rnd.nextInt(nl.femaleNames().size())), nl.lastNames().get(rnd.nextInt(nl.lastNames().size()))));
            }
        }

        return ret;
    }

}
