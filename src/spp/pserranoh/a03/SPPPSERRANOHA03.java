/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.a03;
import java.util.*;
/**
 *
 * @author Pablo 
 */
public class SPPPSERRANOHA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double adyCat,opuCat,hipotenusa;
    adyCat=pedirCat("Escribe la medida del primer cateto");
    opuCat=pedirCat("Escribe la medido del segundo cateto");
    hipotenusa=operaHip(adyCat,opuCat);
    mostrarHip(adyCat,opuCat,hipotenusa);
       
    }
     public static double pedirCat(String Cat){
    double cat;//pido dos catetos en un solo metodo
    Scanner teclear=new Scanner(System.in);
    System.out.println(Cat);
    cat=teclear.nextDouble();
    return cat;
     }
    public static double operaHip(double primer, double segundo){
    double hip=Math.pow(primer,2)+Math.pow(segundo,2),hipo=Math.sqrt(hip);
    return hipo;//hago las operaciones y devuelvo el resultado
    }
    public static void mostrarHip(double prim,double seg,double hipo){ 
        //despliego el resultado
        System.out.println("La hipotenusa de dos catetos con las medidas :  "+prim+" y "+seg+"  es  "+hipo);
    }
}
