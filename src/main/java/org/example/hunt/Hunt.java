package org.example.hunt;

import org.example.AppContext;
import org.example.CharacterStatus;

public class Hunt {
    int setMonsterNumber;
    private Monster monster;

    public void run() {

        do {
            setMonsterNumber = AppContext.getResponse(Hunt::huntingSelector);

            if (setMonsterNumber == 0) return;
        } while (setMonsterNumber < 0 || setMonsterNumber > 3);

        monster.monsterSetting(setMonsterNumber);

        while (true) {
            if (hunting() == 0)
                return;
        }
    }

    static void huntingSelector() {
        AppContext.clearConsole();

        huntingHeader();
        System.out.println("1. 고블린");
        System.out.println("2. 오크");
        System.out.println("3. 오우거");
        System.out.println("0. 뒤로가기");
    }

    static void huntingHeader() {
        System.out.println("== 사냥터 ==");
    }

    void selectChoice() {
        System.out.println("1. 공격");
        System.out.println("0. 뒤로가기");
    }

    int hunting() {
        huntingHeader();
        monster.monsterStatus();
        CharacterStatus.defaultStatus();
        selectChoice();

        int response = AppContext.getResponse(Hunt::huntingSelector);

        switch (response)
        {
            case 0 -> {return 0;}
            case 1 -> {
            }
            default -> {}
        }

        return response;
    }
}
