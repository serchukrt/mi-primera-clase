public class Movil{
    private String modelo;
    private int bateria;
    private boolean estado;
    
    public Movil(String nombreModelo, int porcentajeDeBateria){
        modelo = nombreModelo;
        bateria = porcentajeDeBateria;
        estado = false;
    }
    public String getModelo(){
        return modelo;
    }
    public int getBateria(){
        return bateria;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setModelo(String nombreModelo){
        modelo = nombreModelo;
    }
    public void cargarMovil(int porcentajeDeCarga){
        bateria = bateria + porcentajeDeCarga;
    }
    public void setEstado(){
        if(estado == false){
            estado = true;
        }
        else{
            estado = false;
        }
    }
    public void imprimirDetalles(){
        String estadoString = "apagado";
        if(estado == true){
            estadoString = "encendido";
        }
        System.out.println("Modelo: " + modelo + " | Porcentaje de la Bateria: " + bateria + " | Estado: " + estadoString);
    }
    public String getDetalles(){
        String estadoString = "apagado";
        if(estado == true){
            estadoString = "encendido";
        }
        return "Modelo: " + modelo + " | Porcentaje de la Bateria: " + bateria + " | Estado: " + estadoString;
    }
}