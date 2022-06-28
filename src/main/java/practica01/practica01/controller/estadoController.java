/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.practica01.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica01.practica01.entity.estado;
import practica01.practica01.service.IestadoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kybz
 */
public class estadoController {
    
    @Autowired
    private IestadoService estadoService;
    
    @GetMapping("/estado")
    public String index (Model model){
        
        List<estado> listaEstado = estadoService.getAllestado();
        model.addAttribute("titulo", "tabla estado");
        model.addAttribute("estado", listaEstado);
        
        return "estado";
        
    }
    
    @GetMapping ("/estadoN")
    public String crearEstado (Model model){
        
        model.addAttribute("estado",new estado());
        
        return "crear";
        
        
    }
    
    @PostMapping ("/save")
    public String guardarEstado (@ModelAttribute estado Estado){
        estadoService.saveEstado(Estado);
        
        return "redirect:/estado";
        
        
    }
    
    @GetMapping("/delete/(id)")
    public String eliminarEstado (@PathVariable("id") Long idEstado){
        estadoService.delete(idEstado);
        return "redirect:/estado";
        
    }
    
    
}
