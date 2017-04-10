package project.entity;

public  class User {
    private long id;
    private String name;
    private String secondName;
    private String password;
    private String email;
    private String role;
    private String phoneNumber;
    private String adress;

    public User(String name) {
        this.name = name;
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name, String secondName, String password, String email, String role, String phoneNumber, String adress) {
        this.name = name;
        this.secondName = secondName;
        this.password = password;
        this.email = email;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
