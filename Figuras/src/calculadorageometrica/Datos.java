
package calculadorageometrica;

import java.util.Scanner;

/**
 *
 * @author ayeri
 */
public class Datos {
  Scanner sc = new Scanner(System.in);
  Figuras fig = new Figuras();

 
 public void Entrada() {
    double radio, lado, base, altura, arista;

    System.out.println("Ingrese el radio del círculo: ");
    radio = sc.nextDouble();
    fig.AreaCirculo(radio);

    System.out.println("Ingrese el lado del cuadrado: ");
    lado = sc.nextDouble();
    fig.AreaCuadrado(lado);

    System.out.println("Ingrese la base y altura del triángulo: ");
    base = sc.nextDouble();
    altura = sc.nextDouble();
    fig.AreaTriangulo(base, altura);

    System.out.println("Ingrese la base y altura del rectángulo: ");
    base = sc.nextDouble();
    altura = sc.nextDouble();
    fig.AreaRectangulo(base, altura);

    System.out.println("Ingrese el radio de la esfera: ");
    radio = sc.nextDouble();
    fig.AreaEsfera(radio);

    System.out.println("Ingrese la arista del cubo: ");
    arista = sc.nextDouble();
    fig.AreaCubo(arista);
  }
}

