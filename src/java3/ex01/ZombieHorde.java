package java3.ex01;

/*
좀비와 좀비 군단을 둘 다 만들어보세요.
좀비가 만들어질 때 `“Grraaaaaa…”`를 출력합니다.
좀비는 사람을 물어서 좀비를 만들 수 있습니다.
좀비 군단은 직접 좀비 객체를 가지고 있습니다.
좀비 군단이 공격하면 군단의 모든 좀비가 한번 씩 사람을 물게 됩니다.
군단이 감염시킨 좀비는 군단에 속하게 됩니다.
*/

import java3.ex00.MyLittleHotel;

import java.util.ArrayList;

public class ZombieHorde {

    private static ZombieHorde zombieHorde;
    private ZombieHorde() {}

    public static ZombieHorde getZombieHorde() {
        if (zombieHorde == null) {
            zombieHorde = new ZombieHorde();
        }
        return zombieHorde;
    }

    ArrayList<Zombie> zombies = new ArrayList<>();

    public void firstZombie(){
        zombies.add(new Zombie());
    }

    public void attack() {

        int n = zombies.size();
        for (int i = 0; i < n; i++){
            zombies.add(new Zombie());
        }
    }

    public int zombiesSize() {
        return zombies.size();
    }

    public static void main(String[] args) {

        getZombieHorde();
        zombieHorde.firstZombie();
        System.out.println();
        zombieHorde.attack();
        System.out.println();
        zombieHorde.attack();
        System.out.println();
        zombieHorde.attack();
        System.out.println();

        System.out.println("현재 좀비 군단의 수: " + zombieHorde.zombiesSize());
    }
}
