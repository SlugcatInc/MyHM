package HumanFamilyTree;

import java.util.List;

public interface FamilyTreeFileOperations {
    void writeToFile(List<Person> members, String filePath);

    static List<Person> readFromFile(String filePath) {
        return null;
    }

    static List<Person> sortMembersByAge(List<Person> members) {
        return null;
    }
}


