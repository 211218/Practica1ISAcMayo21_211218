package Reloj;

public class Horario {
    
    //Atributos
    public int hora;
    public int minuto;
    public int segundo;

    //Contructor Vacio
    public Horario(){

    }

    //Constructor Con Parametros
    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Metodos
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minuto;
    }

    public void setMinutos(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundos() {
        return segundo;
    }

    public void setSegundos(int segundo) {
        this.segundo = segundo;
    }

    //Metodo Imprimir
    public String toString() {
        return (hora + " : " + minuto + " : " + segundo);
    }

}
