package controller;

import model.Cliente;
import view.ClienteView;
import view.PropiedadView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClienteController {
    private ClienteView view;
    private ArrayList<Cliente> clientes;
    private PropiedadView propiedadView;

    public ClienteController(ClienteView view, PropiedadView propiedadView) {
        this.view = view;
        this.propiedadView = propiedadView;
        this.clientes = new ArrayList<>();

        this.view.addRegistrarClienteListener(new RegistrarClienteListener());
        this.view.addMostrarClientesListener(new MostrarClientesListener());
        this.view.addIrAPropiedadesListener(new IrAPropiedadesListener());
        this.view.addActualizarClienteListener(new ActualizarClienteListener());
    }

    private class RegistrarClienteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombres = view.getNombres();
            String telefono = view.getTelefono();
            String direccion = view.getDireccion();
            String profesion = view.getProfesion();
            String lugarTrabajo = view.getLugarTrabajo();
            int salario = view.getSalario();
            String barrio = view.getBarrio();
            String zona = view.getZona();
            int precioAlquiler = view.getPrecioAlquiler();
            String descripcion = view.getDescripcion();

            Cliente cliente = new Cliente(nombres, telefono, direccion, profesion, lugarTrabajo, salario, barrio, zona, precioAlquiler, descripcion);
            clientes.add(cliente);
            view.setClientesList(clientes.stream().map(Cliente::toString).toArray(String[]::new));
            JOptionPane.showMessageDialog(view, "Cliente registrado exitosamente!");
        }
    }

    private class MostrarClientesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder sb = new StringBuilder();
            for (Cliente cliente : clientes) {
                sb.append(cliente).append("\n");
            }
            JOptionPane.showMessageDialog(view, sb.toString(), "Clientes Registrados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class IrAPropiedadesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            propiedadView.setVisible(true);
        }
    }

    private class ActualizarClienteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedCliente = view.getSelectedCliente();
            if (selectedCliente != null) {
                for (Cliente cliente : clientes) {
                    if (cliente.toString().equals(selectedCliente)) {
                        cliente.setNombres(view.getNombres());
                        cliente.setTelefono(view.getTelefono());
                        cliente.setDireccion(view.getDireccion());
                        cliente.setProfesion(view.getProfesion());
                        cliente.setLugarTrabajo(view.getLugarTrabajo());
                        cliente.setSalario(view.getSalario());
                        cliente.setBarrio(view.getBarrio());
                        cliente.setZona(view.getZona());
                        cliente.setPrecioAlquiler(view.getPrecioAlquiler());
                        cliente.setDescripcion(view.getDescripcion());
                        JOptionPane.showMessageDialog(view, "Cliente actualizado exitosamente!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(view, "Cliente no encontrado.");
            } else {
                JOptionPane.showMessageDialog(view, "Por favor, seleccione un cliente.");
            }
        }
    }
}
