import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String gender;
    private int age;
    private Person spouse; // супруг/супруга
    private List<Person> children; // дети

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.children = new ArrayList<>();
    }
    public void marryTo(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void removeChild(Person child) {
        children.remove(child);
    }

    public void updatePersonInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = List.of(children);
    }
}