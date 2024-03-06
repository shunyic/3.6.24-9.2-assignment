public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The TonkaTruck:");
        Vehicle tonkaTruck = new Vehicle(2000, 4);
        System.out.println("The bicyle");
        Vehicle bicycle = new Vehicle();
        System.out.println("The Fortnite Battle Bus:");
        Bus fortniteBattleBus = new Bus(200000, 40, 2, 40);
        System.out.println(fortniteBattleBus.getCost());
        System.out.println(fortniteBattleBus.getSeats());
        System.out.println("The School Bus:");
        Bus schoolBus = new Bus();
        System.out.println(schoolBus.getCost());
        System.out.println(schoolBus.getSeats());
        System.out.println("------------------------------------------------");


        fortniteBattleBus.rev();
        tonkaTruck.rev();

    }
}
