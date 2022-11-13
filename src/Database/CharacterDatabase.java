package Database;

import Dictionary.HashedDictionary;

import java.util.LinkedList;
import java.util.List;

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
        if(characterData.get(0) == null){
            result.append("null");
        }else{
            result.append(characterData.get(0).getName());
        }

        for(int i = 1; i < index;i++){
            if(characterData.get(i) == null){
                result.append(", null");
                i++;
            }
            result.append(", " + characterData.get(i).getName());
        }
        System.out.println(result + "]");

    }
}
