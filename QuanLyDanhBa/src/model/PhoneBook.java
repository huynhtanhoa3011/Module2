package model;

public class PhoneBook {
    static int count = 0;
    private int id = 0;
    private String name;
    private String birthday;
    private String address;
    private String numberPhone;

    public PhoneBook() {
        id = ++count;
    }

    public PhoneBook(String name, int id, String birthday, String address, String numberPhone) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void display() {
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return String.format("\n%-21s %-9d %-16S %-24s %-14S", name, id, birthday, address, numberPhone);
    }
}
