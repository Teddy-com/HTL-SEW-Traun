package dev.teddy_com.Lernen._19_11_2024;

/*TODO
*  Variablen,
*  for und if
*  Operatoren
*  Funktionen / Methoden */

public class Loops {

    public static void Start(){

        //1
        byte a = 127;//1 byte mit maximal value
        short b = 32767;//2 bytes
        int c = 2147483647;//4 bytes
        long d = 9223372036854775804L;//8 bytes
        float e = 2.0000000000F;//4 bytes
        double f = 2.000000000000000000000000000000D;//8 bytes
        boolean g = true;//1 bit
        char h = 'h';//2 bytes


        //2

        int x = 0;//variable
        if(x == 2){//if ist wie eine Frage
            System.out.println("X ist falsch"); // Ausgabe
        }
        /*
        Es wird zuerst eine Variable gemacht und einen wert zugefügt
        Danach wird die Bedingung also in diesem beispiel, i ist kleiner als 10
        als Letztes wird eine aktion hinzugefügt
        sie wird nur von 0 bis 9 Zählen
        */
        for (int i = 0; i<10;i++){
            //hier wird i ausgegeben
            System.out.println(i);
        }


        /*3
         + Addition
         - Subtraction
         * Multiplication
         / Division
         % Modulo <---- teilt und gibt den rest zurück
         ++ Inc <----- addiert einfach  1
         -- Dec <------ subtrahiert einfach 1
         */


    }
}
