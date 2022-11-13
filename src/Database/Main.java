package Database;

import Dictionary.HashedDictionary;

public class Main {
    public static void main(String[] args) {
        CharacterDatabase lostArk = new CharacterDatabase();
        lostArk.addCharacter("FB", 66, 130, 0.0);
        lostArk.addCharacter("Ea", 86, 200, 0.5);
        lostArk.addCharacter("Daegon", 36, 90, -1.0);
        lostArk.addCharacter("Gandalf", 80, 180, 1.0);

        System.out.println();
        testCharacterSheet(lostArk);
        System.out.println();
        testCollision();
        System.out.println();
        System.out.println();
        testStatChange(lostArk);
        System.out.println();
        testDisplay(lostArk);
    }

    public static void testDisplay(CharacterDatabase test){
        System.out.println("\t\tHashTable & Remove Test");
        System.out.println("----------------------------------");
        System.out.println("\t\tHashTable");
        System.out.println("----------------------------------");
        test.getHashTable();

        System.out.println("\t\tRemoval Test");
        System.out.println("----------------------------------");
        test.removeCharacter("Daegon");
        test.getHashTable();
        test.printList();
    }

    public static void testCollision(){
        CharacterDatabase test = new CharacterDatabase();
        CharacterDatabase test2 = new CharacterDatabase();
        CharacterDatabase test3 = new CharacterDatabase();
        System.out.println("\t\tCollistion Test");
        System.out.println("----------------------------------");
        System.out.println("\t\tBefore");
        System.out.println("----------------------------------");
        //test1 and test2 shows that both FB and Ea have the same indices
        test.addCharacter("FB", 100, 201, 1.0);
        test.getHashTable();

        test2.addCharacter("Ea" , 150, 130, 0.0);
        test2.getHashTable();

        System.out.println("\t\tAfter");
        System.out.println("----------------------------------");
        //test3 will show the result of the collision, Ea will be in another position
        test3.addCharacter("FB", 100, 201, 1.0);
        test3.addCharacter("Ea" , 150, 130, 0.0);
        test3.getHashTable();
    }

    public static void testCharacterSheet(CharacterDatabase test){
        System.out.println("\t\tCharacter Sheet Test");
        System.out.println("----------------------------------");
        System.out.println(test.getCharacter("Gandalf"));
        System.out.println(test.getCharacter("FB"));
        System.out.println(test.getCharacter("Ea"));
        System.out.println(test.getCharacter("Daegon"));
    }

    public static void testStatChange(CharacterDatabase test){
        System.out.println("\t\tStat Change Test");
        System.out.println("----------------------------------");
        System.out.println("\t\tBefore");
        System.out.println("----------------------------------");
        System.out.println(test.getCharacter("Gandalf"));
        test.shiftAlignment("Gandalf", 1.0);
        test.injure("Gandalf", -65);
        test.heal("Gandalf", 37);

        System.out.println("\t\tAfter");
        System.out.println("----------------------------------");
        System.out.println(test.getCharacter("Gandalf"));
    }
}
