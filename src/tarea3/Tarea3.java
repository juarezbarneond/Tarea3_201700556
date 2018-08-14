//https://github.com/juarezbarneond/Tarea3_201700556.git
package tarea3;

import java.util.Scanner;

/**
 *
 * @author juare
 */
public class Tarea3 {
    static promedio metodop = new promedio();
    static  usuario metodou = new usuario();
    static mayor metodom = new mayor();
    static contador metodoc = new contador();
    static Scanner sc=new Scanner(System.in);
    static int opcion;

    public static void main(String[] args) 
    {  
   
 
   menuprincipal();
        
        
    }
    public static void menuprincipal()
    {
    try{
         System.out.println("1.usuarios");
        System.out.println("2.contador de digitos repetidos");
        System.out.println("3.tres numeros de mayor a menor");
        System.out.println("4.calular promedio");
        System.out.println("5.salir");
        
        opcion=sc.nextInt(); 
        if(opcion==1)
        {
        metodou.menu2();
        }
        else if(opcion ==2)
        {
            metodoc.menu3();
        }
        
        else if(opcion ==3)
        {
            metodom.numero();
        }
        else if(opcion ==4)
        {
            metodop.menupromedio();
        }
        else if(opcion ==5)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("opcion incorrecta intente de nuevo");
           menuprincipal();
        }
    }catch(Exception e) {System.out.println("no se permite el texto"); }    
    }
    
    
}
