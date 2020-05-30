public class Bank {

    private String name;
    private int banknr;

    public Bank(String name) {
        this.name = name;
    }

    public Bank(int banknr) {
        this.banknr = banknr;
    }

    public Bank(String name, int banknr) {
        this.name = name;
        this.banknr = banknr;
    }

}