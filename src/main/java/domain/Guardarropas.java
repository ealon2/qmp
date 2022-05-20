package domain;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {

    private List<Prenda> prendas;

    private List<Sugerencia> sugerencias;

    public Guardarropas(){
        this.prendas = new ArrayList<Prenda>();
        this.sugerencias = new ArrayList<Sugerencia>();
    }

    public void aceptarSugerencia(Sugerencia sugerencia){
        sugerencia.ejectuar(this);
    }

    public void reversarSugerencia(Sugerencia sugerencia){
        sugerencia.reversar(this);
    }

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public void quitarPrenda(Prenda prenda) {
        this.prendas.remove(prenda);
    }

    public List<Prenda> getPrendas(){
        return prendas;
    }

    public List<Sugerencia> obtenerSugerencias() {
        return sugerencias;
    }

    public void agregrarSugerencia(Sugerencia sugerencia) {
        this.sugerencias.add(sugerencia);
    }

    public void quitarSugerencia(Sugerencia sugerencia) {
        this.sugerencias.remove(sugerencia);
    }

    public List<Prenda> obtenerPrendas() {
        return prendas;
    }

}
