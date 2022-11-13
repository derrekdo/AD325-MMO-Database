package Database;

import java.text.DecimalFormat;
import java.util.Random;

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

    public void heal(double healthPoints){
        this.healthPoints += healthPoints;
        if(this.healthPoints > 100){
            this.healthPoints = 100;
        }
    }

    public void injure(double healthPoints){
        this.healthPoints += healthPoints;
        if(this.healthPoints < 0){
            this.healthPoints = 0;
        }
    }

    public void shiftAlignment(int value){
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
