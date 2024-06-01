package HumanFamilyTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person<T> implements Serializable {
    private static String name;
    private String gender;
    private static int age;
    private List<T> children; // дети

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.children = new ArrayList<>();
    }

    public void addChild(T child) {
        children.add(child);
    }

    public void removeChild(T child) {
        children.remove(child);
    }

    public void updatePersonInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public static int getAge() {
        return age;
    }

    public List<T> getChildren() {
        return children;
    }

}