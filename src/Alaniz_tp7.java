
import java.util.ArrayList;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Alaniz_tp7 {
    
    public static void main (String[] args){
       
        
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        directorio.agregarCliente(15324562, new Cliente(38438804 ,"Alaniz", "Alejandro", "San Luis", "barrio:puertasdelsol" )); 
        directorio.agregarCliente(15346593, new Cliente(40734560 ,"Manriquez", "Pedro", "Tilisarao", "barrio:pedroponce" ));
        directorio.agregarCliente(15678790, new Cliente(38438804 ,"Alaniz", "Alejandro", "San Luis", "barrio:puertasdelsol" ));
         directorio.buscarCliente(15346593);
         directorio.buscarTelefono("Alaniz");
         directorio.buscarClientes("Tilisarao");
         directorio.borrarCliente(38438804);
   
    }
    
}
