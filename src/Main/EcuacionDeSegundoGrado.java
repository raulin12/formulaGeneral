
package Main;

/**
 *
 * @author raul
 */
public class EcuacionDeSegundoGrado {
    
    double coeficienteA;
    double coeficienteB;
    double coeficienteC;
public EcuacionDeSegundoGrado(double a, double b, double c){
    this.coeficienteA=a;
    this.coeficienteB=b;
    this.coeficienteC=c;
}
public double getCoeficienteA(){
    return this.coeficienteA;
}
public double getCoeficienteB(){
    return this.coeficienteB;
}
public double getCoeficienteC(){
    return this.coeficienteC;
}
public double getDiscriminante(){
    double Discriminante;
    Discriminante = Math.pow (coeficienteB, 2) - (4 * coeficienteA * coeficienteC);
    return Discriminante;
}
public int getNumeroDeSoluciones(){
    int numeroDeRaices;
    double d = getDiscriminante();
        if (d > 0){
            numeroDeRaices = 2;
        }
        else if (d < 0){
    numeroDeRaices = 0;
}
        else {
            numeroDeRaices = 1;
        }
        return numeroDeRaices;
}
public double getRaiz1(){
    double raiz1;
    raiz1 = (-coeficienteB + Math.sqrt(getDiscriminante())) / (2 * coeficienteA);
    return raiz1;
}
public double getRaiz2(){
double raiz2;
raiz2 = (-coeficienteB - Math.sqrt(getDiscriminante())) / (2 * coeficienteA);
return raiz2;
}
    
}
