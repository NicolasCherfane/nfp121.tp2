package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
          for(int i=0;i<args.length;i++)System.out.println(args[i] + "\u00B0F -> " + fahrenheitEnCelsius(Integer.parseInt(args[i])) + "\u00B0C");
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
        float a=5/9f *(f-32);
        String numberD = String.valueOf(a);
        numberD = numberD.substring(0,numberD.indexOf(".")+2);
        float a2=Float.parseFloat(numberD);
        return a2 ; // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
     }

}
