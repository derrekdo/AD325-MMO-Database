package Database;

import Dictionary.HashedDictionary;

public interface CharacterDatabaseInterface {
    /**
     * Adds a character to the list and hash table
     * @param name The name of the character
     * @param height The height of the character
     * @param weight The weight of the character
     * @param moralAlign The characters alignment
     */
    void addCharacter(String name, int height, int weight, double moralAlign);

    /**
     * Removes the character from the list and hash table
     * @param name of the character to be removed
     */
    void removeCharacter(String name);

    /**
     * Returns the Character object
     * @param name of the Character specified
     * @return the Character sheet of the character object
     */
    Character getCharacter(String name);

    /**
     * Displays the hash table holding the Characters and their indexs
     */
    void getHashTable();

    /**
     * Displays a list of the characters
     */
    void printList();
}
