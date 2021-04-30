package lab2p2_pabloguevara;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_PabloGuevara {

    public static void main(String[] args) {
        ArrayList<computadoras> listaComputadoras=new ArrayList();
        Scanner leer=new Scanner(System.in);
        int opcion=0;
        
        while(opcion!=5){
            System.out.println("----MENU----");
            System.out.println("1.Crear computadora");
            System.out.println("2.Listar computadoras");
            System.out.println("3.Eliminar computadoras");
            System.out.println("4.Modificar computadora");
            System.out.println("Ingrese su opción: ");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    String modelo, tecladoNum, tipoProcesador, tarjetaGrafica,sistemaOperativo;
                    int NumSerie;
                    float CapHDD, tamPantalla, tiempoFabricacion, capBateria, duracionBateria;
                    System.out.println("Ingrese modelo de la computadotra: ");
                    modelo=leer.next();
                    System.out.println("Ingrese numero de serie de la computadotra: ");
                    NumSerie=leer.nextInt();
                    System.out.println("Ingrese la capacidad del disco duro de la computadotra: ");
                    CapHDD=leer.nextFloat();
                    System.out.println("Ingrese el tamaño de pantalla de la computadotra: ");
                    tamPantalla=leer.nextFloat();
                    System.out.println("¿La computadora tiene teclado numerico?: ");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    tecladoNum=leer.next();
                    if(tecladoNum.equals("1")){
                        tecladoNum="Si";
                    }
                    if(tecladoNum.equals("2")){
                        tecladoNum="No";
                    }
                    
                    
                    System.out.println("Ingrese el tipo de procesador: ");
                    tipoProcesador=leer.next();
                    
                    
                    System.out.println("Ingrese tipo de tarjeta gráfica: ");
                    System.out.println("1.Normal");
                    System.out.println("2.Gamer");
                    tarjetaGrafica=leer.next();
                    if(tarjetaGrafica.equals("1")){
                        tarjetaGrafica="Normal";
                    }
                    if(tarjetaGrafica.equals("2")){
                        tarjetaGrafica="Gamer";
                    }

                    
                     System.out.println("Ingrese sistema operativo por defecto: ");
                    System.out.println("1.Windows");
                    System.out.println("2.ChromeOS");
                    sistemaOperativo=leer.next();
                    if(sistemaOperativo.equals("1")){
                        sistemaOperativo="Windows";
                    }
                    if(sistemaOperativo.equals("2")){
                        sistemaOperativo="ChromeOS";
                    }
                    
                    System.out.println("Ingrese tiempo de fabricacion en horas: ");
                    tiempoFabricacion=leer.nextFloat();
                    
                    System.out.println("Ingrese capacidad de bateria en miliamperios: ");
                    capBateria=leer.nextLong();
                    
                    System.out.println("Ingrese duracion de la bateria en horas: ");
                    duracionBateria=leer.nextLong();
                    
                    listaComputadoras.add(new computadoras(modelo, NumSerie, CapHDD, tamPantalla, tecladoNum, tipoProcesador, tarjetaGrafica, sistemaOperativo, tiempoFabricacion, capBateria, duracionBateria));
                    break;
                case 2:
                    String salida="";
                for (Object t : listaComputadoras) {
                    if (t instanceof computadoras) {
                        salida+=listaComputadoras.indexOf(t)+"- "+t+"\n";
                    }
                }
                    System.out.println(salida);
                    break;
                case 3:
                    int numSerieaEliminar, cont=0, valoraEliminar=-1;
                    System.out.println("Ingrese el numero de serie a eliminar: ");
                    numSerieaEliminar=leer.nextInt();
                    
                    for (int i=0; i<listaComputadoras.size(); i++) {
                        computadoras compu=listaComputadoras.get(i);
                       
                        if(compu.getNumSerie()==numSerieaEliminar){
                            valoraEliminar=cont;
                        }
                        cont++;
                    }

                    if (valoraEliminar!=-1) {
                        System.out.println("Eliminando: "+listaComputadoras.get(valoraEliminar));
                        listaComputadoras.remove(valoraEliminar);
                    }
                case 4:
                    break;
                default:
                    System.out.println("La opcion elegida no es válida");
                    break;
            }
        }
    }
    
}
