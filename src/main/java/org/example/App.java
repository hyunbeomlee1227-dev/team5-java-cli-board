package org.example;

import static org.example.AppContext.scanner;

public class App {
    public void run() {

        while (true) {
            System.out.println("== 게임 앱 ==");
            System.out.printf("캐릭터의 공격력 : %s \n", AppContext.attack);
            System.out.printf("캐릭터의 방어력 : %s \n", AppContext.defense);
            System.out.printf("캐릭터의 골드 : %s \n", AppContext.gold);
            System.out.printf("캐릭터의 체력 : %s / %s \n", AppContext.HP, AppContext.MaxHP);

            System.out.println("1. 사냥터");
            System.out.println("2. 상점");
            System.out.println("3. 장비");
            System.out.println("4. 인벤토리");
            System.out.println("5. 종료");

            System.out.println("번호를 입력하세요. ");
            String cmd = scanner.nextLine();

            switch (cmd) {
                case "1" -> {

                }
                case "2" -> {

                }
                case "3" -> {

                }
                case "4" -> {

                }
                case "5" -> {
                    System.out.println("종료합니다.");
                    return;
                }
            }

            AppContext.clearConsole();
        }
    }

}
