package domain;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PrendaTest {

    @Test
    public void crearUnaPrendaConColorPrimario(){
        Prenda prenda = new Prenda(Trama.LISA,TipoPrenda.CAMISA, Material.ALGODON,Color.BLACK,null);
        Assert.assertEquals(prenda.getTipoPrenda(),TipoPrenda.CAMISA);
        Assert.assertEquals(prenda.getColorPrimario(),Color.BLACK);
        Assert.assertEquals(TipoPrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
    }

    @Test
    public void crearUnaPrendaConColorSecundario(){
        Prenda prenda = new Prenda(Trama.LISA,TipoPrenda.CAMISA,Material.ALGODON, Color.BLACK,Color.DARK_GRAY);
        Assert.assertEquals(prenda.getTipoPrenda(),TipoPrenda.CAMISA);
        Assert.assertEquals(prenda.getColorPrimario(),Color.BLACK);
        Assert.assertEquals(prenda.getColorSecundario(),Color.DARK_GRAY);
        Assert.assertEquals(TipoPrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
    }

    @Test
    public void crarUnaPrendaConColorPrimarioPorPasos(){
        Prenda prenda = new PrendaBuilder()
            .seleccionarTrama(Trama.LISA)
            .seleccionarTipoPrenda(TipoPrenda.CAMISA)
            .seleccionarMaterial(Material.ALGODON)
            .seleccionarColorPrimario(Color.BLACK)
            .crearPrenda();
    }

    @Test
    public void crarUnaPrendaConColorSecundarioPorPasos(){
        Prenda prenda = new PrendaBuilder()
            .seleccionarTrama(Trama.LISA)
            .seleccionarTipoPrenda(TipoPrenda.CAMISA)
            .seleccionarMaterial(Material.ALGODON)
            .seleccionarColorPrimario(Color.BLACK)
            .seleccionarColorSecundario(Color.DARK_GRAY)
            .crearPrenda();
    }

}
