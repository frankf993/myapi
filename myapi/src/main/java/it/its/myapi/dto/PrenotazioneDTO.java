package it.its.myapi.dto;



public class PrenotazioneDTO {
    public long id;
    public long idCliente;
    public long idAttrezzatura;
    public String dataInizio;
    public String dataFine;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdAttrezzatura() {
        return idAttrezzatura;
    }

    public void setIdAttrezzatura(long idAttrezzatura) {
        this.idAttrezzatura = idAttrezzatura;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataFine() {
        return dataFine;
    }

    public void setDataFine(String dataFine) {
        this.dataFine = dataFine;
    }

    public PrenotazioneDTO(long id, long idCliente, long idAttrezzatura, String dataInizio, String dataFine) {
        this.id = id;
        this.idCliente = idCliente;
        this.idAttrezzatura = idAttrezzatura;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }
}
