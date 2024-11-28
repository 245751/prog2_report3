package jp.ac.uryukyu.ie.e245751;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 10);
        Enemy slime = new Enemy("スライムもどき", 15, 100);
        demoHero.attackWithWeponSkill(slime);
        assertEquals(0, slime.getHitPoint());
    }
}
