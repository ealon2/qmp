package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class PrendaTest {
    private Prenda prenda;
    @Test
    public void crearUnaPrendaConColorPrimario(){
        prenda = new Prenda(Trama.LISA,TipoPrenda.CAMISA, Material.ALGODON,Color.BLACK,null);
        assertEquals(prenda.getTipoPrenda(),TipoPrenda.CAMISA);
        assertEquals(prenda.getColorPrimario(),Color.BLACK);
        assertEquals(TipoPrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
    }

    @Test
    public void crearUnaPrendaConColorSecundario(){
        prenda = new Prenda(Trama.LISA,TipoPrenda.CAMISA,Material.ALGODON, Color.BLACK,Color.DARK_GRAY);
        assertEquals(prenda.getTipoPrenda(),TipoPrenda.CAMISA);
        assertEquals(prenda.getColorPrimario(),Color.BLACK);
        assertEquals(prenda.getColorSecundario(),Color.DARK_GRAY);
        assertEquals(TipoPrenda.CAMISA.getCategoria(),CategoriaPrenda.SUPERIOR);
    }

    @Test
    public void crarUnaPrendaConColorPrimarioPorPasos(){
        prenda = new PrendaBuilder()
            .seleccionarTipoPrenda(TipoPrenda.CAMISA)
            .seleccionarMaterial(Material.ALGODON)
            .seleccionarTrama(Trama.LISA)
            .seleccionarColorPrimario(Color.BLACK)
            .crearPrenda();
    }

    @Test
    public void crarUnaPrendaConColorSecundarioPorPasos(){
        prenda = new PrendaBuilder()
            .seleccionarTipoPrenda(TipoPrenda.CAMISA)
            .seleccionarMaterial(Material.ALGODON)
            .seleccionarTrama(Trama.LISA)
            .seleccionarColorPrimario(Color.BLACK)
            .seleccionarColorSecundario(Color.DARK_GRAY)
            .crearPrenda();
    }

    @Test
    public void crearUnaPrendaSinSeleccionarMaterialSegundoPaso(){

        try {
            prenda = new PrendaBuilder()
                .seleccionarTrama(Trama.LISA)
                .seleccionarTipoPrenda(TipoPrenda.CAMISA)
                .seleccionarMaterial(Material.ALGODON)
                .seleccionarColorPrimario(Color.BLACK)
                .crearPrenda();
        } catch (PrendaBuilderException prendaBuilderException){
            assertNotNull(prendaBuilderException);
        }
    }

    @Test
    public void crearUnaPrendaSinSeleccionarTipoPrimerPaso(){
        try {
            prenda = new PrendaBuilder()
                .seleccionarTrama(Trama.LISA)
                .seleccionarTipoPrenda(TipoPrenda.CAMISA)
                .seleccionarMaterial(Material.ALGODON)
                .seleccionarColorPrimario(Color.BLACK)
                .crearPrenda();
        } catch (PrendaBuilderException prendaBuilderException){
            assertNotNull(prendaBuilderException);
        }
    }

}
