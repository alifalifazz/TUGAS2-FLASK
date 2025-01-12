
<c:\Users\ASUS\Alifa Izzatunnisa\JavaLanjut\sesi1\Person.java™package sesi1;
public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void display() {
        System.out.println("Nama: " + getName());
        System.out.println("Umur: " + getAge());
        displayAddress();
    }

    public void displayAddress() {
        System.out.println("Alamat: " + getAddress());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alifa");
        person.setAge(19);
        person.setAddress("Jalan Raya Banjaran No. 123");
        person.display();
    }
} .*$6c35b009-0228-4900-887c-bc123d6467340 ™