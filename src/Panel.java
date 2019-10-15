


import impresora.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juare
 */


public class Panel extends javax.swing.JFrame {
    

//private final pPort puerto;
    /**
     * Creates new form Panel
     */
    int Posicion_X,Posicion_Y;
    
    JButton [][] Arreglo_Botones=new JButton[16][8];
  String url;
  LinkedList<Token> lista=new LinkedList <Token>();
    
    public Panel()  {
        initComponents();
        Posicion_X=Posicion_Y=0;
  //      puerto = new pPort();
     
    

    crear_boton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Pfigura = new javax.swing.JPanel();
        Pcolor = new javax.swing.JPanel();
        Panel_Boton_Dos = new javax.swing.JPanel();
        Boton_Azu = new javax.swing.JButton();
        Panel_Boton_Uno = new javax.swing.JPanel();
        Boton_Negro = new javax.swing.JButton();
        Panel_Boton_Tres = new javax.swing.JPanel();
        Boton_amarillo = new javax.swing.JButton();
        Panel_Boton_Cuatro = new javax.swing.JPanel();
        Boton_Blanco = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Panel_Botones = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pfigura.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PfiguraLayout = new javax.swing.GroupLayout(Pfigura);
        Pfigura.setLayout(PfiguraLayout);
        PfiguraLayout.setHorizontalGroup(
            PfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        PfiguraLayout.setVerticalGroup(
            PfiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        Boton_Azu.setBackground(new java.awt.Color(51, 51, 255));
        Boton_Azu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AzuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Boton_DosLayout = new javax.swing.GroupLayout(Panel_Boton_Dos);
        Panel_Boton_Dos.setLayout(Panel_Boton_DosLayout);
        Panel_Boton_DosLayout.setHorizontalGroup(
            Panel_Boton_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Boton_DosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_Azu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Boton_DosLayout.setVerticalGroup(
            Panel_Boton_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Boton_DosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_Azu, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        Boton_Negro.setBackground(new java.awt.Color(0, 0, 0));
        Boton_Negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_NegroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Boton_UnoLayout = new javax.swing.GroupLayout(Panel_Boton_Uno);
        Panel_Boton_Uno.setLayout(Panel_Boton_UnoLayout);
        Panel_Boton_UnoLayout.setHorizontalGroup(
            Panel_Boton_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Boton_UnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_Negro, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Boton_UnoLayout.setVerticalGroup(
            Panel_Boton_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Boton_UnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_Negro, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        Boton_amarillo.setBackground(new java.awt.Color(255, 255, 0));
        Boton_amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_amarilloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Boton_TresLayout = new javax.swing.GroupLayout(Panel_Boton_Tres);
        Panel_Boton_Tres.setLayout(Panel_Boton_TresLayout);
        Panel_Boton_TresLayout.setHorizontalGroup(
            Panel_Boton_TresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Boton_TresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Boton_TresLayout.setVerticalGroup(
            Panel_Boton_TresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Boton_TresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_amarillo, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        Boton_Blanco.setBackground(new java.awt.Color(255, 255, 255));
        Boton_Blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BlancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Boton_CuatroLayout = new javax.swing.GroupLayout(Panel_Boton_Cuatro);
        Panel_Boton_Cuatro.setLayout(Panel_Boton_CuatroLayout);
        Panel_Boton_CuatroLayout.setHorizontalGroup(
            Panel_Boton_CuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Boton_CuatroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Boton_CuatroLayout.setVerticalGroup(
            Panel_Boton_CuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Boton_CuatroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_Blanco, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PcolorLayout = new javax.swing.GroupLayout(Pcolor);
        Pcolor.setLayout(PcolorLayout);
        PcolorLayout.setHorizontalGroup(
            PcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcolorLayout.createSequentialGroup()
                .addGroup(PcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Boton_Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Boton_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PcolorLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(Panel_Boton_Uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcolorLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(Panel_Boton_Dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PcolorLayout.setVerticalGroup(
            PcolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcolorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Boton_Uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_Boton_Dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_Boton_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_Boton_Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Botones.setPreferredSize(new java.awt.Dimension(800, 960));

        javax.swing.GroupLayout Panel_BotonesLayout = new javax.swing.GroupLayout(Panel_Botones);
        Panel_Botones.setLayout(Panel_BotonesLayout);
        Panel_BotonesLayout.setHorizontalGroup(
            Panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        Panel_BotonesLayout.setVerticalGroup(
            Panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu2.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Guardar Como");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pfigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Pfigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void crear_boton()
{
    int x=0;
    int y=0;
    for (int i = 0; i < 16; i++)
    {
        x=0;
        for (int j = 0; j < 8; j++) 
        {
            Arreglo_Botones[i][j]=new Boton(x, y);
           // String color =Arreglo_Botones[i][j].getBackground().toString();
            
            //System.out.println(color);
            Panel_Botones.add(Arreglo_Botones[i][j]);
            x=x+100;
            
        }
        y=y+60;
    }
    
   
}
    private void Boton_NegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_NegroActionPerformed
        // TODO add your handling code here:
                    
this.Panel_Boton_Uno.setBackground(new Color(240,240,240));
this.Panel_Boton_Dos.setBackground(new Color(240,240,240));
this.Panel_Boton_Tres.setBackground(new Color(240,240,240));
this.Panel_Boton_Cuatro.setBackground(new Color(240,240,240));
this.Panel_Boton_Uno.setBackground(Color.green);
Pintura.Pintura="black";

        

    }//GEN-LAST:event_Boton_NegroActionPerformed

    private void Boton_AzuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AzuActionPerformed
        // TODO add your handling code here:
                            
this.Panel_Boton_Uno.setBackground(new Color(240,240,240));
this.Panel_Boton_Dos.setBackground(new Color(240,240,240));
this.Panel_Boton_Tres.setBackground(new Color(240,240,240));
this.Panel_Boton_Cuatro.setBackground(new Color(240,240,240));
this.Panel_Boton_Dos.setBackground(Color.green);
Pintura.Pintura="blue";
    }//GEN-LAST:event_Boton_AzuActionPerformed

    private void Boton_amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_amarilloActionPerformed
        // TODO add your handling code here:
                            
this.Panel_Boton_Uno.setBackground(new Color(240,240,240));
this.Panel_Boton_Dos.setBackground(new Color(240,240,240));
this.Panel_Boton_Tres.setBackground(new Color(240,240,240));
this.Panel_Boton_Cuatro.setBackground(new Color(240,240,240));
this.Panel_Boton_Tres.setBackground(Color.green);
Pintura.Pintura="yellow";
    }//GEN-LAST:event_Boton_amarilloActionPerformed

    private void Boton_BlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BlancoActionPerformed
        // TODO add your handling code here:
                            
this.Panel_Boton_Uno.setBackground(new Color(240,240,240));
this.Panel_Boton_Dos.setBackground(new Color(240,240,240));
this.Panel_Boton_Tres.setBackground(new Color(240,240,240));
this.Panel_Boton_Cuatro.setBackground(new Color(240,240,240));
this.Panel_Boton_Cuatro.setBackground(Color.green);
Pintura.Pintura="white";
    }//GEN-LAST:event_Boton_BlancoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
lista.clear();
JFileChooser fc=new JFileChooser();
int seleccion=fc.showOpenDialog(null);
if(seleccion==JFileChooser.APPROVE_OPTION){

    File fichero=fc.getSelectedFile();
        try {
         FileReader fr = new FileReader (fichero);
         BufferedReader br = new BufferedReader(fr);
String linea;
         while((  linea=br.readLine())!=null)
         {
            
            analizador(linea);
         }
       
         br.close();
        }
      catch(Exception e){
          
       
      }
     analizador_2();
//      for (Token token: lista){
//          
//  System.out.println(token.getID()+" "+token.getTipo()+" "+token.getValor());
//            
//    }
}else
{
JOptionPane.showMessageDialog(null, "archivo no valido");
}
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("");
        imprimir();
        Posicion_X=0;
        Posicion_Y=0;
    }//GEN-LAST:event_jButton1ActionPerformed
private void analizador(String linea)
{try {
         String aux="";
       
         
         {
             int estado=0;
             linea= linea.replace(" ", "");
             for (int i = 0; i < linea.length(); i++) 
             {
                 char C=linea.charAt(i);
                 
                 switch(estado)
                 {
                     
                    case 0:
                        switch(C)
                 {
                            
                    case '{':
                        lista.add(new Token(1, "{", -1));
                        estado=0;
                        break;
                    case '}':
                          lista.add(new Token(2, "}", -1));
                          estado=0;
                        break;
                    case '[':
                          lista.add(new Token(3, "[", -1));
                          estado=0;
                        break;
                    case ']':
                          lista.add(new Token(4, "]", -1));
                          estado=0;
                        break;
                         case ',':
                          lista.add(new Token(6, ",", -1));
                          estado=0;
                        break;
                    default:
                        if(Character.isDigit(C))
                        {
                        aux+=C;
                         estado=1;
                        }
                        else 
                        {
                            if(C=='"')
                        {
                        estado=2;
                        }
                        }
                        break;
                        
                 }
                    break;
                    case 1:
                         if(Character.isDigit(C))
                        {
                            estado=1;
                            aux+=C;
                        }
                         else
                         {
                             lista.add(new Token(5, "numero", Integer.parseInt(aux)));
                             i--;
                             aux="";
                         estado=0;
                         }
                        break;
                    case 2:
                        if(C==':')
                        {
                           
                         if(aux.equalsIgnoreCase("coordenadas\""))
                         {
                             lista.add(new Token(7, "coordenadas",-1 ));
                         }
                         else if (aux.equalsIgnoreCase("x\""))
                         {
                         lista.add(new Token(8, "X",-1 ));
                         }
                         else if (aux.equalsIgnoreCase("y\""))
                         {
                         lista.add(new Token(9, "Y",-1 ));
                         }
                         aux="";
                        estado=0;
                        
                                
                        }
                        else {aux+=C;}
                         break;
                 }
             }
             
         }
}catch (Exception ex){}
}
 
private void analizador_2()
{
 try{   
    int Estado=0;
    int y,x;y=x=0;
    
 for (Token token: lista)
 {
     switch (Estado) 
     {
        case 0:
        if(token.getID()==1)
        {
        Estado=1;
        }
        break;
        case 1:
        if(token.getID()==7)
        {
        Estado=2;
        }
        break;
        case 2:
        if(token.getID()==3)
        {
        Estado=3;
        }
        break;
        case 3:
        if(token.getID()==1)
        {
        Estado=4;
        }
        break;
        case 4:
        if(token.getID()==8)
        {
        Estado=5;
        }
        break;
        case 5:
        if(token.getID()==5)
        {
        x=token.getValor();
        Estado=6;
        }
        break;
        case 6:
        if(token.getID()==6)
        {
        Estado=7;
        }
        break;
        case 7:
        if(token.getID()==9)
        {
        Estado=10;
        }
        break;
        case 10:
        if(token.getID()==5)
        {
            y=token.getValor();
           Arreglo_Botones[y][x].setBackground(Color.black);
           y=x=0;
        Estado=11;
        }
        break;
            case 11:
             if(token.getID()==2)
             {
             Estado=12;
             }
                 break;
                case 12:
             if(token.getID()==6)
             {
             Estado=4;
             }
             else if (token.getID()==4)
             {
             Estado=13;
             }
                 break;
                    case 14:
             if(token.getID()==2)
             {
             Estado=0;
             }
                 break;

     }
 }
}catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "archivo no valido");
}
        
    }

    /**
     * @param args the command line arguments
     */
     public  void main() {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Azu;
    private javax.swing.JButton Boton_Blanco;
    private javax.swing.JButton Boton_Negro;
    private javax.swing.JButton Boton_amarillo;
    private javax.swing.JPanel Panel_Boton_Cuatro;
    private javax.swing.JPanel Panel_Boton_Dos;
    private javax.swing.JPanel Panel_Boton_Tres;
    private javax.swing.JPanel Panel_Boton_Uno;
    private javax.swing.JPanel Panel_Botones;
    private javax.swing.JPanel Pcolor;
    private javax.swing.JPanel Pfigura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


private void imprimir ()
{

    for (int i = Posicion_Y; i < 16; i++) 
    {
        for (int j = Posicion_X; j < 8; j++) 
        {
            
            if(!Arreglo_Botones[i][j].getBackground().toString().equalsIgnoreCase("java.awt.Color[r=255,g=255,b=255]"))
            {
                //System.out.println(Arreglo_Botones[i][j].getBackground().toString());
                //System.out.println(binario(j)+"   "+binario(i));
               // Posicion_X=j;
                //Posicion_Y=i;
                String x,y;
                x=Decimal_Binario(j);
                y=Decimal_Binario(i);
                for (int k = 0;  x.length() < 3; k++) {
                    x="0"+x;
                }
                
                 for (int k = 0;  y.length() < 4; k++) {
                    y="0"+y;
                }
              
                enviar(x, y);
                //return;
                
                
            }
        }
        
    }
    
}
private String Decimal_Binario(int numero)
{
ArrayList<String> binario = new ArrayList<String>();
   int resto;
   String binarioString = "";

   do{
      resto = numero%2;
      numero = numero/2;
      binario.add(0, Integer.toString(resto));
   }while(numero > 1); //Haremos el bucle hasta que el cociente no se pueda dividir mas

   binario.add(0, Integer.toString(numero)); //Cogeremos el ultimo cociente
   for(int i = 0; i < binario.size(); i++){
       binarioString += binario.get(i);
   }
   return binarioString;
}
        
private void enviar (String X, String Y)    
{

    System.out.println(X+" "+Y);
    
    
}


}
