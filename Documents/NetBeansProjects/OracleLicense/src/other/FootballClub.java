package other;

public class FootballClub implements Club {

    public String name;

    protected FootballClub(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String print() {
        System.out.println("print method from interface");
        return null;
    }
}
