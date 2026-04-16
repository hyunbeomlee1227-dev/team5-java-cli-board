package org.example.hunt;

import org.example.AppContext;
import org.example.Character;

public class Hunt {
    int setMonsterNumber;
    private final Monster monster;

    public Hunt() {
        monster = new Monster();
    }

    public void run() {
        do {
            setMonsterNumber = AppContext.getResponse(Hunt::huntingSelector);
            monster.MonsterSetting(setMonsterNumber);

            AppContext.clearConsole();
            huntingHeader();
            monster.Status();
            Character.Status();

            while (hunting()) {}
        } while (setMonsterNumber >= 1 && setMonsterNumber <= 3);
    }

    static void huntingSelector() {
        huntingHeader();
        System.out.println("1. 고블린");
        System.out.println("2. 오크");
        System.out.println("3. 오우거");
        System.out.println("0. 뒤로가기");
    }

    static void huntingHeader() {
        System.out.println("== 사냥터 ==");
    }

    static void selectChoice() {
        System.out.println("1. 공격");
        System.out.println("0. 뒤로가기");
    }

    boolean hunting() {
        switch (AppContext.getResponse(Hunt::selectChoice)) {
            case 0 -> {
                return false;
            }
            case 1 -> {
                Character.PlayerAttacked(monster);

                if (monster.hp <= 0)
                    monster.Reset();

                else
                    monster.Attack();

                System.out.println();
                huntingHeader();
                monster.Status();
                Character.Status();
            }
            default -> {
                return true;
            }
        }
        return true;
    }
}
