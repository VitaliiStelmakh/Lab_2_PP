package Abiturient;

public class Abiturient {
    private int id;
    private String name;
    private String surname;
    private String pb;
    private String adress;
    private String phone;
    private double mark;

   public Abiturient(){}

    public Abiturient(int id,
            String name,
            String surname,
            String pb,
            String adress,
            String phone,
            double mark)
    {
        this.id = id;
        this.name=name;
        this.surname = surname;
        this.pb = pb;
        this.adress = adress;
        this.phone = phone;
        this.mark = mark;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPb(String pb) {
        this.pb = pb;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPb() {
        return pb;
    }
    public String getAdress() {
        return adress;
    }
    public String getPhone() {
        return phone;
    }
    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pb='" + pb + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", mark=" + mark +
                '}';
    }
}
