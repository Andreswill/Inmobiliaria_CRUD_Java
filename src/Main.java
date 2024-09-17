import controller.ClienteController;
import controller.PropiedadController;
import view.ClienteView;
import view.PropiedadView;

public class Main {
    public static void main(String[] args) {
        ClienteView clienteView = new ClienteView();
        PropiedadView propiedadView = new PropiedadView();

        ClienteController clienteController = new ClienteController(clienteView, propiedadView);
        PropiedadController propiedadController = new PropiedadController(propiedadView, clienteView);

        clienteView.setVisible(true);
        propiedadView.setVisible(false); // Puedes mostrar la vista de propiedades solo cuando el usuario navega a ella
    }
}
