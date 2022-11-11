package Database;

public class Character {
    private String name;
    private int height;
    private int weight;
    private double moralAlignment;
    private double healthPoints = 100.0;

    public Character(String name, int height, int weight, double moralAlignment){
        if(moralAlignment > 1){
            moralAlignment = 1;
        }else if(moralAlignment < -1){
            moralAlignment = -1;
        }
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.moralAlignment = moralAlignment;
    }

    public String heal(double healthPoints){
        this.healthPoints += healthPoints;
        if(this.healthPoints > 100){
            this.healthPoints = 100;
        }
        return "Healing " + name + " for: " + healthPoints;
    }

    public String injure(double healthPoints){
        this.healthPoints += healthPoints;
        if(this.healthPoints < 0){
            this.healthPoints = 0;
        }
        return "Damaging " + name + " for: " + healthPoints;
    }

    public String toString(){
        StringBuilder characterSheet = new StringBuilder("\n\t\tCharacter Sheet\n");
        characterSheet.append("------------------------------\n");
        characterSheet.append("Character Name: " + name);
        characterSheet.append("\nHealth Points: " + healthPoints);
        characterSheet.append("\nHeight: " + height);
        characterSheet.append("\nWeight: " + weight);
        characterSheet.append("\nAlignment: " + moralAlignment);
        return characterSheet + "";
    }
}
