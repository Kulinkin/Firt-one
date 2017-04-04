package Project;

public  class User {
    private String name;
    private String secondName;
    private String password;
    private String phoneNumber;
    private String adress;

    public User(String name, String secondName, String password, String phoneNumber, String adress) {
        this.name = name;
        this.secondName = secondName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
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
}
