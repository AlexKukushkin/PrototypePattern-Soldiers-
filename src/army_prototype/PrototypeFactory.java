package army_prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private int soldiers;
    private int ammo;
    private int equipment;

    public void setParameters(int soldiers, int ammo, int equipment){
        this.soldiers = soldiers;
        this.ammo = ammo;
        this.equipment = equipment;
        prototypes.put(ModelType.DIVISION, new Division(soldiers));
        prototypes.put(ModelType.PLATOON, new Platoon(soldiers, ammo));
        prototypes.put(ModelType.REGIMENT, new Regiment(soldiers, ammo, equipment));
    }

    public static class ModelType
    {
        public static final String DIVISION = "division";
        public static final String PLATOON = "platoon";
        public static final String REGIMENT = "regiment";
    }

    private  Map<String , PrototypeCapable> prototypes = new HashMap<String, PrototypeCapable>();




    public PrototypeCapable getInstance(final String str) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(str)).clone();
    }
}
