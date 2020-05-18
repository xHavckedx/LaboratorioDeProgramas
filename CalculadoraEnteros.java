package javaapplication1;
import javax.swing.*;
import java.util.Scanner;
/**
 * @author Leoca
 */
public class CalculadoraEnteros {
    public static void main (String[] args){
    String hacer = "";
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    String continuar = "continuar";
    
    while(continuar.equalsIgnoreCase("continuar")){ //Ejecutar el programa o salir
        hacer=JOptionPane.showInputDialog("Que operación quieres realizar? Estan disponibles: Restar, multiplicar, sumar o divir.?"); //multiplicar, sumar, dividir, restar.
        
        if(hacer.equalsIgnoreCase("multiplicar")){
            System.out.println("ingrese el primer valor.");
            int c=a.nextInt();
            System.out.println("ingrese el segundo valor.");
            int d=b.nextInt();
            System.out.println(c*d);
            continuar=JOptionPane.showInputDialog("Quieres continuar o salir?");
        }
        if(hacer.equalsIgnoreCase("dividir")){
            System.out.println("ingrese el primer valor.");
            double c=a.nextInt();
            System.out.println("ingrese el segundo valor.");            
            double d=b.nextInt();
            System.out.println(c/d);
            continuar=JOptionPane.showInputDialog("Quieres continuar o salir?");
        }
        if(hacer.equalsIgnoreCase("sumar")){
            System.out.println("ingrese el primer valor.");
            int c=a.nextInt();
            System.out.println("ingrese el segundo valor.");
            int d=b.nextInt();
            System.out.println(c+d);
            continuar=JOptionPane.showInputDialog("Quieres continuar o salir?");
            }
        if(hacer.equalsIgnoreCase("restar")){
            System.out.println("ingrese el primer valor.");
            int c=a.nextInt();
            System.out.println("ingrese el segundo valor.");
            int d=b.nextInt();
            System.out.println(c-d);
        continuar=JOptionPane.showInputDialog("Quieres continuar o salir?");
        }else{
        System.out.println("Has decidido cerrar el programa.");
        break; }
  }if(continuar.equalsIgnoreCase("salir")){       
   System.exit(0);
    }
  }
}
