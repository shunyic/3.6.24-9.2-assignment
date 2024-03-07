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

    public int getWindows()
    {
        return windows;
    }
    public String toString()
    {
        return "Bus: " + doors + " doors, " + windows + " windows, and " + super.toString();
    }

    public void print()
    {
        System.out.println(toString());
    }
}
