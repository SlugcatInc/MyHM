package HumanFamilyTree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class FamilyTreeFileManager implements FamilyTreeFileOperations {

    public void writeToFile(List<Person> members, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Person member : members) {
                writer.write(member.getName() + "," + member.getGender() + "," + member.getAge());
                if (member.getSpouse() != null) {
                    writer.write("," + member.getSpouse().getName());
                } else {
                    writer.write(",");
                }
                writer.write(",");
                for (Person child : member.getChildren()) {
                    writer.write(child.getName() + ",");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readFromFile(String filePath) {
        List<Person> members = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String gender = parts[1];
                int age = Integer.parseInt(parts[2]);
                Person member = new Person(name, gender, age);

                if (!parts[3].isEmpty()) {
                    String spouseName = parts[3];
                    for (Person p : members) {
                        if (p.getName().equals(spouseName)) {
                            member.marryTo(p);
                            break;
                        }
                    }
                }

                for (int i = 4; i < parts.length; i++) {
                    if (!parts[i].isEmpty()) {
                        String childName = parts[i];
                        for (Person p : members) {
                            if (p.getName().equals(childName)) {
                                member.addChild(p);
                                break;
                            }
                        }
                    }
                }

                members.add(member);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return members;
    }
    public static List<Person> sortMembersByAge(List<Person> members) {
        Collections.sort(members, Comparator.comparingInt(Person::getAge));
        return members;
    }
}