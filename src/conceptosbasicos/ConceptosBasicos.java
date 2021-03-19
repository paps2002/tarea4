/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.automovil;
import java.awt.Color;

/**
 *
 * @author papis
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        automovil miBocho = new automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        automovil miAcura = new automovil();
        miAcura.setMarca("Acura");
        miAcura.setSubMarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.GRAY);
        System.out.println(miAcura);
        
        automovil miMustang = new automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        //Leer las paginas 273-280
        
    }
    
}
