package domain;

import java.math.BigDecimal;

public class EstadoClima {

  BigDecimal valorDeTemperatura;
  String unidadDeTemperatura;

  public EstadoClima(String unidad, BigDecimal temperatura){
    this.unidadDeTemperatura = unidad; // F: Fahrenheit o C: Celsius
    this.valorDeTemperatura = temperatura;
  }

}
