package ListadoPersonas;

public class Personas {
    // Atributos
    private int id;
    private String nombre;
    private String email;
    private String tel;
    private static int contadorPersonas = 0; // Variable estática para contar personas

    // Constructor
    public Personas(int id, String nombre, String email, String tel) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tel = tel;
        contadorPersonas++; // Incrementa el contador cada vez que se crea una nueva persona
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // Método estático para obtener el número total de personas
    public static int getNumeroPersonas() {
        return contadorPersonas;
    }
}