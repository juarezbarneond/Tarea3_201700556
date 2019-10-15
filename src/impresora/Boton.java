/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impresora;

//import static Panel.color_pintar;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author juare
 */
public class Boton extends JButton implements ActionListener {
 
    //-------- Constructor con parametros para posicionar a los botones ------//
    public Boton( int pos_x, int pos_y ){ 
        //Se coloca el boton en un lugar y se le da un tamanio
        setBounds(pos_x, pos_y, 100, 60);
     
     
        setBackground(Color.white);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
    }
    //------------------------------------------------------------------------//
    
    //---------------------- Se asigna una el nombre del boton ---------------//
    public void setNombre( int f, int c ){
        setText( f + " , " + c );
    }
    //------------------------------------------------------------------------//
    
    //------------------ Al darle click realizara este metodo ----------------//
    public void actionPerformed( ActionEvent e ){
        //Se asigna el color de fondo azul
        try{
   switch   (Pintura.Pintura.toLowerCase())
   {
       case "black":
           setBackground(Color.BLACK);
           break;
        case "blue":
       setBackground(Color.blue);
       break;
             case "yellow":
       setBackground(Color.yellow);
       break;
      case "white":
           setBackground(Color.white);
           break;
   }
      
    }catch(Exception ex){JOptionPane.showMessageDialog(null, "Seleccione un color");}}
}
