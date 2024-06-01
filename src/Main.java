import HumanFamilyTree.FamilyTree;
import HumanFamilyTree.FileHandler;
import HumanFamilyTree.Person;

public class Main {
    public void main(String[] args, String filePath) {
        // Создание семьи
        Person husband = new Person("Alex", "Male", 35);
        Person wife = new Person("Mary", "Female", 32);
        Person firstKid = new Person("Alice", "Female", 8);
        Person secondKid = new Person("Maxim", "Male", 5);

        // Создание семьи
        husband.addChild(firstKid);
        husband.addChild(secondKid);

        // Создание генеалогического древа
        FamilyTree familyTree = new FamilyTree();
        familyTree.addMember(husband);
        familyTree.addMember(wife);
        familyTree.addMember(firstKid);
        familyTree.addMember(secondKid);

        // Изменение информации о члене семьи
        familyTree.updateMember(firstKid, "Alice Alexeevna", "Female", 9);

        FileHandler<FamilyTree<String>> fileHandler = new FileHandler<>();
        fileHandler.writeToFile(familyTree, "genealogy_tree.ser");
        FamilyTree<FamilyTree<String>> newTree = fileHandler.readFromFile("genealogy_tree.ser");

        if (newTree != null) {
            for (FamilyTree<String> person : newTree) {
                System.out.println(Person.getName() + " - " + Person.getAge());
            }
        }
    }
}