package domain;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

@Data
public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;

    Prenda (@NotNull TipoPrenda tipoPrenda, @NotNull Material material, @NotNull Color colorPrimario){
        this.tipoPrenda = tipoPrenda;
        this.colorPrimario = colorPrimario;
        this.material = material;
    }

    Prenda (@NotNull TipoPrenda tipoPrenda, @NotNull Material material,@NotNull Color colorPrimario, @NotNull Color colorSecundario){
        this.tipoPrenda = tipoPrenda;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.material = material;
    }
}
