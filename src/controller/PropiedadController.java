package controller;

import model.Propiedad;
import view.PropiedadView;
import view.ClienteView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropiedadController {
    private PropiedadView view;
    private ArrayList<Propiedad> propiedades;
    private ClienteView clienteView;

    public PropiedadController(PropiedadView view, ClienteView clienteView) {
        this.view = view;
        this.clienteView = clienteView;
        this.propiedades = new ArrayList<>();

        this.view.addRegistrarPropiedadListener(new RegistrarPropiedadListener());
        this.view.addMostrarPropiedadesListener(new MostrarPropiedadesListener());
        this.view.addBuscarPorAlquilerListener(new BuscarPorAlquilerListener());
        this.view.addBuscarPorRequerimientosListener(new BuscarPorRequerimientosListener());
        this.view.addIrAClientesListener(new IrAClientesListener());
    }

    private class RegistrarPropiedadListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String numeroMatricula = view.getNumeroMatricula();
            String direccion = view.getDireccion();
            String telefono = view.getTelefono();
            boolean disponible = view.isDisponible();
            int alquiler = view.getAlquiler();
            String zona = view.getZona();
            String descripcion = view.getDescripcion();

            Propiedad propiedad = new Propiedad(numeroMatricula, direccion, telefono, disponible, alquiler, zona, descripcion);
            propiedades.add(propiedad);
            JOptionPane.showMessageDialog(view, "Propiedad registrada exitosamente!");
        }
    }

    private class MostrarPropiedadesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder sb = new StringBuilder();
            for (Propiedad propiedad : propiedades) {
                sb.append(propiedad).append("\n");
            }
            JOptionPane.showMessageDialog(view, sb.toString(), "Propiedades Registradas", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class BuscarPorAlquilerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int alquiler = Integer.parseInt(view.getBuscarAlquiler());
            List<Propiedad> result = propiedades.stream()
                    .filter(p -> p.getAlquiler() == alquiler)
                    .collect(Collectors.toList());

            StringBuilder sb = new StringBuilder();
            for (Propiedad propiedad : result) {
                sb.append(propiedad.getDireccion()).append("\n");
            }
            JOptionPane.showMessageDialog(view, sb.toString(), "Propiedades con Alquiler " + alquiler, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class BuscarPorRequerimientosListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String zona = view.getBuscarZona();
            int maximoAlquiler = view.getBuscarMaximoAlquiler();
            List<Propiedad> result = propiedades.stream()
                    .filter(p -> p.getZona().equals(zona) && p.getAlquiler() <= maximoAlquiler)
                    .collect(Collectors.toList());

            StringBuilder sb = new StringBuilder();
            for (Propiedad propiedad : result) {
                sb.append(propiedad.getDireccion()).append("\n");
            }
            JOptionPane.showMessageDialog(view, sb.toString(), "Propiedades en Zona " + zona + " con Alquiler Máximo " + maximoAlquiler, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class IrAClientesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            clienteView.setVisible(true);
        }
    }
}
