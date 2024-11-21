public class Movil{
    private String modelo;
    private int bateria;
    private boolean estado;
    
    public Movil(String nombreModelo, int porcentajeDeBateria, boolean encendido){
        modelo = nombreModelo;
        bateria = porcentajeDeBateria;
        estado = encendido;
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
    public void setBateria(int porcentajeDeBateria){
        bateria = porcentajeDeBateria;
    }
    public void setEstado(boolean encendido){
        estado = encendido;
    }
}