public class Main
{
    public static void main(String[] args)
    {
//        System.out.println("The TonkaTruck:");
//        Vehicle tonkaTruck = new Vehicle(2000, 4);
//        System.out.println("The bicyle");
//        Vehicle bicycle = new Vehicle();
//        System.out.println("The Fortnite Battle Bus:");
//        Bus fortniteBattleBus = new Bus(200000, 40, 2, 40);
//        System.out.println(fortniteBattleBus.getCost());
//        System.out.println(fortniteBattleBus.getSeats());
//        System.out.println("The School Bus:");
//        Bus schoolBus = new Bus();
//        System.out.println(schoolBus.getCost());
//        System.out.println(schoolBus.getSeats());
//        System.out.println("------------------------------------------------");
//        fortniteBattleBus.rev();
//        tonkaTruck.rev();
//        System.out.println("------------------------------------------------");
//        System.out.println(fortniteBattleBus.getDoors());
//        System.out.println(tonkaTruck.hasDoors());
//        fortniteBattleBus.giveDoor(10);
//        tonkaTruck.giveDoor();
//        System.out.println("------------------------------------------------");
//        System.out.println(fortniteBattleBus.getDoors());
//        System.out.println(tonkaTruck.hasDoors());
        Vehicle myBus = new Bus(500000, 100, 20, 100);
        myBus.terminate(myBus);
        myBus.print();
        Vehicle[] junkyard = {new Bus(), new Bus(150000, 10, 2, 10)};
        Vehicle[][] junkyards = {{new Bus(), new Bus(10000, 5, 1, 5)}, {new Bus(15000, 10, 2, 10), new Bus(2000000, 50, 2, 50)}};
        for (Vehicle b : junkyard)
        {
            b.print();
        }
        for (Vehicle[] v : junkyards)
        {
            for (Vehicle rV : v)
            {
                rV.print();
            }
        }
    }
}
