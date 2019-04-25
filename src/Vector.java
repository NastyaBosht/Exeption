public class Vector {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    public void setX(double value) throws MyExeption{
        if(value>100)
            throw new MyExeption(" x - too large!");
        x = value;
    }

    public void setY(double value) throws MyExeption{
        if(value>100)
            throw new MyExeption(" y - too large!");
        y = value;
    }

    public void setZ(double value) throws MyExeption{
        if(value>100)
            throw new MyExeption(" z - too large!");
        z = value;
    }

    public Vector (){
        x=y=z = 0;
    }

    public Vector(double a, double b, double c) throws MyExeption {

        setX(a);
        setY(b);
        setZ(c);
    }


    public Vector(Vector t){
        this.x=t.x;
        this.y = t.y;
        this.z = t.z;
    }

    public void Display() {
        System.out.println(x+" " + " " + y + " " + z );
    }

    public  static Vector add(Vector a, Vector b) throws MyExeption {


        Vector m = new Vector();
        m.x = a.x +b.x;
        m.y = a.y + b.y;
        m.z = a.z + b.z;
        return m;
    }


    public static Vector minus(Vector a , Vector b ) throws MyExeption {

        Vector m = new Vector();
        m.x = a.x -b.x;
        m.y = a.y - b.y;
        m.z = a.z - b.z;
        return m;
    }

    public static Vector Scalar(Vector a, Vector b) throws MyExeption {

        Vector m = new Vector();
        m.x = a.x * b.x;
        m.y = a.y * b.y;
        m.z = a.z * b.z;
        return m;
    }

    public void Read() throws MyExeption{

        Init(x,y,z);
    }

    public void Init(double x, double y, double z) throws MyExeption{
        setX(x);
        setY(y);
        setZ(z);

    }
}
