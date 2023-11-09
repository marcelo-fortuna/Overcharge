/**
 * Class created to generate objects of type Figure studying the concept of Overchage of methods.
 * @author Marcelo Fortuna
 * @since 09/11/2023
 */
public class Figure {
    Integer a,b,c,d;

    /**
     * Constructor of a point.
     * @param a
     */
    public Figure(int a) {
        this.a = a;
    }

    /**
     * Constructor of a line.
     * @param a
     * @param b
     */
    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Constructor of a triangule.
     * @param a
     * @param b
     * @param c
     */
    public Figure(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Constructor of a retangule.
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public Figure(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Method to identify automatically wich type Figure is.
     */
    public void showFigure() {
        if(a != null && b == null && c == null && d == null)
            showFigure(1);
        else if(a != null && b != null && c == null && d == null)
            showFigure("nxts");
        else if(a != null && b != null && c != null && d == null)
            showFigure(true);
        else
            showFigure(1.0f);
    }

    /**
     * Method to show data of a point.
     * The difference of the parameters for the overcharge of methods (methods with the same name)
     * is set by the type, quantity and order of the parameters.
     * @param x
     */
    public void showFigure(int x) {
        System.out.println("Valor do ponto: " + a);
    }

    /**
     * Method to show data of a line.
     * The difference of the parameters for the overcharge of methods (methods with the same name)
     * is set by the type, quantity and order of the parameters.
     * @param d
     */
    public void showFigure(String d){
        System.out.println("Valor da linha: " + a + " e " + b);
    }

    /**
     * Method to show data of a triangule.
     * The difference of the parameters for the overcharge of methods (methods with the same name)
     * is set by the type, quantity and order of the parameters.
     * @param i
     */
    public void showFigure(boolean i){
        System.out.println("Valor do triângulo: " + a + ", " + b + " e " + c);
    }

    /**
     * Method to show data of a retangule.
     * The difference of the parameters for the overcharge of methods (methods with the same name)
     * is set by the type, quantity and order of the parameters.
     * @param t
     */
    public  void showFigure(float t) {
        System.out.println("Valor do retângulo: " + a + ", " + b + ", " + c + " e " + d);
    }
}
