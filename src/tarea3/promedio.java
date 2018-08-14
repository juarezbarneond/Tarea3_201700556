
package tarea3;

import java.util.Scanner;


public class promedio 
{
int id[]=new int[5];
int nota1[]=new int[5];
int nota2[]=new int[5];
int nota3[]=new int[5];
int nota4[]=new int[5];
int promedio[]=new int[5];
static Tarea3 metodo = new Tarea3();
Scanner sc=new Scanner(System.in);
int p=0;

public void menupromedio()
    {
    try{
        System.out.println("1.ingrese id del alumno");
        System.out.println("2.mostrar notas ");
        System.out.println("4.menu principal");
        
        int opcion=sc.nextInt();
        if(opcion == 1 )
        {   
            idpromedio();
        }
        else if (opcion==2)
        {
            mostrarnota();
        }
        else if (opcion==4){metodo.menuprincipal();}
        else
        {
            System.out.println("se ingreso un numero incorecto intente de nuevo");
            System.out.println("");
            menupromedio();}
    }catch(Exception e){System.out.println("no se permite el texto");metodo.menuprincipal();}
    }
public void idpromedio()
    {
        
        if(p==4)
        {
            System.out.println("numero maximo de alumnos");
            p=p-1;
            menupromedio();
      
            
        }
        System.out.println("ingrese id del alumno");
        id[p]=sc.nextInt();                
        System.out.println("");
        System.out.println("ingrese primera nota");
        nota1[p]=sc.nextInt();
        System.out.println("");
        System.out.println("ingrese la segunda nota");
        nota2[p]=sc.nextInt();
        System.out.println("");
        System.out.println("ingrese la tercera nota");
        nota3[p]=sc.nextInt();
        System.out.println("");
        System.out.println("ingrese la cuarta nota");
        nota4[p]=sc.nextInt();
        p=p+1;
        System.out.println("");
        System.out.println("");
        menupromedio();
        
    }
public void mostrarnota()
    {
        if(p!=4)
        {
            System.out.println("se requiere mas informacion ingrese mas id y notas de los alumnos");
            menupromedio();
        }
        for (int i = 0; i <= p; i++) 
        {
            promedio[i]=(nota1[i]+nota2[i]+nota3[i]+nota4[i])/4;
            System.out.println(id[i]+"    "+nota1[i]+"    "+nota2[i]+"    "+nota3[i]+"    "+nota4[i]+"    "+promedio[i]);   
        }
        System.out.println("");
        System.out.println("1.limpiar");
        System.out.println("4.menu principal");
        int opcion=sc.nextInt();
        if(opcion==1)
        {
            p=0;
            menupromedio();
        }
        else if (opcion==4)
        {
        metodo.menuprincipal();
        }
    }
}


