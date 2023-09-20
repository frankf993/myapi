package it.its.myapi.controllers;

import it.its.myapi.DTO.AttrezzaturaDTO;
import it.its.myapi.DTO.ClienteDTO;
import it.its.myapi.DTO.PrenotazioneDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping(value = "/api/prenotazioni", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PrenotazioneDTO> getListaPrenotazioni(){
        ClienteDTO clienteDTO1 = new ClienteDTO(12345,"Carlo","Strozzi");
        ClienteDTO clienteDTO2 = new ClienteDTO(12346,"Rocky","Balboa");
        ClienteDTO clienteDTO3 = new ClienteDTO(12347,"Sid","Vicious");

        AttrezzaturaDTO attrezzaturaDTO = new AttrezzaturaDTO();

        List<PrenotazioneDTO> listaPrenotazioni = new ArrayList<>();

        PrenotazioneDTO prenotazioneDTO1 = new PrenotazioneDTO(
                00000001,
                clienteDTO1.getId(),
                attrezzaturaDTO.getId(),
                "15-08-2023",
                "18-08-2023");
        PrenotazioneDTO prenotazioneDTO2 = new PrenotazioneDTO(
                00000002,
                clienteDTO2.getId(),
                attrezzaturaDTO.getId(),
                "17-08-2023",
                "17-08-2023");
        PrenotazioneDTO prenotazioneDTO3 = new PrenotazioneDTO(
                00000003,
                clienteDTO1.getId(),
                attrezzaturaDTO.getId(),
                "19-08-2023",
                "19-08-2023");

        listaPrenotazioni.add(prenotazioneDTO1);
        listaPrenotazioni.add(prenotazioneDTO2);
        listaPrenotazioni.add(prenotazioneDTO3);

        return listaPrenotazioni;

    }

}
