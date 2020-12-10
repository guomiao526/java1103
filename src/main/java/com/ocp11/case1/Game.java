package com.ocp11.case1;

public interface Game {
void play();
default int price(){
    return 99;
}
// 多新增一個copyright 的方法, 前面需加"default" 不然前面成立
// 的子類別會錯誤、程式會出錯.

default void copyRight(){
    System.out.println("版權所有");
}
}
