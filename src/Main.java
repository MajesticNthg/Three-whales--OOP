class Hero {
    protected int strength; // показатель силы
    protected int agility; // показатель ловкости
    protected int intelligence; // показатель интеллекта
    protected int health; // показатель здоровья
    protected double moveSpeed; // показатель скорости бега
    protected double armor; // показатель брони
    protected int damage; // показатель урона

    Hero(int s, int a, int i, int h, int ms, int arm, int dmg) {
        this.strength = s;
        this.agility = a;
        this.intelligence = i;
        this.health = h;
        this.moveSpeed = ms;
        this.armor = arm;
        this.damage = dmg;

    }
}

class StrengthHero extends Hero {
    protected String name;
    protected String attribute = "Strength";

    StrengthHero(int s, int a, int i, int h, int ms, int arm, int dmg, String n) {
        super(s, a, i, h, ms, arm, dmg);
        this.name = n;
    }
    void UpLevel() {
        this.strength += 5;
        this.agility += 3;
        this.intelligence += 2;
    }

    void RuneHaste() {
        this.moveSpeed = 550;
    }

    void BaseMoveSpeed() {
        this.moveSpeed = 300;
    }

}


class AgilityHero extends Hero {
    protected String name;
    protected String attribute = "Agility";

    AgilityHero( int s, int a, int i, int h, int ms, int arm, int dmg, String n) {
        super(s, a, i, h, ms, arm, dmg);
        this.name = n;
    }
}

class IntelligenceHero extends Hero {
    protected String name;
    protected String attribute = "Intelligence";

    IntelligenceHero(int s, int a, int i, int h, int ms, int arm, int dmg, String n) {
        super(s, a, i, h, ms, arm, dmg);
        this.name = n;
    }
}



class Creep {
    protected int health; // показатель здоровья
    protected int damage; // показатель урона
    protected int armor; // показатель брони
    protected int moveSpeed; // показатель скорости бега

    Creep(int h, int dmg, int arm, int ms) {
        this.health = h;
        this.damage = dmg;
        this.armor = arm;
        this.moveSpeed = ms;
    }
}

class UsuallyCreep extends Creep {
    protected String name; // имя монстра
    protected int bounties; // награда за монстра

    UsuallyCreep(int h, int dmg, int arm, int ms, String n, int b) {
        super(h, dmg, arm, ms);
        this.name = n;
        this.bounties = b;
    }
}

class MegaCreep extends Creep {
    protected String name; // имя монстра

    MegaCreep(int h, int dmg, int arm, int ms, String n) {
        super(h, dmg, arm, ms);
        this.name = n;
    }
}

class NeutralCreep {
    protected int tier; // класс нейтрального монстра
    protected int health; // показатель здоровья
    protected int damage; // показатель урона
    protected int armor; // показатель брони
    protected int moveSpeed; // показатель скорости бега
    protected int bounties; // награда за монстра

    NeutralCreep(int h, int dmg, int arm, int ms, int b) {
        this.health = h;
        this.damage = dmg;
        this.armor = arm;
        this.moveSpeed = ms;
        this.bounties = b;
    }
}

class Tier1NeutralCreep extends NeutralCreep {
    protected String name; // имя монстра
    protected int SpellDamage1; // урон с первого скилла монстра
    protected int tier = 1; // разряд монстра
    protected int SleepID; // находится в состоянии сна либо в боевой готовности

    Tier1NeutralCreep(int h, int dmg, int arm, int ms, int b, String n, int s1) {
        super(h, dmg, arm, ms, b);
        this.name = n;
        this.SpellDamage1 = s1;
    }

    void SleepID(int slp) {
        if (slp < 0) SleepID = 0; else
        if (slp > 1) SleepID = 1; else
            SleepID = slp; // 0 - монстр бодрствует
        // 1 - монстр спит
    }

}

class Tier2NeutralCreep extends  NeutralCreep {
    protected String name; // имя монстра
    protected int SpellDamage1;
    protected int SpellDamage2;
    protected int tier = 2; // разряд монстра

    Tier2NeutralCreep(int h, int dmg, int arm, int ms, int b, String n, int s1, int s2) {
        super(h, dmg, arm, ms, b);
        this.name = n;
        this.SpellDamage1 = s1;
        this.SpellDamage2 = s2;
    }


    void upgrade() {
        this.health += 100;
        this.damage += 50;
    }
}
public class Main {
    public static void main(String[] args) {
        StrengthHero Axe = new StrengthHero(20, 15, 13, 500, 300, 2, 50, "Axe");
        Axe.RuneHaste();
        Axe.UpLevel();

        Tier1NeutralCreep Harpy = new Tier1NeutralCreep(200, 30, 1, 300, 30, "Harpy", 23);
        Harpy.SleepID(-5);

    }
}