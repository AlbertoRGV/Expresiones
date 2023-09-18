/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones;

/**
 *
 * @author Alber
 */
public class enums {
    
    public enum MesesDelAño{
            ENERO,
            FEBRERO,
            MARZO,
            ABRIL,
            MAYO,
            JUNIO,
            JULIO,
            AGOSTO,
            SEPTIEMBRE,
            OCTUBRE,
            NOVIEMBRE,
            DICIEMBRE
}//cierra enum
    
public static void main(String[] args){
    
    MesesDelAño mesActual  = MesesDelAño.AGOSTO;
    
    if (mesActual == MesesDelAño.NOVIEMBRE || mesActual == MesesDelAño.DICIEMBRE){
        System.out.println("Meses finales");
    
    } else {
        System.out.println("OTROS MESES");
    }
    System.out.println("----------");
    
    for(MesesDelAño mes: MesesDelAño.values()){
        System.out.println(mes);
    }//cierra for
}
}
