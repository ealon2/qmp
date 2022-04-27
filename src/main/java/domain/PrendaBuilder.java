package domain;

import java.awt.*;

public class PrendaBuilder {

  private Trama trama;
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public PrendaBuilder(){
  }

  public PrendaBuilder seleccionarTrama(Trama trama){
    this.trama = trama;
    return this;
  }

  public PrendaBuilder seleccionarTipoPrenda(TipoPrenda tipoPrenda){
    this.tipoPrenda =tipoPrenda;
    return this;
  }

  public PrendaBuilder seleccionarMaterial(Material material){
    this.material = material;
    return this;
  }

  public domain.PrendaBuilder seleccionarColorPrimario(Color colorPrimario){
    this.colorPrimario = colorPrimario;
    return this;
  }

  public domain.PrendaBuilder seleccionarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
    return this;
  }

  public Prenda crearPrenda(){
    return new Prenda(trama,tipoPrenda,material,colorPrimario,colorSecundario);
  }

}
