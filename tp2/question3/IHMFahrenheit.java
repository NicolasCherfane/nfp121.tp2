package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      int fahrenheit = 0; // valeur est une String et doit être convertie en entier, voir java.lang.Integer méthode parseInt (--> try/catch)
      float celsius = 0F; // à compléter, en appelant la méthode ad'hoc de la question2 
      // un test ici pour le zéro absolu (-273.1)
  
    
    celsius=fahrenheitEnCelsius(Integer.parseInt(entree.getText()));
    if(celsius < -273.1F) celsius = -273.1F;
      sortie.setText( Float.toString( celsius));
      getContentPane().setBackground( Color.pink );
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
      getContentPane().setBackground(Color.lightGray);
    }
  }
  
 
  public static void main(String[] args){
      new IHMFahrenheit();
    }
    
     public static float fahrenheitEnCelsius( int f){
        float a=5/9f *(f-32);
        String numberD = String.valueOf(a);
        numberD = numberD.substring(0,numberD.indexOf(".")+2);
        float a2=Float.parseFloat(numberD);
        return a2 ; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
     }
}
