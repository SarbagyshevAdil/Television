public class Channel {
    private int number;
    private String name;

    public Channel(int number, String name) {
        if (number < 0&&number<=10) {

                System.err.println();
            }else {
            this.number = number;
        }
        this.name = name;
    }

    public Channel() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
