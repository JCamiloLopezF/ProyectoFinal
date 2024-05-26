package co.edu.uniquindio.proyectofinal.model;

public class PrecioSinDescuento implements PrecioEstrategia{
    @Override
    public double calcularPrecio(double precio){
        return precio;
    }
}