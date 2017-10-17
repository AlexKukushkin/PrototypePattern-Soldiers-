package army_prototype;

public class Platoon implements PrototypeCapable{
    private int numberSoldiers = 0;
    private int numberAmmo = 0;

    public Platoon(int numberSoldiers, int numberAmmo) {
        this.numberSoldiers = numberSoldiers;
        this.numberAmmo = numberAmmo;
    }

    public int getNumberAmmo() {
        return numberAmmo;
    }

    public void setNumberAmmo(int numberAmmo) {
        this.numberAmmo = numberAmmo;
    }

    public int getNumberSoldiers() {
        return numberSoldiers;
    }

    public void setNumberSoldiers(int numberSoldiers) {
        this.numberSoldiers = numberSoldiers;
    }

    @Override
    public Platoon clone() throws CloneNotSupportedException {
        System.out.println("Cloning Platoon object");
        return (Platoon)super.clone();
    }

    @Override
    public String toString() {
        return "number of soldiers in Platoon : " +
                numberSoldiers + "\n" +
                "number of ammo in Platoon : " +
                numberAmmo +
                "\n" + "-----------------------------------";
    }
}
