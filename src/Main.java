import HumanFamilyTree.FamilyTree;
import HumanFamilyTree.Person;
import PetsFamilyTree.Pets;
import HumanFamilyTree.FamilyTreeFileManager;


import java.util.List;

public class Main {
    public static void main(String[] args, String filePath) {
        // Создание семьи
        Person husband = new Person("Alex", "Male", 35);
        Person wife = new Person("Mary", "Female", 32);
        Person firstKid = new Person("Alice", "Female", 8);
        Person secondKid = new Person("Maxim", "Male", 5);

        Pets firstDog = new Pets("Jack", "Male", 6);
        Pets secondDog = new Pets("Lola", "Female", 7);
        Pets thirdDog = new Pets("Lola", "Male", 1);



        // Создание семьи
        husband.marryTo(wife);
        husband.addChild(firstKid);
        husband.addChild(secondKid);

        firstDog.marryTo(secondDog);
        firstDog.addChild(thirdDog);

        // Создание генеалогического древа
        FamilyTree familyTree = new FamilyTree();
        familyTree.addMember(husband);
        familyTree.addMember(wife);
        familyTree.addMember(firstKid);
        familyTree.addMember(secondKid);

        // Изменение информации о члене семьи
        familyTree.updateMember(firstKid, "Alice Alexeevna", "Female", 9);

        List<Person> members = FamilyTreeFileManager.readFromFile(filePath);
        members = FamilyTreeFileManager.sortMembersByAge(members);

        // Удаление члена семьи
        familyTree.removeMember(secondKid);
        for (Person member : members) {
            System.out.println(member.getName() + ", " + member.getAge());
        }


    }


    }