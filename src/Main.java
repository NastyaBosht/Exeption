public class Main {

    public static void main(String[] args) {

        try{

            Vector r = new Vector();
            r.Read();
            r.Init(123, 1.4, 3.7);
            r.Display();


            Vector p = new Vector();
            p.Read();
            p.Init(1.2, 3.1, 6.2);
            p.Display();

            Vector q = new Vector();
            q = Vector.Scalar(r, p);
            System.out.println("Scalar = ");
            q.Display();

            q=Vector.add(r,p);
            System.out.println("Suma: ");
            q.Display();

            q  = Vector.minus(r, p);
            System.out.println("Minus: ");
            q.Display();

        } catch(MyExeption p) {
            System.out.println("Result is impossible!" + p.getMessage());
        }

    }
}
