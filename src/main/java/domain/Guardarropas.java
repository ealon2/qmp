package domain;

import service.ServicioMetereologico;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {

    private final GeneradorDeSugerencias generadorDeSugerencias;
    private final List<Prenda> prendas;
    private final ServicioMetereologico servicioMetereologico;

    public Guardarropas(GeneradorDeSugerencias generadorDeSugerencias, ServicioMetereologico servicioMetereologico){
        this.prendas = new ArrayList<Prenda>();
        this.generadorDeSugerencias = generadorDeSugerencias;
        this.servicioMetereologico = servicioMetereologico;
    }

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public List<Prenda> obtenerSugerencia(){
        return this.generadorDeSugerencias
            .generarSugerencia(this.prendas,
                this.servicioMetereologico.obtenerTemperatura("Buenos Aires"));
    }

}
