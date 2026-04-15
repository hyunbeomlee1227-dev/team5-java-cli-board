package org.example.hunt;

import lombok.Getter;
import lombok.Setter;
import org.example.AppContext;

@Getter
@Setter
public class Monster {
    int attack;
    int shield;
    int hp;
    int maxHp;
    int exp;
    int gold;

    void monsterSetting(int setMonsterNumber) {
        switch (setMonsterNumber) {
            case 1 -> {
                attack = 15;
                shield = 5;
                hp = 10;
                maxHp = hp;
                exp = 5;
                gold = 10;
            }
            case 2 -> {
                attack = 25;
                shield = 15;
                hp = 20;
                maxHp = hp;
                exp = 20;
                gold = 40;
            }
            case 3 -> {
                attack = 50;
                shield = 30;
                hp = 50;
                maxHp = hp;
                exp = 50;
                gold = 100;
            }
        }
    }

    void monsterStatus() {
        AppContext.clearConsole();

        System.out.printf("몬스터의 공격력 : %s \n", attack);
        System.out.printf("몬스터의 방어력 : %s \n", shield);
        System.out.printf("캐릭터의 체력 : %s / %s \n", hp, maxHp);
    }
}
