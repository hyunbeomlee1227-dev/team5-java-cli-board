package org.example;

import lombok.Getter;
import lombok.Setter;
import org.example.hunt.Monster;

@Getter
@Setter
public class CharacterStatus {
    public static int attack;
    public static int defense;
    public static int gold;
    public static int hp;
    public static int maxHp;
    public static int level;
    public static int exp;
    public static int maxExp;

    public CharacterStatus() {
        attack = 10;
        defense = 10;
        gold = 10;
        maxHp = 100;
        hp = maxHp;
        exp = 50;
        maxExp = exp;
    }

    public static void defaultStatus() {
        System.out.printf("캐릭터의 레벨 : %s \n", level);
        System.out.printf("캐릭터의 공격력 : %s \n", attack);
        System.out.printf("캐릭터의 방어력 : %s \n", defense);
        System.out.printf("캐릭터의 골드 : %s \n", gold);
        System.out.printf("캐릭터의 체력 : %s / %s \n", hp, maxHp);
        System.out.printf("캐릭터의 경험치 : %s / %s \n", exp, maxExp);
    }

    private void MonsterKill(Monster monster) {
    }

    private void LevelUp() {
        maxHp += 50;
        hp = maxHp;
        level += 1;
        exp -= maxExp;
        maxExp += 50;
    }

    public static void PlayerAttacked(Monster monster) {
        if (monster.getShield() < attack)
            monster.setHp(monster.getShield() - attack);

        if (monster.getHp() < 0)
        {
            MonsterKill(monster);
        }
    }
}
