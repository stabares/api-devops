package com.amoelcodigo.crud.service;

import com.amoelcodigo.crud.entity.Torre;
import com.amoelcodigo.crud.repository.TorreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TorreService {
    @Autowired
    TorreRepository torreRepository;

    //Por defecto el repositorio al extender de JPA trae el metodo por defecto
    public List<Torre> listaTorre(){
        return  torreRepository.findAll();
    }

    public Optional<Torre> getTorre(String idTorre){
        return  torreRepository.findById(Integer.valueOf(idTorre));
    }

    public Optional<Torre> getByNombreTorre(String nombreTorre){
        return torreRepository.findByNombreTorre(nombreTorre);
    }

    public Optional<Torre> getByIdTorre(String idTorre){
        return torreRepository.findByIdTorre(idTorre);
    }

    public void saveTorre(Torre torre){
        torreRepository.save(torre);
    }

    public void deleteTorre(String idTorre){
        torreRepository.deleteById(Integer.valueOf(idTorre));
    }

    public boolean existsByIdTorre(String idTorre){
        return torreRepository.existsByIdTorre(idTorre);
    }

    public boolean existsByNombreTorre(String nombreTorre){
        return torreRepository.existsByNombreTorre(nombreTorre);
    }


}
