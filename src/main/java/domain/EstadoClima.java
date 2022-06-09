package domain;

import java.math.BigDecimal;

public class EstadoClima {

  Double valorDeTemperatura;
  String unidadDeTemperatura;

  public EstadoClima(String unidad, Double temperatura){
    this.unidadDeTemperatura = unidad; // F: Fahrenheit o C: Celsius
    this.valorDeTemperatura = temperatura;
  }

}
