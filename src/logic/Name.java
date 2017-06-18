package logic;

public class Name {

    private String first;
    private String middle;
    private String last;

    public Name(String f, String m, String l) {

        this.first = f;
        this.middle = m;
        this.last = l;
    }

    public String first() {

        return first;
    }

    public String middle() {

        return middle;
    }

    public String last() {

        return last;
    }

    @Override
    public String toString() {

        return first + " " + middle + " " + last;
    }

}
