package domain;

public class QuitarPrenda implements Sugerencia {

  private Prenda prenda;

  QuitarPrenda(Prenda prenda){
    this.prenda = prenda;
  }

  @Override
  public void ejectuar(Guardarropa guardarropa){
    guardarropa.quitarPrenda(prenda);
  }

  @Override
  public void reversar(Guardarropa guardarropa){
    guardarropa.agregarPrenda(prenda);
  }
}