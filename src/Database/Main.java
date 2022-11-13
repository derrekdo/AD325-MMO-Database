package Database;

import Dictionary.HashedDictionary;

public class Main {
    public static void main(String[] args) {
        CharacterDatabase worldOfWarcraft = new CharacterDatabase();
        worldOfWarcraft.addCharacter("FB", 66, 130, 0.0);
        worldOfWarcraft.addCharacter("Ea", 86, 200, 0.5);
        worldOfWarcraft.addCharacter("Daegon", 36, 90, -1.0);
        worldOfWarcraft.addCharacter("Gandalf", 80, 180, 1.0);

//        worldOfWarcraft.removeCharacter("Daegon");
//        worldOfWarcraft.printList();
//        worldOfWarcraft.getHashTable();
        System.out.println(worldOfWarcraft.getCharacter("Daegon"));


    }
}
