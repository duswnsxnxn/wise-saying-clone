package com.yeokim;

import java.util.Scanner;

public class App {

    private Scanner sc;
    public App(Scanner scanner) {
        this.sc = scanner;
    }


    public void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.println("명령) ");
            String cmd = sc.nextLine().trim();
            if (cmd.isEmpty()) continue;
            switch (cmd) {
                case "종료":
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.printf("'%s'(은)는 올바르지 않은 명령입니다.\n", cmd);
                    break;
            }
        }
    }
}
