public class Triangulo extends Figura implements Comparable<Figura>{
    private double baseT;
    private double alturaT;
    private int lados;
    public Triangulo(double pBaseT, double pAlturaT,int lado){
        baseT = pBaseT;
        alturaT = pAlturaT;
        lados=lado;
    }
//implementacion del metodo abstracto

@Override
public double calcularArea() {
    return (baseT*alturaT)/2;
    
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