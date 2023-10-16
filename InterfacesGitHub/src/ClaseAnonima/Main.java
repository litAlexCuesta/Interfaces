package ClaseAnonima;

//INTERFAZ TRANSPORTE
interface Transporte {
 void acelerar();
 void frenar();
 void transportar();
}

public class Main {
 public static void main(String[] args) {
     // IMPLEMENTACION COCHE CON CLASE ANONIMA
     Transporte coche = new Transporte() {
         @Override
         public void acelerar() {
             System.out.println("El coche está acelerando.");
         }

         @Override
         public void frenar() {
             System.out.println("El coche está frenando.");
         }

         @Override
         public void transportar() {
             System.out.println("El coche está transportando personas.");
         }
     };

     // IMPLEMENTACION AVION CON CLASE ANONIMA
     Transporte avion = new Transporte() {
         @Override
         public void acelerar() {
             System.out.println("El avión está aumentando la velocidad.");
         }

         @Override
         public void frenar() {
             System.out.println("El avión está reduciendo la velocidad.");
         }

         @Override
         public void transportar() {
             System.out.println("El avión está transportando pasajeros por el aire.");
         }
     };

     // IMPLEMENTACION BARCO CON CLASE ANONIMA
     Transporte barco = new Transporte() {
         @Override
         public void acelerar() {
             System.out.println("El barco está avanzando en el agua.");
         }

         @Override
         public void frenar() {
             System.out.println("El barco está deteniéndose en el agua.");
         }

         @Override
         public void transportar() {
             System.out.println("El barco está transportando carga por el mar.");
         }
     };

     // UTILIZACION DE LOS OBJETOS
     System.out.println("Coche:");
     coche.acelerar();
     coche.frenar();
     coche.transportar();

     System.out.println("\nAvión:");
     avion.acelerar();
     avion.frenar();
     avion.transportar();

     System.out.println("\nBarco:");
     barco.acelerar();
     barco.frenar();
     barco.transportar();
 }
}
