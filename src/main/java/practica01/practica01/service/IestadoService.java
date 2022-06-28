/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.practica01.service;

import java.util.List;
import practica01.practica01.entity.estado;

/**
 *
 * @author Kybz
 */
public interface IestadoService {
    
    public List<estado> getAllestado();
    public estado getEstadoById (long id);
    public void saveEstado (estado Estado);
    public void delete (long id);
    
}
