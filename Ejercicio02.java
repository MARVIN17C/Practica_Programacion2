import java.util.Scanner;
//Ventura Vasquez Oliver Marvin
public class EcuacionLineal {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    public EcuacionLineal(double a, double b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public boolean tieneSolucion(){
        return (this.a * this.d - this.b * this.c) != 0;
    }
    public double getX()
    {
        return ((e*d)-(b*f)/(a*d)-(b*c));
    }
    public double getY()
    {
        return ((a*f)-(e*c)) / ((a*d)-(b*c));
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese a,b,c,d,e,f: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();

        EcuacionLineal ecuacion1 = new EcuacionLineal(a,b,c,d,e,f);
        if(ecuacion1.tieneSolucion()){
            System.out.printf("X=%.1f , Y=%.1f\n",ecuacion1.getX(), ecuacion1.getY());
        }else{
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}
