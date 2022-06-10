package domain;

import service.ServicioMetereologico;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

    private final GeneradorDeAtuendos generadorDeAtuendos;
    private final List<Prenda> prendas;
    private final ServicioMetereologico servicioMetereologico;

    public Guardarropa(GeneradorDeAtuendos generadorDeAtuendos, ServicioMetereologico servicioMetereologico){
        this.prendas = new ArrayList<>();
        this.generadorDeAtuendos = generadorDeAtuendos;
        this.servicioMetereologico = servicioMetereologico;
    }

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public List<Prenda> obtenerSugerencia(){
        return this.generadorDeAtuendos
            .generarAtuendo(this.prendas,
                this.servicioMetereologico.obtenerEstadoDelClima("Buenos Aires").valorDeTemperatura);
    }

    public void quitarPrenda(Prenda prenda) {
        prendas.remove(prenda);
    }

    public void compartirGuardarropa(Usuario usuario){
        Guardarropas.getInstance().compartirGuardarropas(this,usuario);
    }
}
