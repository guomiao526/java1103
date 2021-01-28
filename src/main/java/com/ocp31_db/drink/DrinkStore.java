package com.ocp31_db.drink;

import java.util.Scanner;

public class DrinkStore {

    private static boolean exit;

    public static void main(String[] args) throws Exception {
        while (!exit) {
            menu();
            if (!exit) {
                System.out.println("按下enter繼續....");
                System.in.read(); // 按下任一鍵繼續
            }
        }
    }

    public static void menu() {
        System.out.println("-----------------------------");
        System.out.println("1.Read");
        System.out.println("2.Create");
        System.out.println("3.Update amount");
        System.out.println("4.Delete");
        System.out.println("5.exit");
        System.out.println("-----------------------------");
        service();
    }

    public static void service() {
        DrinkDao dao = new DrinkDao();
        Scanner sc = new Scanner(System.in);
        System.out.println("==> ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                dao.read();
                break;
            case 2:
                System.out.println("請輸入飲料名字");
                String name = sc.next();
                System.out.println("請輸入飲料售價");
                int price = sc.nextInt();
                System.out.println("請輸入飲料數量");
                int amount = sc.nextInt();
                dao.create(name, price, amount);
                break;
            case 3:
                System.out.println("請輸入修改名字:");
                int updateId = sc.nextInt();
                System.out.println("請輸入修改的數量:");
                int updateAmount = sc.nextInt();
                dao.update(updateId, updateAmount);
                break;
            case 4:
                System.out.println("請輸入刪除的名字:");
                int deleteId = sc.nextInt();
                dao.delete(deleteId);
                break;
            case 5:
                exit = true;
        }

    }
}
