package service;

import domain.EstadoClima;

public interface ServicioMetereologico {

  EstadoClima obtenerEstadoDelClima(String direccion);
}
