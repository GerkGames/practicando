
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoTobioGermanAriel2223 miVehiculoTobioGermanAriel2223;
        int stockActual;
        
        miVehiculoTobioGermanAriel2223 = new VehiculoTobioGermanAriel2223("Seat",18000,100);
        operativaVehiculos(miVehiculoTobioGermanAriel2223, 50); 
        stockActual = miVehiculoTobioGermanAriel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculos(VehiculoTobioGermanAriel2223 miVehiculoTobioGermanAriel2223, java.lang.Integer cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoTobioGermanAriel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoTobioGermanAriel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprarr");
        }
    }

}
    
