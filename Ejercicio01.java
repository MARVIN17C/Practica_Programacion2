import java.time.Instant;
import java.time.Duration;
class Cronometro {
    private Instant inicia;
    private Instant finaliza;

    public Cronometro() {
        this.inicia = Instant.now();
        this.finaliza=Instant.now();
    }
    public void inicia() {
        this.inicia = Instant.now();
    }
    public void detener() {
        this.finaliza = Instant.now();
    }
    public long lapsoDeTiempo() {
        return Duration.between(inicia, finaliza).toMillis();
    }
    public Instant getInicia() {
        return inicia;
    }
    public Instant getFinaliza() {
        return finaliza;
    }

    public static void main(String[] args) {
        double[] numeros = new double[100000];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random() * 100000;
        }
        Cronometro reloj = new Cronometro();
        System.out.println("Ordenando 100000 números, espera");
        reloj.inicia();
        ordenarPorSeleccion(numeros);
        reloj.detener();
        System.out.println("El tiempo de duracion es: " + reloj.lapsoDeTiempo() + " milisegundos");
    }
    public static void ordenarPorSeleccion(double[] orden) {
        for (int i = 0; i < orden.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < orden.length; j++) {
                if (orden[j] < orden[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            double temporal = orden[indiceMinimo];
            orden[indiceMinimo] = orden[i];
            orden[i] = temporal;
        }
    }
}
