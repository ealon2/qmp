package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GeneradorDeAtuendos {

  private List<Prenda> obtenerPrendaAdecuada(List<Prenda> prendas,Double temperatura,CategoriaPrenda categoriaPrenda){
    List<Prenda> prendasEncontradas = prendas.stream().filter(
        prenda -> prenda.getTemperaturaParaPrenda()>temperatura && prenda.getTipoPrenda().getCategoria().equals(categoriaPrenda)
    ).collect(Collectors.toList());

    if (prendasEncontradas.isEmpty()) throw new SinPrendaParaSugerenciaException();
    return prendasEncontradas;
  }

  private Prenda obtenerPrendaSuperior(List <Prenda> prendas, Double temperatura){
    return this.obtenerPrendaAdecuada(prendas,temperatura,CategoriaPrenda.SUPERIOR).get(0);
  }

  private Prenda obtenerPrendaInferior(List <Prenda> prendas, Double temperatura){
    return this.obtenerPrendaAdecuada(prendas,temperatura,CategoriaPrenda.INFERIOR).get(0);
  }

  private Prenda obtenerAccesorio(List <Prenda> prendas, Double temperatura){
    return this.obtenerPrendaAdecuada(prendas,temperatura,CategoriaPrenda.ACCESORIO).get(0);
  }

  private Prenda obtenerCalzado(List <Prenda> prendas, Double temperatura){
    return this.obtenerPrendaAdecuada(prendas,temperatura,CategoriaPrenda.CALZADO).get(0);
  }

  public List<Prenda> generarAtuendo(List<Prenda> prendas, Double temperatura){
    ArrayList<Prenda> atuendo = new ArrayList<>();
    atuendo.add(obtenerPrendaSuperior(prendas,temperatura));
    atuendo.add(obtenerPrendaInferior(prendas,temperatura));
    atuendo.add(obtenerAccesorio(prendas,temperatura));
    atuendo.add(obtenerCalzado(prendas,temperatura));
    return atuendo;
  }
}
