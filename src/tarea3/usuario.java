package tarea3;

import java.util.Scanner;
import static tarea3.promedio.metodo;

public class usuario
{
    static int opcion;
    static int p=0;
   
    static String usuario[]=new String[6];
    // se busco en internet la sintaxis del metodo
    static Tarea3 metodo = new Tarea3();
    public static void menu2()
    {
    try{    
       
        System.out.println("1.Ingresar Usuarios");
        System.out.println("2.Mostrar Usuarios ascendente");
        System.out.println("3.Mostrar Usuarios descendente");
        System.out.println("4.Menu principal");
        Scanner sc = new Scanner(System.in);
        opcion= sc.nextInt();
        if (opcion == 1) 
        {
             
            usuario(); 
        }
        else if (opcion == 3 )
        {
            if (p== 0)
            {
                System.out.println("no se ha ingresado ningun usuario");
                System.out.println("");
                System.out.println("");
                menu2();
         
            }
            int pp=p;
            while(pp >0) 
            {
                System.out.println(usuario[pp]);
                pp=pp-1;
                    
            }
                menu2();
        }
        else if(opcion ==2)
        {
            if (p== 0)
            {
                System.out.println("no se ha ingresado ningun usuario");
                System.out.println("");
                System.out.println("");
                menu2();
         
            }
            int pp=1;
            while(p>=pp) 
            {
                System.out.println(usuario[pp]);
                pp=pp+1;
                    
            }
            System.out.println("");
            menu2();
        }
        else if(opcion==4){metodo.menuprincipal();}
        else
        {
            System.out.println("se ingreso un numero incorecto intente de nuevo");
            System.out.println("");
            menu2();
        }
    }catch(Exception e){System.out.println("no se permite el texto");metodo.menuprincipal();}    
    }
    public static  void usuario() 
    {   p=p+1;
        if(p==6)
        {
            System.out.println("numero maximo de usuarios");
            System.out.println("");
            System.out.println("");
            p=p-1;
            menu2();
        }
        
        System.out.println("ingrese un usuario");
        Scanner sc = new Scanner(System.in);
        usuario[p] = sc.next();
        int pp=1;
        for (int i = 1; i < p; i++)
        {
            if(usuario[i].equalsIgnoreCase(usuario[p]))
            {
                System.out.println("usuario ya ingresado intente con otro");
                System.out.println("");
                System.out.println("");
                p=p-1;
                usuario();
            }
        }
          
        System.out.println("");
        menu2();
       //  if(a.equals(b))        
       // string a = :"casa"
       //string b = "casa"
                
                
        
    }
    
    
}
