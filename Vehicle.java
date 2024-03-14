public class Vehicle
{
    private double cost;
    private int seats;

    boolean doors = false;

    public Vehicle(double c, int s)
    {
        cost = c;
        seats = s;
//        print();
    }

    public Vehicle()
    {
        cost = 0.00;
        seats = 2;
//        print();
    }
    public void terminate()
    {
        doors = false;
        seats = 0;
        cost = 0;
    }
    public void setCost(int c)
    {
        cost = c;
    }
    public void setSeats(int s)
    {
        seats = s;
    }
    public void setDoor(boolean d)
    {
        doors = d;
    }
    public void rev()
    {
        System.out.println("VROOOOOOOOOOOOOOOOOM");
    }

    public double getCost()
    {
        return cost;
    }

    public int getSeats()
    {
        return seats;
    }

    public boolean hasDoors()
    {
        return doors;
    }

    public void giveDoor()
    {
        doors = true;
    }

    public boolean equals(Object o)
    {
        return cost == ((Bus)o).getCost() && seats == ((Bus)o).getSeats();
    }
    public String toString()
    {
        return "Vehicle: costs $" + cost + ", and seats " + seats + " people.";
    }


    public void print()
    {
        System.out.println(toString());
    }

}
