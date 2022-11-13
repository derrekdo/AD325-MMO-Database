package Database;

import java.text.DecimalFormat;
import java.util.Random;

public class Character {
    private String name;
    private int height;
    private int weight;
    private double moralAlignment;
    private double healthPoints = 100.0;

    /**
     * Constructor
     */
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

    /**
     * Heals the character
     * @param healthPoints the amount to be healed by
     */
    public void heal(double healthPoints){
        if(healthPoints > 0){
            this.healthPoints += healthPoints;
        }
        if(this.healthPoints > 100){
            this.healthPoints = 100;
        }
    }

    /**
     * Damages the Character
     * @param healthPoints the amount to be damaged by
     */
    public void injure(double healthPoints){
        if(healthPoints <= 0){
            this.healthPoints += healthPoints;
        }
        if(this.healthPoints < 0){
            this.healthPoints = 0;
        }
    }

    /**
     * Shifts the alignment
     * @param value determines a positive or negative shift
     */
    public void shiftAlignment(double value){
        Random random = new Random();
        DecimalFormat form = new DecimalFormat("0.0");

        if(value == 0){
            moralAlignment = 0.0;
        }else if(value > 0){
            moralAlignment = Double.parseDouble(form.format(random.nextDouble(1.0)));
        }else{
            moralAlignment = Double.parseDouble(form.format(random.nextDouble(-1.0)));
        }
    }

    /**
     * Creates a string format of the character
     * @return the character sheet
     */
    public String toString(){
        StringBuilder characterSheet = new StringBuilder("\n\t\tCharacter Sheet\n");
        characterSheet.append("------------------------------\n");
        characterSheet.append("Character Name: " + name);
        characterSheet.append("\n Health Points: " + healthPoints);
        characterSheet.append("\n        Height: " + height);
        characterSheet.append("\n        Weight: " + weight);
        characterSheet.append("\n     Alignment: " + moralAlignment);
        characterSheet.append("\n------------------------------");
        return characterSheet + " ";
    }

    /**
     * Getters for the Character data
     */
    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    public double getHp(){
        return healthPoints;
    }

    public double getAlignment(){
        return moralAlignment;
    }

    public String getName(){
        return name;
    }
}
