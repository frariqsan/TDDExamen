public class Moto {
    private int cilindrada;
    private int marcha;
    private int numRuedas;
    private int velocidadActual;

    public Moto() {

    }

    public void subeMarcha() {
        marcha++;
    }

    public void bajaMarcha() {
        if (marcha >= 0) {
            marcha--;
        }
    }

    public void acelera(int kmh) {
        velocidadActual += kmh;
    }

    public void decelera(int kmh) {
        if (velocidadActual >= kmh) {
            velocidadActual -= kmh;
        } else {
            velocidadActual = 0;
        }
    }

    // Getters y setters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
}

