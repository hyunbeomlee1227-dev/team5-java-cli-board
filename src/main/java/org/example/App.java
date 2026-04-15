package org.example;

public class App {
    public void run() {

        while (true) {
            System.out.println("== 게임 앱 ==");
            CharacterStatus.defaultStatus();

            switch (AppContext.getResponse(AppContext::choiceOfPlace)) {

                case 1:
                    AppContext.hunt.run();
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    return;
            }

            AppContext.clearConsole();
        }
    }

}
