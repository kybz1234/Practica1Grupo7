/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.practica01.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practica01.practica01.entity.estado;
import practica01.practica01.repository.estadoRepository;

/**
 *
 * @author Kybz
 */
@Service

public class estadoService implements IestadoService{
    
    @Autowired
    private estadoRepository estadoRepository;
    
    @Override
    public List<estado> getAllestado() {
        return (List<estado>) estadoRepository.findAll();
    }

    @Override
    public estado getEstadoById(long id) {
       return estadoRepository.findById(id).orElse(null); 
    }

    @Override
    public void saveEstado(estado Estado) {
      estadoRepository.save(Estado);  
    }

    @Override
    public void delete(long id) {
       estadoRepository.deleteById(id); 
    }

}
