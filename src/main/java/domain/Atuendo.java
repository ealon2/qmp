package domain;

import java.util.List;

/**
 * Observacion 1. Yo podría modelar separando por tipo de prenda (Sup, inf, etc).
 * Pero esto si bien maneja un mejor nivel de abstraccion, me limita si al dia de manana
 * aparece un nuevo tipo. Por este motivo, opto por usar una Lista de Prendas.
 *
 * Observacion 2. La validacion correspondiente sobre el tipo de prenda que estoy agregando
 * lo hare fuera de Atuendo, puede ser el mismo Frontend, o dentro del dominio por medio de una
 * clase Builder.
 */
public class Atuendo {

  List<Prenda> prendas;

  /**
   * No tiene sentido que sea mutable la cantidad de prendas,
   * por ese motivo lo pasamos por el contructor, y no agregamos un ADD.
   * @param prendas listado de prendas que conforman un atuendo.
   */
  public Atuendo(List<Prenda> prendas) {
    this.prendas = prendas;
  }


}
