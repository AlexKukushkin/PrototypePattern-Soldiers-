package army_prototype;

public class Division implements PrototypeCapable {
    private int numberSoldiers = 0;

    public Division(int numberSoldiers) {
        this.numberSoldiers = numberSoldiers;
    }

    public int getNumberSoldiers() {
        return numberSoldiers;
    }

    public void setNumberSoldiers(int numberSoldiers) {
        this.numberSoldiers = numberSoldiers;
    }

    @Override
    public Division clone() throws CloneNotSupportedException {
        System.out.println("Cloning Division object");
        return (Division)super.clone();
    }

    @Override
    public String toString() {
        return "number of soldiers in Division : " +
                numberSoldiers +
                "\n" + "-----------------------------------";
    }
}
