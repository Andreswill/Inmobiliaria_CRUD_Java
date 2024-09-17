package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClienteView extends JFrame {
    private JTextField txtNombres, txtTelefono, txtDireccion, txtProfesion, txtLugarTrabajo, txtSalario, txtBarrio, txtZona, txtPrecioAlquiler, txtDescripcion;
    private JButton btnRegistrarCliente, btnMostrarClientes, btnIrAPropiedades, btnActualizarCliente;
    private JComboBox<String> cmbClientes;  // Para seleccionar al cliente a modificar

    // Definir los colores
    private final Color botonColor = Color.decode("#ff6347");
    private final Color textoColor = Color.decode("#009cb8");
    private final Color labelColor = Color.decode("#d2691e");

    public ClienteView() {
        // Configuración de la ventana
        setTitle("Registro de Cliente");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(11, 2));

        // Deshabilitar redimensionamiento
        setResizable(false);

        // Inicialización de componentes
        txtNombres = new JTextField();
        txtTelefono = new JTextField();
        txtDireccion = new JTextField();
        txtProfesion = new JTextField();
        txtLugarTrabajo = new JTextField();
        txtSalario = new JTextField();
        txtBarrio = new JTextField();
        txtZona = new JTextField();
        txtPrecioAlquiler = new JTextField();
        txtDescripcion = new JTextField();

        btnRegistrarCliente = new JButton("Registrar Cliente");
        btnMostrarClientes = new JButton("Mostrar Clientes");
        btnIrAPropiedades = new JButton("Ir a Propiedades");
        btnActualizarCliente = new JButton("Actualizar Cliente");

        // ComboBox para seleccionar cliente
        cmbClientes = new JComboBox<>();
        cmbClientes.setEnabled(false);  // Inicialmente deshabilitado hasta que se registren clientes

        // Aplicar los colores
        txtNombres.setForeground(textoColor);
        txtTelefono.setForeground(textoColor);
        txtDireccion.setForeground(textoColor);
        txtProfesion.setForeground(textoColor);
        txtLugarTrabajo.setForeground(textoColor);
        txtSalario.setForeground(textoColor);
        txtBarrio.setForeground(textoColor);
        txtZona.setForeground(textoColor);
        txtPrecioAlquiler.setForeground(textoColor);
        txtDescripcion.setForeground(textoColor);

        btnRegistrarCliente.setBackground(botonColor);
        btnRegistrarCliente.setForeground(Color.WHITE);
        btnMostrarClientes.setBackground(botonColor);
        btnMostrarClientes.setForeground(Color.WHITE);
        btnIrAPropiedades.setBackground(botonColor);
        btnIrAPropiedades.setForeground(Color.WHITE);
        btnActualizarCliente.setBackground(botonColor);
        btnActualizarCliente.setForeground(Color.WHITE);

        // Crear etiquetas con color
        JLabel lblSeleccionarCliente = new JLabel("Seleccionar Cliente:");
        JLabel lblNombres = new JLabel("Nombres:");
        JLabel lblTelefono = new JLabel("Teléfono:");
        JLabel lblDireccion = new JLabel("Dirección:");
        JLabel lblProfesion = new JLabel("Profesión:");
        JLabel lblLugarTrabajo = new JLabel("Lugar de Trabajo:");
        JLabel lblSalario = new JLabel("Salario:");
        JLabel lblBarrio = new JLabel("Barrio:");
        JLabel lblZona = new JLabel("Zona:");
        JLabel lblPrecioAlquiler = new JLabel("Precio Alquiler:");
        JLabel lblDescripcion = new JLabel("Descripción:");

        // Aplicar color a las etiquetas
        lblSeleccionarCliente.setForeground(labelColor);
        lblNombres.setForeground(labelColor);
        lblTelefono.setForeground(labelColor);
        lblDireccion.setForeground(labelColor);
        lblProfesion.setForeground(labelColor);
        lblLugarTrabajo.setForeground(labelColor);
        lblSalario.setForeground(labelColor);
        lblBarrio.setForeground(labelColor);
        lblZona.setForeground(labelColor);
        lblPrecioAlquiler.setForeground(labelColor);
        lblDescripcion.setForeground(labelColor);

        // Agregar componentes al panel
        add(lblSeleccionarCliente);
        add(cmbClientes);
        add(lblNombres);
        add(txtNombres);
        add(lblTelefono);
        add(txtTelefono);
        add(lblDireccion);
        add(txtDireccion);
        add(lblProfesion);
        add(txtProfesion);
        add(lblLugarTrabajo);
        add(txtLugarTrabajo);
        add(lblSalario);
        add(txtSalario);
        add(lblBarrio);
        add(txtBarrio);
        add(lblZona);
        add(txtZona);
        add(lblPrecioAlquiler);
        add(txtPrecioAlquiler);
        add(lblDescripcion);
        add(txtDescripcion);
        add(btnRegistrarCliente);
        add(btnMostrarClientes);
        add(btnActualizarCliente);
        add(btnIrAPropiedades);
    }

    // Métodos para obtener los valores de los campos de texto
    public String getNombres() { return txtNombres.getText(); }
    public String getTelefono() { return txtTelefono.getText(); }
    public String getDireccion() { return txtDireccion.getText(); }
    public String getProfesion() { return txtProfesion.getText(); }
    public String getLugarTrabajo() { return txtLugarTrabajo.getText(); }
    public int getSalario() { return Integer.parseInt(txtSalario.getText()); }
    public String getBarrio() { return txtBarrio.getText(); }
    public String getZona() { return txtZona.getText(); }
    public int getPrecioAlquiler() { return Integer.parseInt(txtPrecioAlquiler.getText()); }
    public String getDescripcion() { return txtDescripcion.getText(); }

    public String getSelectedCliente() { return (String) cmbClientes.getSelectedItem(); }

    public void setClientesList(String[] clientes) {
        cmbClientes.removeAllItems();
        for (String cliente : clientes) {
            cmbClientes.addItem(cliente);
        }
        cmbClientes.setEnabled(clientes.length > 0); // Habilitar el ComboBox si hay clientes
    }

    // Métodos para agregar los listeners
    public void addRegistrarClienteListener(ActionListener listenForRegistrarButton) {
        btnRegistrarCliente.addActionListener(listenForRegistrarButton);
    }

    public void addMostrarClientesListener(ActionListener listenForMostrarClientesButton) {
        btnMostrarClientes.addActionListener(listenForMostrarClientesButton);
    }

    public void addIrAPropiedadesListener(ActionListener listenForIrAPropiedadesButton) {
        btnIrAPropiedades.addActionListener(listenForIrAPropiedadesButton);
    }

    public void addActualizarClienteListener(ActionListener listenForActualizarClienteButton) {
        btnActualizarCliente.addActionListener(listenForActualizarClienteButton);
    }
}
