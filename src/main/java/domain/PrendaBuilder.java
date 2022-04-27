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

  private void validarCreacion() {
    if (tipoPrenda == null || material == null)
      throw new PrendaBuilderException("Seleccionar tipo de Prenda Primero, y luego el Material");
  }
  public PrendaBuilder seleccionarTipoPrenda(TipoPrenda tipoPrenda){
    this.tipoPrenda =tipoPrenda;
    return this;
  }

  public PrendaBuilder seleccionarMaterial(Material material){
    if (tipoPrenda == null)
      throw new PrendaBuilderException("Seleccionar tipo de Prenda Primero, y luego el Material");
    this.material = material;
    return this;
  }

  public PrendaBuilder seleccionarTrama(Trama trama){
    validarCreacion();
    this.trama = trama;
    return this;
  }

  public PrendaBuilder seleccionarColorPrimario(Color colorPrimario){
    validarCreacion();
    this.colorPrimario = colorPrimario;
    return this;
  }

  public PrendaBuilder seleccionarColorSecundario(Color colorSecundario){
    validarCreacion();
    this.colorSecundario = colorSecundario;
    return this;
  }

  public Prenda crearPrenda(){
    if (trama == null) trama = Trama.LISA;
    return new Prenda(trama,tipoPrenda,material,colorPrimario,colorSecundario);
  }

}
