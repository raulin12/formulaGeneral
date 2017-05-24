/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author raul
 */
public class Ecu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        
        // introducimos los valores 
        EcuacionDeSegundoGrado ecuacionNumero1 = new EcuacionDeSegundoGrado(15, 1, -12);
        // expresamos loa resultados
        System.out.println("----------------- prueba uno -----------------------------------");
        
        // mostramos lo svalores introducidos
        System.out.println("valor de A: "  + ecuacionNumero1.coeficienteA);
        System.out.println("valor de B: "  + ecuacionNumero1.coeficienteB);
        System.out.println("valor de C: "  + ecuacionNumero1.coeficienteC);
        
       // mostramos los resultados 
        System.out.println("El discrimiante es: " + ecuacionNumero1.getDiscriminante());
        System.out.println("numero de raizes: " + ecuacionNumero1.getNumeroDeSoluciones());
        
        //mostramos la cantidad de raizes
        System.out.println("raiz 1 =  " + ecuacionNumero1.getRaiz1());
        System.out.println("raiz 2 =  " + ecuacionNumero1.getRaiz2());
        
        System.out.println("----------------- prueba dos -----------------------------------");
    EcuacionDeSegundoGrado ecuacionNumero2 = new EcuacionDeSegundoGrado(10, -48, -900);
    // mostramos lo svalores introducidos
        System.out.println("valor de A: "  + ecuacionNumero2.coeficienteA);
        System.out.println("valor de B: "  + ecuacionNumero2.coeficienteB);
        System.out.println("valor de C: "  + ecuacionNumero2.coeficienteC);
        
       // mostramos los resultados 
        System.out.println("El discrimiante es: " + ecuacionNumero2.getDiscriminante());
        System.out.println("numero de raizes: " + ecuacionNumero2.getNumeroDeSoluciones());
        
        //mostramos la cantidad de raizes
        System.out.println("raiz 1 =  " + ecuacionNumero2.getRaiz1());
        System.out.println("raiz 2 =  " + ecuacionNumero2.getRaiz2());
       
        
        System.out.println("----------------- prueba tres -----------------------------------");
    EcuacionDeSegundoGrado ecuacionNumero3 = new EcuacionDeSegundoGrado(18, -3, -25);
    // mostramos lo svalores introducidos
        System.out.println("valor de A: "  + ecuacionNumero3.coeficienteA);
        System.out.println("valor de B: "  + ecuacionNumero3.coeficienteB);
        System.out.println("valor de C: "  + ecuacionNumero3.coeficienteC);
        
       // mostramos los resultados 
        System.out.println("El discrimiante es: " + ecuacionNumero3.getDiscriminante());
        System.out.println("numero de raizes: " + ecuacionNumero3.getNumeroDeSoluciones());
        
        //mostramos la cantidad de raizes
        System.out.println("raiz 1 =  " + ecuacionNumero3.getRaiz1());
        System.out.println("raiz 2 =  " + ecuacionNumero3.getRaiz2());
    }
    
}
