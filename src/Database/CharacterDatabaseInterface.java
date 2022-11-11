package Database;

import Dictionary.HashedDictionary;

public interface CharacterDatabaseInterface {
    void addCharacter(String name, int height, int weight, double moralAlign);
    void removeCharacter(String name);
    Character getCharacter(String name);
    HashedDictionary<String, Integer> getHashTable();
    void printList();
}