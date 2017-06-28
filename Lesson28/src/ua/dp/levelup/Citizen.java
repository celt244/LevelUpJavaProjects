package ua.dp.levelup;

/**
 * Created by java on 24.02.2017.
 */
public class Citizen {

    private long id;
    private String firstName;
    private String LstName;
    private int age;

    public Citizen(long id, String firstName, String lstName, int age) {
        this.id = id;
        this.firstName = firstName;
        LstName = lstName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLstName() {
        return LstName;
    }

    public void setLstName(String lstName) {
        LstName = lstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LstName='" + LstName + '\'' +
                ", age=" + age +
                '}';
    }
}
