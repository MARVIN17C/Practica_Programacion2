import java.util.Scanner;
public class Estadistica {
    private double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio(){
        double suma = 0;
        for(double n : numeros){
            suma += n;
        }
        return (suma) / (10);
    }

    public double desviacion(){
        double prom = promedio();
        double suma = 0;

        for(double n : numeros){
            suma += Math.pow(n - prom, 2);
        }
        return Math.sqrt(suma / (10-1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] datos = new double[10];

        for(int k = 0; k < 10; k++){
            System.out.print("Ingresa el numero: ");
            datos[k] = sc.nextDouble();
        }
        Estadistica est = new Estadistica(datos);
        System.out.println("El promedio es: "+est.promedio());
        System.out.println("La desviacion estandar es: "+est.desviacion());
    }
}
