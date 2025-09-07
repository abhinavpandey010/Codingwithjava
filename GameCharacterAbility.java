abstract class GameCharacter {
    abstract void attack();

    abstract void defend();
}

class Warrior extends GameCharacter {
    public void attack() {
        System.out.println("Warrior attacks with a mighty sword!");
    }

    public void defend() {
        System.out.println("Warrior blocks with a heavy shield!");
    }
}

class Mage extends GameCharacter {
    public void attack() {
        System.out.println("Mage casts a powerful fireball!");
    }

    public void defend() {
        System.out.println("Mage conjures a magical barrier!");
    }
}

class Archer extends GameCharacter {
    public void attack() {
        System.out.println("Archer shoots a precise arrow!");
    }

    public void defend() {
        System.out.println("Archer dodges swiftly to evade the attack!");
    }
}

public class GameCharacterAbility {

    public static void main(String[] args) {
        GameCharacter[] characters = { new Warrior(), new Mage(), new Archer() };
        for (GameCharacter character : characters) {
            character.attack();
            character.defend();
            System.out.println("-------------------");
        }

    }
}
