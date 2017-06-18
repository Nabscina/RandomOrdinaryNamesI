package logic;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class NameList {

    private ArrayList<String> male;
    private ArrayList<String> female;
    private ArrayList<String> last;
    private Scanner reader;

    public NameList() {

        this.male = new ArrayList<>();
        this.female = new ArrayList<>();
        this.last = new ArrayList<>();

        addToList(new File("src/files/male.txt"), male);
        addToList(new File("src/files/female.txt"), female);
        addToList(new File("src/files/last.txt"), last);
    }

    public void addToList(File file, ArrayList<String> list) {

        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                list.add(reader.nextLine().replaceAll("[ 0123456789.]", ""));
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    public ArrayList<String> maleNames() {

        return male;
    }

    public ArrayList<String> femaleNames() {

        return female;
    }

    public ArrayList<String> lastNames() {

        return last;
    }

}
