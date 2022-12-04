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
       C: Costo de cada pedido.
       D: Demanda anual del producto o materia prima.
       H: Costo anual por almacenamiento
       T: Dias laborados
     */
     
      //Determinar tamaño de la orden
    public static int Q(int D ,int C, int H ) {
       
       int resultadoq,a;
       //Primera operacion 
         a=2*(D*C)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
               
        return resultadoq;       
    
    }
    
    //Costo anual de manejo de inventarios
    public static int H (int D ,int C, int H ){
        int resultadoq,a,b;
       //Primera operacion 
         a=2*(D*C)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
         
       //Resultado H Costo anual
        b=resultadoq/2*2;
       
        return b;
    }
    
    //Costo total de ordenar
    public static int S(int D ,int C, int H){
        int resultadoq,a,b;
       //Primera operacion 
         a=2*(D*C)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
         
       //Resultado S Orden
       
       b = (D/resultadoq)*C;
       
       return b;
        
    }
    
    //Punto de reorden R
    public static int R(int D,int T, int L){
        int resultador;
        //Operacion
        resultador= (D/T)*L;
        
        return resultador;
    }
    
    //Ciclo e inventario Promedio 
    public static int CIP(int D ,int C, int H,int T){
         int resultadoq,a,b;
       //Primera operacion 
         a=2*(D*C)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
         
       //Segunda operacion
       b= (resultadoq/D)*T;
       
       
       return b;
       
    }
    
    //Ordenenes por año deberia colocar
    public static int N(int D ,int C, int H,int T){
           int resultadoq,a,b;
       //Primera operacion 
         a=2*(D*C)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
         
       //Segunada operacion Ordennes a colocar por año
       
       b= (D/resultadoq);
       
       return b;
    }
    //Costo total anual de ordenar y mantener el pedido
    public static int Om (int D ,int C, int H){
           int resultadoq,a,b;
       //Primera operacion 
         a=2*(D*C)/H;
         
       //Sacar raiz
         resultadoq=(int)Math.sqrt(a);
         
       //Segunada operacion
         b= (resultadoq/2)*H;
         
         return b;
        
    }
    
    
    
    
    
}
