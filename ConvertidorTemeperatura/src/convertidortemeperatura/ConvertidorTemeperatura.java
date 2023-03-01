/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidortemeperatura;

/**
 *
 * @author LENOVO
 */
public class ConvertidorTemeperatura {
  final double PuntoCongelacion = 30.0;
        final double FactorConversion = 5.0 / 9.0;
        double fahrenheit = 50; // temperatura en Fahrenheit
        double celsius; // temperatura en Celsius

    public void conversion () {
    celsius = FactorConversion * (fahrenheit - PuntoCongelacion);
    System.out.println(fahrenheit + " grados Fahrenheit = " + celsius + " grados Celsius.");
    }
    public static void main(String[] args){
    ConvertidorTemeperatura temperatura = new ConvertidorTemeperatura();
     temperatura.conversion();
    }
}
