package domain;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Trama trama;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;

    private Double temperatura;

    Prenda (@NotNull Trama trama,@NotNull TipoPrenda tipoPrenda, @NotNull Material material, @NotNull Color colorPrimario, @Nullable Color colorSecundario, Double temperatura){
        this.trama = trama;
        this.tipoPrenda = tipoPrenda;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.temperatura = temperatura;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public Trama getTrama() {
        return trama;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Double getTemperaturaParaPrenda() {
        return temperatura;
    }
}
