package com.poker;

import static com.poker.PokerUtil.getScore;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Queue<Poker> pokers = PokerUtil.getPokers();
        Collections.shuffle((List) pokers);
//        System.out.println(pokers);
        play(pokers);

    }

    public static void play(Queue<Poker> pokers) {
        List<Poker> myPokers = new LinkedList<>();//我手邊的牌
        List<Poker> pcPokers = new LinkedList<>();//PC的牌
        //莊家先拿一張牌
        pcPokers.add(pokers.poll());
        //user
        do {
            //檢查手邊的牌
            System.out.printf("你的牌是: %s 目前分數: %.1f \n",
                    myPokers, getScore(myPokers));
            //先判斷是否爆了 ?
            if (getScore(myPokers) > 10.5) {
                System.out.println("爆了~");
                break;
            }
            //是否過五關?
            if (myPokers.size() == 5) {
                System.out.println("你太強了 恭喜你過五關  贏啦");
                break;
            }
            //是否10.5
            if (getScore(myPokers) == 10.5) {
                System.out.println("十點半，大贏家!恭喜你贏了~");
                break;
            }

            //是否要拿牌 ?
            Scanner sc = new Scanner(System.in);
            System.out.printf(" 是否要牌?(y/n)");
            String yn = sc.next();
            if (yn.equals("y")) {
                Poker poker = pokers.poll();
                myPokers.add(poker);
            } else {
                break;
            }
        } while (true);
        
        //pc
        do {          
            if(getScore(pcPokers) > 10.5){
                System.out.println("莊家輸了 爆炸啦~");
                break;
            }
            if(getScore(pcPokers) < 8){
                pcPokers.add(pokers.poll());
                
            }else{
                break;
            }
        } while (true);
         System.out.printf("USER牌是: %s 目前分數: %.1f \n",
                    myPokers, getScore(myPokers));
          System.out.printf("PC牌是: %s 目前分數: %.1f \n",
                    pcPokers, getScore(myPokers));
       
        System.out.println("剩餘的牌:  "+pokers);
    }

}
