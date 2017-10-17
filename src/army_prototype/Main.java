package army_prototype;


public class Main {
    public static void main(String[] args)
    {
        try
        {
            PrototypeFactory prototypeFactory = new PrototypeFactory();
            prototypeFactory.setParameters(100, 5000, 300);

            String divisionPrototype  = prototypeFactory.getInstance(PrototypeFactory.ModelType.DIVISION).toString();
            System.out.println(divisionPrototype);

            String platoonPrototype  = prototypeFactory.getInstance(PrototypeFactory.ModelType.PLATOON).toString();
            System.out.println(platoonPrototype);

            String regimentPrototype  = prototypeFactory.getInstance(PrototypeFactory.ModelType.REGIMENT).toString();
            System.out.println(regimentPrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}

