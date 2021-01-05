package com.ocp16;

import java.util.Arrays;
import java.util.List;

public class LoginSystem2 {

    // 可以登入的使用者
    private static List<String> users = Arrays.asList("john", "mary", "admin");

    public static boolean login(String userName) throws LoginException {
        boolean check = users.stream().filter(name -> name.equals(userName)).findFirst().isPresent();
        if (check == false) {
            LoginException le = new LoginException("無此帳號");
            throw le;
        }
        return check;
    }

    public static void main(String[] args) {
        try {
            System.out.println(login("apple"));
        } catch (LoginException ex) {
            System.out.println(ex.getMessage());
            ex.怎麼辦();
        }

    }
}
