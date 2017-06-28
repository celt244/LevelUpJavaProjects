package ua.dp.levelup;

/**
 * Created by java on 10.02.2017.
 */
public class Home {

    private int number;
    private  String streetName;
    private int stageCount;
    private int citizen;

    public Home(int number, String streetName, int stageCount, int citizen) {
        this.number = number;
        this.streetName = streetName;
        this.stageCount = stageCount;
        this.citizen = citizen;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStageCount() {
        return stageCount;
    }

    public void setStageCount(int stageCount) {
        this.stageCount = stageCount;
    }

    public int getCitizen() {
        return citizen;
    }

    public void setCitizen(int citizen) {
        this.citizen = citizen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;

        return number == home.number && !(streetName != null ? !streetName.equals(home.streetName) : home.streetName != null);

    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Home{" +
                "number=" + number +
                ", streetName='" + streetName + '\'' +
                ", stageCount=" + stageCount +
                ", citizen=" + citizen +
                '}';
    }
}
