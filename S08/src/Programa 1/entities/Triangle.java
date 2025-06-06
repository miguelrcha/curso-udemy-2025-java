package entities;

public class Triangle {

    public double a; //public type pode ser acessado entre os dados dentro do package
    public double b; //public type pode ser acessado entre os dados dentro do package
    public double c; //public type pode ser acessado entre os dados dentro do package

    public double AreaTriangle() {
        double pTriangle = (a + b + c) / 2;
        return Math.sqrt(pTriangle * (pTriangle - a) * (pTriangle - b) * (pTriangle - c));
    }
}
