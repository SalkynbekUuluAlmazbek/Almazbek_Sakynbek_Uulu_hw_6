public class Main {
    public static void main(String[] args) {
      Weapon bossWeapon = new Weapon(WeaponType.LIGHTSABER, "DarkSaber");
      Boss boss = new Boss("moffGideon", 1000, 100, bossWeapon );
      System.out.println(boss.printInfo());


      Weapon skeletonWeapon1 = new Weapon (WeaponType.BOW, "Arrow1");
      Skeleton skeleton1 = new Skeleton("Easy",100,10,skeletonWeapon1,10);
        System.out.println(skeleton1.printInfo());

      Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW,"Arrow2");
      Skeleton skeleton2 = new Skeleton("Normal",150,15,skeletonWeapon2,20);
        System.out.println(skeleton2.printInfo());

      

    }
}