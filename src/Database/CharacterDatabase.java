package Database;

import Dictionary.HashedDictionary;

import java.util.LinkedList;
import java.util.List;

/**
 *  {@inheritDoc}
 */
public class CharacterDatabase implements CharacterDatabaseInterface{
    private List<Character> characterData = new LinkedList<>();
    private HashedDictionary<String, Integer> players = new HashedDictionary<>();
    private int index = 0;

    public void addCharacter(String name, int height, int weight, double moralAlign) {
        characterData.add(new Character(name, height, weight, moralAlign));
        players.add(name, index);
        index++;
    }

    public void removeCharacter(String name) {
        characterData.set(players.getValue(name), null);
        players.remove(name);
    }

    public Character getCharacter(String name) {
        return characterData.get(players.getValue(name));
    }

    public void getHashTable() {
        players.displayHashTable();
    }

    public void printList() {
        StringBuilder result = new StringBuilder("[");
        //Checks if the first value in the list is null or not
        if(characterData.get(0) == null){
            result.append("null");
        }else{
            result.append(characterData.get(0).getName());
        }

        //Loops through the list to retrieve the name of each character
        //Runtime O(N)
        for(int i = 1; i < index;i++){
            if(characterData.get(i) == null){
                result.append(", null");
                i++;
            }
            result.append(", " + characterData.get(i).getName());
        }
        System.out.println(result + "]");

    }

    /**
     * Shifts the alignment of the characters
     * @param name the character whose alignment will be changed
     * @param value represents either a positive or negative shift
     */
    public void shiftAlignment(String name, double value){
        characterData.get(players.getValue(name)).shiftAlignment(value);
    }

    /**
     * Damages the specified character
     * @param name of the character to be damaged
     * @param health the amount to be damaged by
     */
    public void injure(String name, double health){
        characterData.get(players.getValue(name)).injure(health);
    }

    /**
     * Heals the specified character
     * @param name of the character to be healed
     * @param health the amount to be healed by
     */
    public void heal(String name, double health){
        characterData.get(players.getValue(name)).heal(health);
    }
}
