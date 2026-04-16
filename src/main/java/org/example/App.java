package org.example;

public class App {
    public void run() {

        while (true) {
            System.out.println("== 게임 앱 ==");
            Character.Status();

            switch (AppContext.getResponse(AppContext::choiceOfPlace)) {

                case 1 -> {
                    AppContext.clearConsole();
                    AppContext.hunt.run();
                }
                case 5 -> {
                    System.out.println("종료합니다.");
                    return;
                }
            }
        }
    }

}
