package domain;

public class AgregarPrenda implements Sugerencia {

  private final Prenda prenda;

  public AgregarPrenda(Prenda prenda){
    this.prenda = prenda;
  }

  @Override
  public void ejectuar(Guardarropa guardarropa){
    guardarropa.agregarPrenda(prenda);
  }

  @Override
  public void reversar(Guardarropa guardarropa){
    guardarropa.quitarPrenda(prenda);
  }
}
