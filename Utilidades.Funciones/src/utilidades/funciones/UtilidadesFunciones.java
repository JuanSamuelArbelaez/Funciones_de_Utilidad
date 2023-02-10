package utilidades.funciones;

import javax.swing.JOptionPane;

public class UtilidadesFunciones
{
    public static void main(String[] args)
    {
        int n1, n2, adicion, diferencia, producto, cociente;
        
        n1=leerInt("Ingrese un numero: ");
        n2=leerInt("Ingrese un numero: ");
        
        adicion=sumar(n1, n2);
        diferencia=restar(n1, n2);
        producto=multiplicar(n1, n2);
        cociente=dividir(n1, n2);
        
        imprimirMensaje("La suma de "+n1+" y "+n2+" es: "+adicion);
        imprimirMensaje("La resta de "+n1+" y "+n2+" es: "+diferencia);
        imprimirMensaje("La multiplicacion entre "+n1+" y "+n2+" es: "+producto);
        imprimirMensaje("La división entre "+n1+" y "+n2+" es: "+cociente);
    }
    
    public static int leerInt(String mensaje) //Funcion que lee un entero
    {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static char leerChar(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje).charAt(0);
    }
    
    public static String leerString(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public static float leerFloat(String mensaje)
    {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    
    public static double leerDouble(String mensaje)
    {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }
    
    public static void imprimirMensaje(String mensaje) //Funcion que imprime un mensaje
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int sumar(int a, int b) //Funcion que calcula la adicion de 2 numeros
    {
        return a+b;
    }
    
    public static int restar(int a, int b) //Funcion que calcula la diferencia de 2 numeros
    {
        return (a-b);
    }
    
    public static int multiplicar(int a, int b) //Funcion que calcula el producto de 2 numeros
    {
        return (a+b);
    }
    
    public static int dividir(int a, int b) //Funcion que calcula el cociente de 2 numeros
    {
        return (a/b);
    }
    
    public static boolean validarPar(int n)
    {
        boolean paridad;
        
        paridad=false;
        
        if ((n%2)==0)
        {
            paridad = true;
        }
        
        return paridad;
    }
}