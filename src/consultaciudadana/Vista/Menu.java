/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultaciudadana.Vista;

import consultaciudadana.Controlador.*;
import consultaciudadana.Modelo.*;
import java.io.*;

/**
 *
 * @author alexm
 */
public class Menu {
    
    private int opcion;
    private ManejoDeColleciones llamar;
    //Cambiar 
    private ColeccionTema temas;
    private MapaTemas mapaTema;

    public Menu(ManejoDeColleciones llamar){
        this.llamar = new ManejoDeColleciones();
        this.llamar = llamar;
        temas = llamar.getTemas();
        mapaTema = llamar.getMapaTemas();
    }
        
    public void mostrarMenu() throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("(1) Agregar nuevo tema");
            System.out.println("(2) Agregar nueva consulta");
            System.out.println("(3) Mostrar todos los temas");
            System.out.println("(4) Mostrar todas consultas");
            System.out.println("(0) Para salir");
            opcion = Integer.parseInt(lector.readLine());
            
            switch (opcion){
            
                case 1:
                    opcionUnoMenuAgregarTema();
                    break;
                    
                case 2:
                    opcionDosAgregarConsulta();
                    break;
                
                case 3:
                    opcionTresMostrarSoloTemas();
                    break;
                case 4:
                    opcionCuatroMostrarSoloConsultas();
                    break;
            }
            
        }while(opcion != 0);        

    }
    
    
    public void opcionUnoMenuAgregarTema()throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Tema auxTema = new Tema();
        do {
            System.out.println("Ingrese id del tema:");
            auxTema.setTipoTema(lector.readLine());
            if((llamar.existeEnMapaTemas(auxTema.getTipoTema(), mapaTema)))
                System.out.println("Tipo ya existe, ingrese otro distinto");
        } while (llamar.existeEnMapaTemas(auxTema.getTipoTema(), mapaTema));
        System.out.println("Ingrese el titulo del tema:");
        auxTema.setTitulo(lector.readLine());
        System.out.println("Ingrese la descripcion del tema:");
        auxTema.setDescripcion(lector.readLine());
        llamar.agregarTema(temas, mapaTema, auxTema);
    }
    
    public void opcionDosAgregarConsulta () throws IOException{
        String idTema;
        System.out.println("Listado de temas");
        Consulta nuevaConsulta = new Consulta();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < temas.size(); i++) {
            System.out.println("(" +(1+i) +")" + "Titulo del tema: "+temas.get(i).getTitulo());
            System.out.println("Descripcion del tema: "+temas.get(i).getDescripcion());
            System.out.println("");
        }
        System.out.println("Ingrese el numero del tema donde desea agregar una consulta:");
        
        idTema = lector.readLine();
        while(!(Integer.parseInt(idTema)<=temas.size()&& Integer.parseInt(idTema)>0)){
            System.out.println("El tema no se encuentra registrado, ingrese uno valido: ");
            idTema = lector.readLine();
        }
        nuevaConsulta = crearConsulta(temas.get(Integer.parseInt(idTema)-1));        
        llamar.agregarConsulta(idTema,nuevaConsulta);
    }
    
    public Consulta crearConsulta(Tema tema) throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Consulta auxConsulta = new Consulta();
        System.out.println("Ingrese id de la consulta:");
        auxConsulta.setIdConsulta(lector.readLine());
        while(tema.getMapaConsultas().containsKey(auxConsulta.getIdConsulta()))
        {
            System.out.println("Ya existe, ingrese una consulta distinta:");
            auxConsulta.setIdConsulta(lector.readLine());
        }
        System.out.println("Ingrese titulo de la consulta:");
        auxConsulta.setTitulo(lector.readLine());
        System.out.println("Ingrese la descripcion de la consulta:");
        auxConsulta.setDescripcion(lector.readLine());
        return auxConsulta;
    }
    
    public void opcionTresMostrarSoloTemas(){
        for (int i = 0; i < temas.size(); i++) {
            System.out.println("Id del tema: "+temas.get(i).getTipoTema());
            System.out.println("Titulo del tema: "+temas.get(i).getTitulo());
            System.out.println("Descripcion del tema: "+temas.get(i).getDescripcion());
            System.out.println("");
        }
    }
    
    public void opcionCuatroMostrarSoloConsultas(){
        for (int i = 0; i < temas.size(); i++) {
            mostrarConsultas(temas.get(i).getConsultas());
 
        }
    }
    
    public void mostrarConsultas(ColeccionConsultas consultas){
        for (int i = 0; i < consultas.size(); i++) {
            System.out.println("Consulta ");
            System.out.println("Id: "+consultas.get(i).getIdConsulta());
            System.out.println("Titulo: "+consultas.get(i).getTitulo());
            System.out.println("Descripcion: "+consultas.get(i).getDescripcion());
            System.out.println("");
        }
    }
    
    
    
}
