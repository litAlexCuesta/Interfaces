package ClaseAnonima;

//Definición de la interfaz Transporte
interface Transporte {
 void acelerar();
 void frenar();
 void transportar();
}

public class Main {
 public static void main(String[] args) {
     // Implementación de la clase Coche (usando una clase anónima)
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

     // Implementación de la clase Avión (usando una clase anónima)
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

     // Implementación de la clase Barco (usando una clase anónima)
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

     // Utilización de los objetos de transporte
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
