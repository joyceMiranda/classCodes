package pedido.mvc;

import pedido.controller.PedidoController;
import pedido.model.Pedido;
import pedido.view.PedidoView;

public class PedidoMVC {
    
    public static void main(String[] args) {
        PedidoView view = new PedidoView();
        Pedido pedido = new Pedido(); //camada de modelo
        PedidoController controller = new PedidoController(view, pedido);
        
        view.setVisible(true);
    }
    
}
