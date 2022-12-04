/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eqq;

/**
 *
 * @author CHRIS
 */
public class Eqq {
    
    /**
      
       Q: Cantidad óptima para cada pedido.
       K: Costo de cada pedido.
       D: Demanda anual del producto o materia prima.
       H: Costo anual por almacenamiento
     */
     
      //Determinar tamaño de la aorden
    public static int Q(int D ,int K, int H ) {
       
       int resultadoq,a;
       //Primera operacion 
         a=2*(D*K)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
               
        return resultadoq;       
    
    }
    
    public static int H (int D ,int K, int H ){
        int resultadoq,a,b;
       //Primera operacion 
         a=2*(D*K)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
         
       //Resultado H Costo anual
        b=resultadoq/2*2;
       
        return b;
    }

}
