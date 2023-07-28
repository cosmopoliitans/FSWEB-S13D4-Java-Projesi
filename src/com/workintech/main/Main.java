package com.workintech.main;
import com.workintech.model.Player;
import com.workintech.model.Weapon;
import com.workintech.model.Point;
public class Main {
    public static void main(String[] args) {
        System.out.println("*********POINT**********");

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("*********PLAYER**********");

        Player p1 = new Player("Mahmut", 1000, Weapon.AXE);
        System.out.println(p1);
        p1.loseHealth(50);
        System.out.println(p1);
        p1.loseHealth(60);
        System.out.println(p1);
        System.out.println("***********************************************");
        p1.restoreHealth(1200);
        System.out.println(p1);

        Player p2 = new Player("Mahmut", 1000, Weapon.AXE);
        p1 = p2;

    }
}