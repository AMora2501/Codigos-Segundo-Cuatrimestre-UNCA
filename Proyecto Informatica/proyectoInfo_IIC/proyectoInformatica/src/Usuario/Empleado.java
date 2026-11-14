package Usuario;
public class Empleado {

// * Atributos
    public String name;         //nombre
    public String workstation;  //puesto de trabajo
    public String credential;   //credenciales
    private String password;    //contraseña
    public int id;              //identificacion

// * Constructor
    public Empleado(String name, String workstation, String credential, String password, int id){
        this.name = name;
        this.workstation = workstation;
        this.credential = credential;
        this.password = password;
        this.id = id;
    }

// * Sobrecarga para empleado
    public Empleado(String credential, String password, int id){
        this("Bienvenido Administrador", "Admin", credential, password, id);
        
    }

// * Metodos
    //Obtener usario
    public String getName(){
        return this.name;
    }

    //Obtener puesto de trabajo
    public String getworkstation(){
        return this.workstation;
    }

    //Obtener credenciales
    public String getcredential(){
        return this.credential;
    }
    
    //Verificar si esta bien el inicio de sesion
    public boolean login(String credencialIngresada, String ingressPasword) {
        return this.credential.equals(credencialIngresada) && this.password.equals(ingressPasword);
    }
}
