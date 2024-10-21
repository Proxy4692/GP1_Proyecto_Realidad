package modelo;

public class Paciente{
    private int nroPaciente;
    private String nombre;
    private int edad;
    private float altura;
    private float pesoActual;
    private float pesoBuscado;

    public Paciente(int nroPaciente, String nombre, int edad, float altura, float pesoActual, float pesoBuscado) {
        this.nroPaciente = nroPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoBuscado = pesoBuscado;
    }

    public boolean seAcercaAlPeso() {
        return (pesoActual - pesoBuscado) <= 2;
    }
}