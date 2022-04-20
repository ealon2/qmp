package domain;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PrendaTest {

    @Test
    public void crearUnaPrendaConColorPrimario(){
        Prenda prenda = new Prenda(TipoPrenda.CAMISA, Material.ALGODON,Color.BLACK);
        Assert.assertEquals(prenda.getTipoPrenda(),TipoPrenda.CAMISA);
        Assert.assertEquals(prenda.getColorPrimario(),Color.BLACK);
        Assert.assertEquals(TipoPrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
    }

    @Test
    public void crearUnaPrendaConColorSecundario(){
        Prenda prenda = new Prenda(TipoPrenda.CAMISA,Material.ALGODON, Color.BLACK,Color.DARK_GRAY);
        Assert.assertEquals(prenda.getTipoPrenda(),TipoPrenda.CAMISA);
        Assert.assertEquals(prenda.getColorPrimario(),Color.BLACK);
        Assert.assertEquals(prenda.getColorSecundario(),Color.DARK_GRAY);
        Assert.assertEquals(TipoPrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
    }
}
