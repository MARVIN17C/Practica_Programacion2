import java.util.Scanner;
//Ventura Vasquez Oliver Marvin
public class EcuacionLineal2 {
    private double a;
    private double b;
    private double c;

    public EcuacionLineal2(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminante(){
        return ( Math.pow(b,2) - (4*a*c));
    }
    public double getRaiz1(){
        return (-b+ Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);
    }
    public double getRaiz2(){
        return (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c)))) / (2*a);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese a: "); double a= sc.nextDouble();
        System.out.println("Ingrese b: "); double b=sc.nextDouble();
        System.out.println("Ingresa c: "); double c=sc.nextDouble();

        EcuacionLineal2 ecuacion1 = new EcuacionLineal2(a,b,c);
        if (ecuacion1.getDiscriminante() > 0 ){
            System.out.println("R1 = "+ecuacion1.getRaiz1());
            System.out.println("R2 = "+ecuacion1.getRaiz2());
        }if(ecuacion1.getDiscriminante() == 0){
            System.out.println("R1 = "+ecuacion1.getRaiz1());
        }else{
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}
