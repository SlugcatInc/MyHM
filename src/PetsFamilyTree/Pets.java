package PetsFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    private String petname;
    private String petgender;
    private int petage;
    private Pets petmate; // супруг/супруга
    private List<Pets> cubs; // дети

    public Pets(String name, String gender, int age) {
        this.petname = name;
        this.petgender = gender;
        this.petage = age;
        this.cubs = new ArrayList<Pets>();
    }
    public void marryTo(Pets petmates) {
        this.petmate = petmates;
        petmates.petmate = this;
    }

    public void addChild(Pets cub) {
        cubs.add(cub);
    }

    public void removeChild(Pets cub) {
        cubs.remove(cub);
    }

    public void updatePetInfo(String name, String gender, int age) {
        this.petname = name;
        this.petgender = gender;
        this.petage = age;
    }
}
