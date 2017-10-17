package army_prototype;

public class Regiment implements PrototypeCapable{
    private int numberSoldiers = 0;
    private int numberAmmo = 0;
    private int numberEquipment = 0;

    public Regiment(int numberSoldiers, int numberAmmo, int numberEquipment) {
        this.numberSoldiers = numberSoldiers;
        this.numberAmmo = numberAmmo;
        this.numberEquipment = numberEquipment;
    }

    public int getNumberEquipment() {
        return numberEquipment;
    }

    public void setNumberEquipment(int numberEquipment) {
        this.numberEquipment = numberEquipment;
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
    public Regiment clone() throws CloneNotSupportedException {
        System.out.println("Cloning Regiment object");
        return (Regiment) super.clone();
    }

    @Override
    public String toString() {
        return "number of soldiers in Regiment : " + numberSoldiers + "\n" +
                "number of ammo in Regiment : " + numberAmmo + "\n" +
                "number of equipment in Regiment : " + numberEquipment +
                "\n" + "-----------------------------------";
    }
}
