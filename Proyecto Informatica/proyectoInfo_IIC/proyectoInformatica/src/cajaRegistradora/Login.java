package cajaRegistradora;

import Usuario.Empleado;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends JFrame {

    // * Atributos
    private JTextField credentialTxt;
    private JPasswordField txtPassword;
    private JButton enterBtn;
    private Empleado registeredEmployee; //emplado registrado
    private ArrayList<Empleado> employeeList;

    public Login() {
        this.employeeList = new ArrayList<>();
        this.employeeList.add(new Empleado("admin", "admin", 101)); //admini
        this.employeeList.add(new Empleado("Juan Pérez", "Cajero", "Cajero1", "1234", 102)); //empleado  1
        this.employeeList.add(new Empleado("María Perez", "Cajero", "Cajero2", "1234", 103)); //empleado 2

        // * Config ventana login
        setTitle("Acceso al Sistema de Caja Registradora");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //centrar ventana
        setLayout(new GridLayout(4, 1, 10, 10));

        // * Parte visual login
        JPanel credentialPanel = new JPanel(new FlowLayout());
        credentialPanel.add(new JLabel("Usuario:        "));
        credentialTxt = new JTextField(12);
        credentialPanel.add(credentialTxt);

        JPanel panelPassword = new JPanel(new FlowLayout());
        panelPassword.add(new JLabel("Contraseña: "));
        txtPassword = new JPasswordField(12);
        panelPassword.add(txtPassword);

        JPanel panelBoton = new JPanel(new FlowLayout());
        enterBtn = new JButton("Ingresar");
        panelBoton.add(enterBtn);

        add(new JLabel("INICIO DE SESIÓN", SwingConstants.CENTER));
        add(credentialPanel);
        add(panelPassword);
        add(panelBoton);

        //Boton para entrar
        enterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAccess();
            }
        });
    }

    private void validateAccess() {
        String credencial = credentialTxt.getText();
        String password = new String(txtPassword.getPassword());

        Empleado registeredEmployee = null;
        for (Empleado emp : this.employeeList) {
            if (emp.login(credencial, password)) {
                registeredEmployee = emp;
                break;
            }
        }

       // if (registeredEmployee.login(credencial, password)) { //emplado registrado
        if (registeredEmployee != null) { //emplado registrado
            JOptionPane.showMessageDialog(this, "¡Bienvenido " + registeredEmployee.getName() + "!");

            // * Cerrar ventana login
            this.dispose();

            // * Abrir parte caja
            CajaRegistradora pantallaPrincipal = new CajaRegistradora(registeredEmployee);
            pantallaPrincipal.setVisible(true);

        } else { //mostrar si pusieron los datos mal
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
