package co.edu.uniquindio.proyectofinal.model;

public class OperacionesFachcada {

    private OperacionPedidoPlantilla operacionPedidoPlantilla;

    /*Forma de implementar en el controlador:
    OperacionPedidoPlantilla dueño = new Dueño();
    OperacionesFachada plantilla = new operacionesFachada(dueño);
    plantilla.template();
    */
    
    
    public OperacionesFachcada(OperacionPedidoPlantilla operacionPedidoPlantilla) {
        this.operacionPedidoPlantilla = operacionPedidoPlantilla;
    }



    public void operacionPedidoTemplate(){

        operacionPedidoPlantilla.template();
    }
}
