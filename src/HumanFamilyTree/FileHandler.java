package HumanFamilyTree;

import java.io.*;

public class FileHandler<T> implements Serializable {
    public void writeToFile(FamilyTree<T> tree, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public FamilyTree<T> readFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (FamilyTree<T>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}