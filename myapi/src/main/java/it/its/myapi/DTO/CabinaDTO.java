package it.its.myapi.DTO;

public class CabinaDTO extends AttrezzaturaDTO{
    public int[] idDimensione = {1,2,3};
    public boolean disponibile = true;


    public int[] getIdDimensione() {
        return idDimensione;
    }

    public void setIdDimensione(int[] idDimensione) {
        this.idDimensione = idDimensione;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}
