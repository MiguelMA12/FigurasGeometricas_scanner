package calculadorageometrica;

/**
 *
 * @author miguel angel
 */


public class Figuras {
  double area;

 
  public void AreaCirculo(double radio) {
    area = Math.PI * radio * radio;
    System.out.printf("El área del círculo es: %.2f\n", area);
  }

 
  public void AreaCuadrado(double lado) {
    area = lado * lado;
    System.out.printf("El área del cuadrado es: %.2f\n", area);
  }

 
  public void AreaTriangulo(double base, double altura) {
    area = (base * altura) / 2;
    System.out.printf("El área del triángulo es: %.2f\n", area);
  }

 
  public void AreaRectangulo(double base, double altura) {
    area = base * altura;
    System.out.printf("El área del rectángulo es: %.2f\n", area);
  }

  
  public void AreaEsfera(double radio) {
    area = 4 * Math.PI * radio * radio;
    System.out.printf("El área de la esfera es: %.2f\n", area);
  }


  public void AreaCubo(double arista) {
    area = 6 * arista * arista;
    System.out.printf("El área del cubo es: %.2f\n", area);
  }
}