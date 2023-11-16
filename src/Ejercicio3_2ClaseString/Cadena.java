package Ejercicio3_2ClaseString;

import java.sql.SQLOutput;

public class Cadena {
    String cadenaInicial = " Programacion Orientada a Objetos ";

    //Metodo main
    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        //imprimimos el valor iniciar de la cadena inicial
        System.out.println("Texto incial:_");

        //Obtener la longitud de dicho String.
        int longitud = cadena.cadenaInicial.length();
        System.out.println("La longitud es: "+ longitud);

        //Eliminar los espacios en blanco del String obtenido en el paso anterior.
        String cadenaSinEspacios = cadena.cadenaInicial.trim();
        System.out.println("Cadena sin espacios en blanco: "+cadenaSinEspacios);

        //Pasar todos los caracteres del String (obtenido en el paso anterior) a mayúsculas.
        String cadenaAMayusculas = cadenaSinEspacios.toUpperCase();
        System.out.println("Cadena en mayusculas: "+cadenaAMayusculas);

        //Concatenar al String (obtenido en el paso anterior) el String “12345”.
        String cadenaConcatenado = cadenaAMayusculas.concat("12345");
        System.out.println("Cadena concatenada: "+cadenaConcatenado);

        //Extraer del String (obtenido en el paso anterior), un Substring desde la posición 10 al 15.
        String cadenaExtraida = cadenaConcatenado.substring(10,15);
        System.out.println("Cadena extraido = "+cadenaExtraida);

        //Reemplazar en el String (obtenido en el paso anterior) el carácter “o” por “O”.
        String cadenaReemplazada = cadenaExtraida.replace("O","X");
        System.out.println("Cadena remplazada = "+cadenaReemplazada);

        //Comparar el String (obtenido en el paso anterior) con el String “Programación”.
        boolean comparar = cadenaReemplazada.equals("Programación");
        System.out.println("Las cadenas son iguales = "+comparar);

    }
}
