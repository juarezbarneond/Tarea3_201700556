
package tarea3;

import java.util.Scanner;
import static tarea3.promedio.metodo;


public class contador 
{
    Scanner sc=new Scanner(System.in);
    int numero=-1;
    int numero1=-1;
    int contador=0;
    int  resultado=0;
    int p=0;
    int separacion[]=new int[99];
    int i=1;
    int numero2;
    public void menu3()
    {
    try{
        System.out.println("1.ingrese numero");
        System.out.println("2.ingrese numero a buscar");
        System.out.println("3.mostrar numero de digitos");
        System.out.println("4.menu principal");
        int opcion= sc.nextInt();
        if (opcion==1)
        {
            System.out.println("");
            System.out.println("ingrese un numero");
            numero= sc.nextInt();
            numero2=numero;
            System.out.println("");
            menu3();
            
        }
        else if(opcion==2)
        {
            if(numero==-1)
            {
                System.out.println("no se ingreso el numero intente de nuevo");
                menu3();
                
            }
            
            System.out.println("");
            System.out.println("ingrese el numero a buscar");
            numero1=sc.nextInt();
            menu3();
        }
        else if (opcion==3)
        {   
            if(numero==-1 ||numero1==-1)
            { System.out.println("no se ingreso el numero intente de nuevo");
              menu3();
            }
            System.out.println("");
      
           
        while( i<=numero)
        {
         p=p+1;
         separacion[p]=numero%10;
         numero=numero/10;
            
        }
        for (int j = 0; j <= p; j++) 
        {
            if(separacion[j]==numero1){resultado=resultado+1;}
        }
      
             
          
            
            
            
            System.out.println("el numero es:"+ numero2+" numero a buscar es:"+numero1+" la salida es: "+resultado);
            System.out.println("");
            menu3();
            
            
        }
         else if(opcion==4){metodo.menuprincipal();}
        else
        {
            System.out.println("se ingreso un numero incorecto intente de nuevo");
            System.out.println("");
            menu3();
            numero=-1;
            numero1=-1;
        }
    }catch(Exception e){System.out.println("no se permite el texto");metodo.menuprincipal();}  
    }
}
