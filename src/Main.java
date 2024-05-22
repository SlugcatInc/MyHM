
public class Main {
    public static void main(String[] args) {
        // Создание семьи
        Person husband = new Person("Alex", "Male", 35);
        Person wife = new Person("Mary", "Female", 32);
        Person firstKid = new Person("Alice", "Female", 8);
        Person secondKid = new Person("Maxim", "Male", 5);

        // Создание семьи
        husband.marryTo(wife);
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

        // Удаление члена семьи
        familyTree.removeMember(secondKid);
    }
}