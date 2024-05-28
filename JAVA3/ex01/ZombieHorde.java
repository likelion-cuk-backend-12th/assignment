package JAVA3.ex01;

import java.util.ArrayList;
import java.util.List;

public class ZombieHorde {
    private List<Zombie> horde;

    public ZombieHorde() {
        horde = new ArrayList<>();
    }

    public void addZombie(Zombie zombie) {
        horde.add(zombie);
    }

    public void attack() {
        List<Zombie> newZombies = new ArrayList<>();
        for (Zombie zombie : horde) {
            Zombie newZombie = zombie.bite();
            newZombies.add(newZombie);
        }
        horde.addAll(newZombies);
    }

    public int getHordeSize() {
        return horde.size();
    }

    public void displayHordeStatus() {
        System.out.println("현재 좀비 군단의 크기: " + getHordeSize());
    }

    public static void main(String[] args) {
        ZombieHorde horde = new ZombieHorde();
        horde.addZombie(new Zombie());
        horde.displayHordeStatus();

        horde.attack();
        horde.displayHordeStatus();

        horde.attack();
        horde.displayHordeStatus();
    }
}