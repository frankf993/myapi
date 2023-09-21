package it.its.myapi.DTO;

public class LettinoDTO extends AttrezzaturaDTO{
    public boolean disponibile = true;

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}
