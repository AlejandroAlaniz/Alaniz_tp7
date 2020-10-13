

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;




public class DirectorioTelefonico {

    private TreeMap<Long, Cliente> listaClientes=new TreeMap<>();
    
    public void agregarCliente(long t, Cliente c) {
    
    Cliente cliente = listaClientes.put(t, c);
    if(cliente != null) {
        System.out.println("Cliente no agregado por numero de telefono repetido");
        }else{System.out.println("Cliente agregado con exito ;)");} 
    }

    
    
    public void borrarCliente(long dni) {
        Set<Long> claves = listaClientes.keySet();
        Iterator<Long> it = claves.iterator();
        Long key=-1l;
        
        while(it.hasNext());
        
            if(listaClientes.get(it).getDni()==dni){
               it.remove();  
                
            }
       
        }
       

    


    public Cliente buscarCliente(long t) {
      
          return listaClientes.get(t); 
    }
        
    
    
    
    public ArrayList<Long>  buscarTelefono(String apellido) {
        ArrayList<Long> Telefonos = new ArrayList<>();
       for(Long t: listaClientes.keySet()) { 
       Cliente cliente = listaClientes.get(t);
        if(cliente.getApellido().equalsIgnoreCase(apellido)) // equalsIgnoreCase= sirve para comparar Strings sin importar mayusculas y minusculas. 
        {
          Telefonos.add(t); 
        }
       } 
       
       return Telefonos; 
       
       
    } //buscar clientes que en base a una ciudad 
    //nos devuelba una lista con los clientes asociados a la misma ciudad

    public ArrayList<Cliente>  buscarClientes(String ciudad) {
        ArrayList<Cliente> clientes= new ArrayList<>(); 
        for(Long t: listaClientes.keySet()) { 
            Cliente cliente = listaClientes.get(t);
            if(cliente.getCiudad().equalsIgnoreCase(ciudad))// equalsIgnoreCase = sirve para comparar Strings sin importar mayusculas y minusculas.
            {
               clientes.add(cliente); 
                         }
                } 
        return clientes;
        
    }
}


//ToString() buscar como sobreescribirlo en cliente. 
