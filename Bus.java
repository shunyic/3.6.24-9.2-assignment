public class Bus extends Vehicle
{
    int doors;
    int windows;
    public Bus(double c, int s, int d, int w)
    {
        super(c, s);
        doors = d;
        windows = w;
        print();
    }
    public Bus()
    {
        new Vehicle();
        doors = 0;
        windows = 2;
        print();
    }

    public void rev()
    {
        System.out.println("beep");
    }
    public int getDoors()
    {
        return doors;
    }

    public void giveDoor(int i)
    {
        doors += i;
    }
    public int getWindows()
    {
        return windows;
    }
    public String toString()
    {
        return "Bus: " + doors + " doors, " + windows + " windows, and " + super.toString();
    }

    public void terminate(Vehicle v)
    {
        doors = 0;
        windows = 0;
        super.setCost(0);
        super.setSeasts(0);
        super.setDoor(false);
    }
    public void print()
    {
        System.out.println(toString());
    }
}
