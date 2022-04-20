package domain;

public enum TipoPrenda{

    CAMISA(CategoriaPrenda.SUPERIOR),
    PANTALON(CategoriaPrenda.INFERIOR),
    REMERA(CategoriaPrenda.SUPERIOR);

    CategoriaPrenda categoriaPrenda;

    TipoPrenda(CategoriaPrenda categoriaPrenda){
        this.categoriaPrenda = categoriaPrenda;
    }

    CategoriaPrenda getCategoria(){
        return categoriaPrenda;
    }
}
