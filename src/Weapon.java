public class Weapon {
    private WeaponType weaponType;
    private String nameWeapon;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public Weapon(WeaponType weaponType, String nameWeapon) {
        this.weaponType = weaponType;
        this.nameWeapon = nameWeapon;
    }
}
