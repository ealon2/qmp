package service.imp;

import domain.EstadoClima;
import service.AccuWeatherAPI;
import service.ServicioMetereologico;

import java.util.List;
import java.util.Map;

public class ClimaService implements ServicioMetereologico {

  AccuWeatherAPI api;

  ClimaService(AccuWeatherAPI api){
    this.api = api;
  }


  private List<Map<String, Object>> llamarAPI(String direccion){

    try{
      return api.getWeather(direccion);
    } catch (RuntimeException e){
      //fallo la llamada
    }
    return null;
  }

  @Override
  public EstadoClima obtenerEstadoDelClima(String direccion){

    Map<String,Object> respuesta = llamarAPI(direccion)
        .stream().filter(k ->k.containsKey("Temperature")).findAny().get(); // Temperature

    //BigDecimal valor = BigDecimal.valueOf(respuesta.containsKey("Value"));
    String tipo = String.valueOf(respuesta.containsKey("Temperature"));
    //TODO> Revisar como filtrar el map correctamente
    return new EstadoClima(tipo,Double.valueOf(100));
  }

}
