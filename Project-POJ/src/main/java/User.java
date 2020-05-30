public class User {

    private String firstname;

    private String lastname;

    private int age;

    private int id;

    public User(String firstname){ this.firstname = firstname; }

    public User(String lastname){ this.lastname = lastname; }

    public User(int age){ this.age = age; }

    public User(int id){ this.id = id; }

    public String getFirstname() { return firstname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }

    public void setLastname() { this.lastname = lastname; }

    public int getAge() {return age; }

    public void setAge() { this.age = age; }

    public int getId() { return id; }

    public void setId() { this.id = id; }

}
