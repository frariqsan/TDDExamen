import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TMoto {
    private Moto moto;
    @BeforeEach
    public void TMoto1(){
        moto = new Moto();
    }
    //CREO EL TEST DE SUBEMARCHA
    @Test
    public void subeMarcha(){
        int marchaInicial = moto.getMarcha();
        moto.subeMarcha();
        int marchaActual = moto.getMarcha();

        Assertions.assertEquals(marchaInicial + 1, marchaActual);
    }
    //CREO EL TEST DE BAJARMARCHA
    @Test
    public void bajaMarcha(){
        int marchaInicial = moto.getMarcha();
        moto.bajaMarcha();
        int marchaActual = moto.getMarcha();

        Assertions.assertEquals(marchaInicial - 1, marchaActual);

    }
    //CREO EL TEST DE ACELERA
    @Test
    public void acelera(){
        int velocidadInicial = moto.getVelocidadActual();
        int incremento = 40;
        moto.acelera(incremento);
        int velocidadActual = moto.getVelocidadActual();

        Assertions.assertEquals(velocidadInicial + incremento, velocidadActual);
    }
    // CREO EL TEST DE DECELERA
    @Test
    public void decelera(){
        int velocidadInicial = moto.getVelocidadActual();
        moto.decelera(10);
        int velocidadActual = moto.getVelocidadActual();

        Assertions.assertEquals(velocidadInicial - 10, velocidadActual);

    }
}
