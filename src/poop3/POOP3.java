/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Este código muestra diferentes formas de declarar arreglos
         */
        System.out.println("######## arreglos ########");
        int []nums;    //formas de declarar arreglos
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] nums4={1,2,3,4};
        
        /**
         * Imprime los elementos del arreglo 'nums4' usando los ciclos for y for-each
         */
        System.out.println("######## arreglos ########");
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
        
        System.out.println("######## for-each ########");
        for (int i : nums4) {
            System.out.println(i);
        }
        
        /**
         * Imprime los resultados de la concatenación de dos cadenas
         */
        System.out.println("######## concatenar ########");
        String s= new String("Hola mundo");                     //constructor que me ayuda a inflar la variable 's'
        String s1 ="Hola mundo";                                        //el de abajo solo marca que nunca se lee
        System.out.println(s);
        System.out.println(s1);
        String nombre = "Berenice";
        String apellido = "Jacinto";
        String nombreCompleto= nombre+" "+apellido;
        System.out.println(nombreCompleto);
        
        /**
         * Imprime el número de elementos de un arreglo y el tamaño de una cadena
         * También imprime la cadena en mayúsculas
         */
        System.out.println("######## operador punto ########");
        System.out.println("num elementos del arreglo: "+nums4.length); //arreglo primitivo
        System.out.println("num elementos de nombre: "+nombre.length()); //.length() es de método se hace una operación para obtener el tamaño de la cadena 
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
        
        /**
         * Imprime ejemplos de wrappers y autoboxing
         */
        System.out.println("######## Wrappers y Autoboxing ########");
        int a=3;
        Integer k= new Integer(50); //ta deprecado el warning dice que mejor lo usemos como primitivo 
        Integer l=22; //y quiere que se haga así, porque actualmente ya no se usa así
        int r=l;
        int b=7;
        float c=b; //esto es casteo la convierte a flotante
        int d=(int)c; //la regresa a entero
        Integer rr=r; //r=22
        String s3 = rr.toString();  //este es parseo
        System.out.println(rr);
        String s4=r+""; //conjunto vacio de las cadenas, r+"" convierte a 22 en texto este tambien es parseo
        System.out.println(s4);
        System.out.println(s4.length());
        
        //parseo - to parse convertir de números a cadenas, al inverso no se puede solo así nt d=(int)c;
        //casteo - to cast  conviersiones de tipo aritmético
        
        /**
         * Imprime ejemplos de uso de colecciones, especificamente de ArrayList
         */
        System.out.println("######## Colecciones ########");
        
        System.out.println("######## arrayList ########");
        ArrayList<Integer>miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(9);
        System.out.println(miArrayList.size()); //tamaño
        System.out.println(miArrayList.get(0)); //que obtenga lo que hay en la posición 0
        miArrayList.add(0,20); //aquí que cambie lo que hay en la posición cero, por un 20
        miArrayList.add(0, l);
        System.out.println("***");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        
        /**
         * Imprime ejemplos del uso de Hashtable, insertando llaves y su correspondiente valor
         */
        System.out.println("######## Hashtable ########");
        Hashtable<Integer,String>agenda=new Hashtable<Integer,String>(); //no tiene orden, y los valroes son una lista 
        agenda.put(k, "Pedro");
        agenda.put(12345, "Berenice");
        agenda.put(23456, "Isabela");
        agenda.put(3456, "Bryan");
        System.out.println(agenda.size());
        System.out.println("***");
        for (String valor : agenda.values()) {
            System.out.println(valor);    
        }
        for (Object clave : agenda.keySet()) {
            System.out.println(clave);
        }
        
        /**
         * Imprime ejemplos de uso de enumeraciones para el anterior Hashtable
         */
        System.out.println("######## Enumeración ########");     //se enumeran cada una de las las claves
        Integer clave;
        String valor;
        Enumeration<Integer> llaves=agenda.keys();               // llaves almacena a los números telefónicos
        while (llaves.hasMoreElements()) {
            clave=llaves.nextElement();                             //aqui el nùmero
            valor=agenda.get(clave);                            //aqui guarda el nombre de la persona
            System.out.println("clave: "+clave+ " valor:"+valor);
        }
        
        /**
         * Imprime ejemplos de uso de la clase Math
         */
        System.out.println("######## Math ########");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));
        
        /**
         * Imprime la fecha con un formato determinado con el uso de la clase Date
         */
        System.out.println("######## Date ########");
        Date hoy =new Date();
        System.out.println(hoy.toString());             //aqui hay otro parseo implicito con toString implicitamente lo convierte en una cadena
        
        /**
         * Imprime un calendario con la fecha actual
         */
        System.out.println("************* Calendario **************");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        /**
         * Imprime la fecha actual en formato dd-MM-yyy
         */
        System.out.println("************* Formato de date **************");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));

        /**
         * Imprime la fecha actual en formato "dd de mes de año"
         */
        System.out.println("************* Formato de calendar **************");
        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
        fechaActual += (calendarioHoy.get(Calendar.MONTH)+1) + " de ";
        fechaActual += calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
        
        /**
         * Imprime un diccionario de animales
         */
        //Realizar un diccionario con 5 palabras usando Hashtable e imprimir todos los elementos
        System.out.println("######## Diccionario de Animales ########");
        Hashtable<String,String>diccionario=new Hashtable<String,String>(); 
        diccionario.put("A","Abeja");
        diccionario.put("B","Becerro");
        diccionario.put("C","Caballo");
        diccionario.put("D","Delfin");
        diccionario.put("E","Elefante");
        String letra,animal;
        Enumeration<String> llave=diccionario.keys(); 
        while (llave.hasMoreElements()){
            letra=llave.nextElement();
            animal=diccionario.get(letra);
            System.out.println(letra+" de "+animal);
        }
        
        /**
         * Imprime una agenda de cumpleaños
         */
        //Realizar una agenda con 5 registros guardando nombre de persona y su cumpleaños usando Hashtable y calendar e imprimir todos los elementos
        System.out.println("######## Agenda de Cumpleaños ########");
        Hashtable<String,Calendar>agendaCum=new Hashtable<String,Calendar>();
        
        Calendar cumV = Calendar.getInstance();
        cumV.set(Calendar.MONTH,Calendar.DECEMBER);
        cumV.set(Calendar.DAY_OF_MONTH,16);
        
        Calendar cumR = Calendar.getInstance();
        cumR.set(Calendar.MONTH,Calendar.AUGUST);
        cumR.set(Calendar.DAY_OF_MONTH,12);
        
        Calendar cumI = Calendar.getInstance();
        cumI.set(Calendar.MONTH,Calendar.OCTOBER);
        cumI.set(Calendar.DAY_OF_MONTH,12);
        
        Calendar cumS = Calendar.getInstance();
        cumS.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cumS.set(Calendar.DAY_OF_MONTH,21);
        
        Calendar cumB = Calendar.getInstance();
        cumB.set(Calendar.MONTH,Calendar.JULY);
        cumB.set(Calendar.DAY_OF_MONTH,17);
        
        agendaCum.put("Valentín Jacinto", cumV);
        agendaCum.put("Rosalinda Robledo", cumR);
        agendaCum.put("Brenda Jacinto", cumI);
        agendaCum.put("Santiago Jacinto", cumS);
        agendaCum.put("Berenice Jacinto", cumB);
        
        
        Enumeration<String> persona=agendaCum.keys();
        SimpleDateFormat cumple = new SimpleDateFormat("dd-MM");
        while (persona.hasMoreElements()){
           String nombres= persona.nextElement();
           Calendar fecha = agendaCum.get(nombres);
           System.out.println("Nombre: "+nombres+"\t Fecha cumple:"
                   +cumple.format(fecha.getTime()));
        }
        
    }
    
}
