package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PropiedadView extends JFrame {
    private JTextField txtNumeroMatricula, txtDireccion, txtTelefono, txtAlquiler, txtZona, txtDescripcion;
    private JCheckBox chkDisponible;
    private JButton btnRegistrarPropiedad, btnMostrarPropiedades, btnBuscarPorAlquiler, btnBuscarPorRequerimientos, btnIrAClientes;
    private JTextField txtBuscarAlquiler, txtBuscarZona, txtBuscarMaximoAlquiler;

    // Colores solicitados
    private final Color botonColor = Color.decode("#ff6347");
    private final Color textoColor = Color.decode("#009cb8");

    public PropiedadView() {
        // Configuración de la ventana
        setTitle("Registro de Propiedad");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(12, 2));

        // Inicialización de componentes con estilos
        txtNumeroMatricula = new JTextField();
        txtDireccion = new JTextField();
        txtTelefono = new JTextField();
        txtAlquiler = new JTextField();
        txtZona = new JTextField();
        txtDescripcion = new JTextField();
        chkDisponible = new JCheckBox("Disponible");

        // Botones con color de fondo
        btnRegistrarPropiedad = new JButton("Registrar Propiedad");
        btnRegistrarPropiedad.setBackground(botonColor);
        btnRegistrarPropiedad.setForeground(Color.WHITE);

        btnMostrarPropiedades = new JButton("Mostrar Propiedades");
        btnMostrarPropiedades.setBackground(botonColor);
        btnMostrarPropiedades.setForeground(Color.WHITE);

        btnBuscarPorAlquiler = new JButton("Buscar por Alquiler");
        btnBuscarPorAlquiler.setBackground(botonColor);
        btnBuscarPorAlquiler.setForeground(Color.WHITE);

        btnBuscarPorRequerimientos = new JButton("Buscar por Requerimientos");
        btnBuscarPorRequerimientos.setBackground(botonColor);
        btnBuscarPorRequerimientos.setForeground(Color.WHITE);

        btnIrAClientes = new JButton("Ir a Clientes");
        btnIrAClientes.setBackground(botonColor);
        btnIrAClientes.setForeground(Color.WHITE);

        // Colores del texto de los campos
        txtNumeroMatricula.setForeground(textoColor);
        txtDireccion.setForeground(textoColor);
        txtTelefono.setForeground(textoColor);
        txtAlquiler.setForeground(textoColor);
        txtZona.setForeground(textoColor);
        txtDescripcion.setForeground(textoColor);

        txtBuscarAlquiler = new JTextField();
        txtBuscarZona = new JTextField();
        txtBuscarMaximoAlquiler = new JTextField();

        // Agregar componentes al panel
        add(new JLabel("Número de Matrícula:"));
        add(txtNumeroMatricula);
        add(new JLabel("Dirección:"));
        add(txtDireccion);
        add(new JLabel("Teléfono:"));
        add(txtTelefono);
        add(new JLabel("Alquiler:"));
        add(txtAlquiler);
        add(new JLabel("Zona:"));
        add(txtZona);
        add(new JLabel("Descripción:"));
        add(txtDescripcion);
        add(chkDisponible);
        add(btnRegistrarPropiedad);
        add(btnMostrarPropiedades);
        add(new JLabel("Buscar por Alquiler:"));
        add(txtBuscarAlquiler);
        add(btnBuscarPorAlquiler);
        add(new JLabel("Buscar por Zona y Máximo Alquiler:"));
        add(new JPanel(new GridLayout(1, 2)) {{
            add(txtBuscarZona);
            add(txtBuscarMaximoAlquiler);
        }});
        add(btnBuscarPorRequerimientos);
        add(btnIrAClientes);
    }

    // Métodos para obtener los valores de los campos de texto
    public String getNumeroMatricula() { return txtNumeroMatricula.getText(); }
    public String getDireccion() { return txtDireccion.getText(); }
    public String getTelefono() { return txtTelefono.getText(); }
    public int getAlquiler() { return Integer.parseInt(txtAlquiler.getText()); }
    public String getZona() { return txtZona.getText(); }
    public String getDescripcion() { return txtDescripcion.getText(); }
    public boolean isDisponible() { return chkDisponible.isSelected(); }

    public String getBuscarAlquiler() { return txtBuscarAlquiler.getText(); }
    public String getBuscarZona() { return txtBuscarZona.getText(); }
    public int getBuscarMaximoAlquiler() { return Integer.parseInt(txtBuscarMaximoAlquiler.getText()); }

    // Métodos para agregar los listeners
    public void addRegistrarPropiedadListener(ActionListener listenForRegistrarButton) {
        btnRegistrarPropiedad.addActionListener(listenForRegistrarButton);
    }

    public void addMostrarPropiedadesListener(ActionListener listenForMostrarPropiedadesButton) {
        btnMostrarPropiedades.addActionListener(listenForMostrarPropiedadesButton);
    }

    public void addBuscarPorAlquilerListener(ActionListener listenForBuscarPorAlquilerButton) {
        btnBuscarPorAlquiler.addActionListener(listenForBuscarPorAlquilerButton);
    }

    public void addBuscarPorRequerimientosListener(ActionListener listenForBuscarPorRequerimientosButton) {
        btnBuscarPorRequerimientos.addActionListener(listenForBuscarPorRequerimientosButton);
    }

    public void addIrAClientesListener(ActionListener listenForIrAClientesButton) {
        btnIrAClientes.addActionListener(listenForIrAClientesButton);
    }
}
