package domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Guardarropas {

  private static Guardarropas instance = new Guardarropas();
  private HashMap<Guardarropa, List<Usuario>> guardarropasCompartidos;
  private HashMap<Usuario,List<Guardarropa>> guardarropas;

  private Guardarropas(){
    guardarropasCompartidos = new HashMap<>();
    guardarropas = new HashMap<>();
  }

  public static Guardarropas getInstance(){
    return instance;
  }

  public void compartirGuardarropas(Guardarropa guardarropa, Usuario usuario){
    if (this.guardarropasCompartidos.containsKey(guardarropa)){
      this.guardarropasCompartidos.get(guardarropa).add(usuario);
    }
    this.guardarropasCompartidos.put(guardarropa, Arrays.asList(usuario));
  }

  public void agregarGuardarropas(Usuario usuario, Guardarropa guardarropa){
    if (this.guardarropas.containsKey(usuario)){
      this.guardarropas.get(usuario).add(guardarropa);
    }
    this.guardarropas.put(usuario, Arrays.asList(guardarropa));
  }

  public void quitarGuardarropas(Usuario usuario, Guardarropa guardarropa){
    if (this.guardarropas.containsKey(usuario)){
      this.guardarropas.get(usuario).remove(guardarropa);
    }
  }
}
