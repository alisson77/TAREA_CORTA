public class Rectangulo extends Figura implements Comparable<Figura>{
    private double base;
    private double altura;
    private int lados;
    public Rectangulo(double pBase, double pAltura, int lado){
        base = pBase;
        altura = pAltura;
        lados=lado;
    }
//implementacion del metodo abstracto
public double calcularArea(){
    return base*altura;
}
public int LadosFigura(){
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