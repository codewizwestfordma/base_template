package leaderboard;

public class Student {
    private Long id;
    private String name;
    private int wizbucks;

    public Student() {
        super();
    }
    public Student(Long id, String name, int wizbucks) {
        super();
        this.id = id;
        this.name = name;
        this.wizbucks = wizbucks;
    }
    public Student(String name, String passportNumber) {
        super();
        this.name = name;
        this.wizbucks = wizbucks;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWizbucks() {
        return wizbucks;
    }
    public void setWizbucks(int wizbucks) {
        this.wizbucks = wizbucks;
    }
    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, wizbucks);
    }
}