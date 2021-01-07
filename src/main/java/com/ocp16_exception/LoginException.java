package com.ocp16_exception;

public class LoginException extends Exception {
//將錯誤訊息傳給父類別

    public LoginException(String string) {
        super(string);
    }

    //自訂一個新方法
    public void 怎麼辦() {
        System.out.println("請重新登入");
    }
}
