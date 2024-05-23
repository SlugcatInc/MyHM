import java.util.List;

public interface FamilyTreeFileOperations {
    void writeToFile(List<Person> members, String filePath);
    List<Person> readFromFile(String filePath);
}

