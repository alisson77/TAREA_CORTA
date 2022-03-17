public class Circulo extends Figura implements Comparable<Figura>{
    private double radio;
    private int lados;
    public Circulo(double radioc,int lado){
        radio= radioc;
        lados=lado;
    }
    
    
//implementacion del metodo abstracto
 
    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return Math.PI* Math.pow(radio, 2);
    }
    @Override
    public int LadosFigura() {
        // TODO Auto-generated method stub
        return lados;
    }
    
    @Override
public int compareTo(Figura figura) {
    if(this.calcularArea()==figura.calcularArea()){
        return compareLado(figura);  
    }
    else if(this.calcularArea()>figura.calcularArea()){
        return 1;
    }
    else{
        return -1;
    }

    }
    @Override
    public int compareLado(Figura f) {
        if(this.LadosFigura()==f.LadosFigura()){
            return 0;
        }
        else if(this.LadosFigura()>f.LadosFigura()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}