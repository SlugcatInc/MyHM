package PetsFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class PetsTree {
    public class FamilyTree {
        private List<Pets> members;

        public FamilyTree() {
            members = new ArrayList<>();
        }

        public void addMember(Pets pets) {
            members.add(pets);
        }

        public void removeMember(Pets pets) {
            members.remove(pets);
        }

        public void updateMember(Pets pets, String name, String gender, int age) {
            pets.updatePetInfo(name, gender, age);
        }
}}
