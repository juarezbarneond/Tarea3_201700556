
package tarea3;

import java.util.Scanner;


public class mayor 
{
    static boolean permitir = false;
    static Tarea3 metodo = new Tarea3();
    int num1;
    int num2;
    int num3;
    public void numero()
    {
    try{
        System.out.println("1.Ingresar números");
        System.out.println("2.Mostrar ordenados");
        System.out.println("4.Menu principal");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if  (opcion== 1)
        {
            
          if (opcion==1) {
           permitir=true;
        } else {
        }
        {   System.out.println("");
            System.out.println("ingrese un numero");
             num1 = sc.nextInt();
            System.out.println("ingrese otro numero");
             num2= sc.nextInt();
            System.out.println("ingrese otro numero");
             num3= sc.nextInt();
             System.out.println("");
             numero();
            
        }        
        }
        else if (opcion ==2) 
        {
               if(permitir==false)
                {
                    System.out.println("");
                    System.out.println("no ha ingresado los numeros");
                    numero();
                }
            if((num1 < num2) && (num2<num3)){System.out.println("el numero mayor es: "+num3+" el mediano es: "+ num2+" y el menor es: "+num1);}
            else if((num1 < num3) && (num3<num2)){System.out.println("el numero mayor es: "+num2+" el mediano es: "+ num3+" y el menor es: "+num1);}
            else if((num2 < num3) && (num3<num1)){System.out.println("el numero mayor es: "+num1+" el mediano es: "+ num3+" y el menor es: "+num2);}
            else if((num2 < num1) && (num1<num3)){System.out.println("el numero mayor es: "+num3+" el mediano es: "+ num1+" y el menor es: "+num2);}
            else if((num3 < num1) && (num1<num2)){System.out.println("el numero mayor es: "+num2+" el mediano es: "+ num1+" y el menor es: "+num3);}
            else if((num3 < num2) && (num2<num1)){System.out.println("el numero mayor es: "+num1+" el mediano es: "+ num2+" y el menor es: "+num3);}
            else if(num2==num1 || num2==num3|| num3==num1){System.out.println("los  numeros son iguales");}
            numero();
          
        }
        else if (opcion==4){metodo.menuprincipal();}
        else
        {
        System.out.println("se ingreso un numero incorecto intente de nuevo");
            System.out.println("");
            numero();
        }
    }catch(Exception e){System.out.println("no se permite el texto");metodo.menuprincipal();}
    }
}
