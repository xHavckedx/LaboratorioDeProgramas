package javaapplication1;
import javax.swing.*;
import java.util.Scanner;
/**
 * @author Leoca
 */
public class CalculadoraEnteros {
    
    public static void main (String[] args){
        
    String sProcedimientoOperación = "";
    Scanner scPrimerValor = new Scanner(System.in);
    Scanner scSegundoValor = new Scanner(System.in);
    String sContinuarParar = "continuar";
    
    while(sContinuarParar.equalsIgnoreCase("continuar")){ //Ejecutar el programa o salir
        sProcedimientoOperación=JOptionPane.showInputDialog("Que operación quieres realizar? Estan disponibles: Restar, multiplicar, sumar o dividir.?"); //multiplicar, sumar, dividir, restar.
        
        if(sProcedimientoOperación.equalsIgnoreCase("multiplicar")){
            
            System.out.println("ingrese el primer valor.");
            int iPrimerValor = scPrimerValor.nextInt();
            System.out.println("ingrese el segundo valor.");
            int iSegundoValor = scSegundoValor.nextInt();
            System.out.println(iPrimerValor * iSegundoValor);
            
            sContinuarParar = JOptionPane.showInputDialog("Quieres continuar o salir?");
        
        }else if(sProcedimientoOperación.equalsIgnoreCase("dividir")){
            
            System.out.println("ingrese el primer valor.");
            double dPrimerValor = scPrimerValor.nextInt();
            System.out.println("ingrese el segundo valor.");
            double dSegundoValor = scSegundoValor.nextInt();
            System.out.println(dPrimerValor / dSegundoValor);
            
            sContinuarParar = JOptionPane.showInputDialog("Quieres continuar o salir?");
        
        }else if(sProcedimientoOperación.equalsIgnoreCase("sumar")){
          
            System.out.println("ingrese el primer valor.");
            int iPrimerValor = scPrimerValor.nextInt();
            System.out.println("ingrese el segundo valor.");
            int iSegundoValor = scSegundoValor.nextInt();
            System.out.println(iPrimerValor + iSegundoValor);
            
            sContinuarParar = JOptionPane.showInputDialog("Quieres continuar o salir?");
            
        }else if(sProcedimientoOperación.equalsIgnoreCase("restar")){
          
            System.out.println("ingrese el primer valor.");
            int iPrimerValor = scPrimerValor.nextInt();
            System.out.println("ingrese el segundo valor.");
            int iSegundoValor = scSegundoValor.nextInt();
            System.out.println(iPrimerValor - iSegundoValor);
            
            sContinuarParar = JOptionPane.showInputDialog("Quieres continuar o salir?");
            
        }else{
            
        System.out.println("Has decidido cerrar el programa.");
        break; 
        }
        
    }else(sContinuarParar.equalsIgnoreCase("salir")){       
         System.exit(0);
    }
  }
}
