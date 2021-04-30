package lab2p2_pabloguevara;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_PabloGuevara {

    public static void main(String[] args) {
        ArrayList<computadoras> listaComputadoras = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 8) {
            System.out.println("----MENU----");
            System.out.println("1.Crear computadora");
            System.out.println("2.Listar computadoras");
            System.out.println("3.Eliminar computadoras");
            System.out.println("4.Modificar computadora");
            System.out.println("5.Informe 1");
            System.out.println("8.Salir");
            System.out.println("Ingrese su opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    String modelo,
                     tecladoNum,
                     tipoProcesador,
                     tarjetaGrafica,
                     sistemaOperativo;
                    int NumSerie;
                    float CapHDD,
                     tamPantalla,
                     tiempoFabricacion,
                     capBateria,
                     duracionBateria;
                    System.out.println("Ingrese modelo de la computadotra: ");
                    modelo = leer.next();
                    System.out.println("Ingrese numero de serie de la computadotra: ");
                    NumSerie = leer.nextInt();
                    System.out.println("Ingrese la capacidad del disco duro de la computadotra: ");
                    CapHDD = leer.nextFloat();
                    System.out.println("Ingrese el tamaño de pantalla de la computadotra: ");
                    tamPantalla = leer.nextFloat();
                    System.out.println("¿La computadora tiene teclado numerico?: ");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    tecladoNum = leer.next();
                    if (tecladoNum.equals("1")) {
                        tecladoNum = "Si";
                    }
                    if (tecladoNum.equals("2")) {
                        tecladoNum = "No";
                    }

                    System.out.println("Ingrese el tipo de procesador: ");
                    tipoProcesador = leer.next();

                    System.out.println("Ingrese tipo de tarjeta gráfica: ");
                    System.out.println("1.Normal");
                    System.out.println("2.Gamer");
                    tarjetaGrafica = leer.next();
                    if (tarjetaGrafica.equals("1")) {
                        tarjetaGrafica = "Normal";
                    }
                    if (tarjetaGrafica.equals("2")) {
                        tarjetaGrafica = "Gamer";
                    }

                    System.out.println("Ingrese sistema operativo por defecto: ");
                    System.out.println("1.Windows");
                    System.out.println("2.ChromeOS");
                    sistemaOperativo = leer.next();
                    if (sistemaOperativo.equals("1")) {
                        sistemaOperativo = "Windows";
                    }
                    if (sistemaOperativo.equals("2")) {
                        sistemaOperativo = "ChromeOS";
                    }

                    System.out.println("Ingrese tiempo de fabricacion en horas: ");
                    tiempoFabricacion = leer.nextFloat();

                    System.out.println("Ingrese capacidad de bateria en miliamperios: ");
                    capBateria = leer.nextLong();

                    System.out.println("Ingrese duracion de la bateria en horas: ");
                    duracionBateria = leer.nextLong();

                    listaComputadoras.add(new computadoras(modelo, NumSerie, CapHDD, tamPantalla, tecladoNum, tipoProcesador, tarjetaGrafica, sistemaOperativo, tiempoFabricacion, capBateria, duracionBateria));
                    break;
                case 2:
                    String salida = "";
                    for (Object t : listaComputadoras) {
                        if (t instanceof computadoras) {
                            salida += listaComputadoras.indexOf(t) + "- " + t + "\n";
                        }
                    }
                    System.out.println(salida);
                    break;
                case 3:
                    int numSerieaEliminar,
                     cont = 0,
                     valoraEliminar = -1;
                    System.out.println("Ingrese el numero de serie de la computadora a eliminar: ");
                    numSerieaEliminar = leer.nextInt();

                    for (int i = 0; i < listaComputadoras.size(); i++) {
                        computadoras compu = listaComputadoras.get(i);

                        if (compu.getNumSerie() == numSerieaEliminar) {
                            valoraEliminar = cont;
                        }
                        cont++;
                    }

                    if (valoraEliminar != -1) {
                        System.out.println("Eliminando: " + listaComputadoras.get(valoraEliminar));
                        listaComputadoras.remove(valoraEliminar);
                    } else {
                        System.out.println("Numero de serie no encontrado");
                    }
                    break;
                case 4:
                    int numSerieaModificar,
                     contM = 0,
                     valoraModificar = -1;
                    System.out.println("Ingrese el numero de serie de la computadora a modificar: ");
                    numSerieaModificar = leer.nextInt();

                    for (int i = 0; i < listaComputadoras.size(); i++) {
                        computadoras compu = listaComputadoras.get(i);

                        if (compu.getNumSerie() == numSerieaModificar) {
                            valoraModificar = contM;
                        }
                        contM++;
                    }

                    if (valoraModificar != -1) {
                        String modeloM = "", tecladoNumM, TipoProcesadorM, tarjetaGraficaM, sistemaOperativoM;
                        float CapHDDM, tamPantallaM, tiempoFabricacionM, capBateriaM, duracionBateriaM;
                        //inicio 1 modificacion
                        System.out.println("¿Desea modificar modelo?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        modeloM = leer.next();
                        if (modeloM.equals("1")) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("Ingrese nuevo modelo: ");
                                modeloM = leer.next();
                                ((computadoras) listaComputadoras.get(valoraModificar)).setModelo(modeloM);

                            }

                        }
                        //Fin 1 modificacion
                        System.out.println("¿Desea modificar capacidad del disco duro?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        CapHDDM = leer.nextFloat();
                        if (CapHDDM == 1.00) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("Ingrese nueva capacidad del disco duro: ");
                                CapHDDM = leer.nextFloat();
                                ((computadoras) listaComputadoras.get(valoraModificar)).setCapHDD(CapHDDM);
                            }

                        }
                        ///////Fin 2
                        System.out.println("¿Desea modificar el tamaño de la pantalla?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        tamPantallaM = leer.nextFloat();
                        if (tamPantallaM == 1.00) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("Ingrese el nuevo tamaño de pantalla: ");
                                tamPantallaM = leer.nextFloat();
                                ((computadoras) listaComputadoras.get(valoraModificar)).setTamPantalla(tamPantallaM);
                            }

                        }
                        ////FIN MOD3
                        System.out.println("¿Desea modificar teclado numerico?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        tecladoNumM = leer.next();
                        if (tecladoNumM.equals("1")) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("La computadora tiene teclado numerico: ");
                                System.out.println("1.Si");
                                System.out.println("2.No");

                                tecladoNumM = leer.next();
                                if (tecladoNumM.equals("1")) {
                                    tecladoNumM = "Si";
                                }
                                if (tecladoNumM.equals("2")) {
                                    tecladoNumM = "No";
                                }
                                ((computadoras) listaComputadoras.get(valoraModificar)).setTecladoNum(tecladoNumM);

                            }

                        }
                        //Fin 4 modificacion

                        System.out.println("¿Desea modificar tipo de procesador?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        TipoProcesadorM = leer.next();
                        if (TipoProcesadorM.equals("1")) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("Ingrese nuevo tipo de procesador: ");

                                TipoProcesadorM = leer.next();

                                ((computadoras) listaComputadoras.get(valoraModificar)).setTipoProcesador(TipoProcesadorM);

                            }

                        }
                        //Fin 5 modificacion
                        System.out.println("¿Desea modificar tarjeta gráfica?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        tarjetaGraficaM = leer.next();
                        if (tarjetaGraficaM.equals("1")) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("La computadora tiene teclado numerico: ");
                                System.out.println("1.Normal");
                                System.out.println("2.Gamer");
                                tarjetaGraficaM = leer.next();
                                if (tarjetaGraficaM.equals("1")) {
                                    tarjetaGraficaM = "Normal";
                                }
                                if (tarjetaGraficaM.equals("2")) {
                                    tarjetaGraficaM = "Gamer";
                                }
                                ((computadoras) listaComputadoras.get(valoraModificar)).setTarjetaGrafica(tarjetaGraficaM);

                            }

                        }
                        //////FIN 6

                        System.out.println("¿Desea modificar el sistema operativo?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        sistemaOperativoM = leer.next();
                        if (sistemaOperativoM.equals("1")) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {

                                System.out.println("Ingrese nuevo sistema operativo por defecto: ");
                                System.out.println("1.Windows");
                                System.out.println("2.ChromeOS");
                                sistemaOperativoM = leer.next();
                                if (sistemaOperativoM.equals("1")) {
                                    sistemaOperativoM = "Windows";
                                }
                                if (sistemaOperativoM.equals("2")) {
                                    sistemaOperativoM = "ChromeOS";
                                }
                                ((computadoras) listaComputadoras.get(valoraModificar)).setSistemaOperativo(sistemaOperativoM);

                            }

                        }
                        //////FIN 7
                        System.out.println("¿Desea modificar el tiempo de fabricación?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        tiempoFabricacionM = leer.nextFloat();
                        if (tiempoFabricacionM == 1.00) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("Ingrese el nuevo tiempo de fabricación: ");
                                tiempoFabricacionM = leer.nextFloat();
                                ((computadoras) listaComputadoras.get(valoraModificar)).setTiempoFabricacion(tiempoFabricacionM);
                            }

                        }
                        //////FIN 8
                        System.out.println("¿Desea modificar la capacidad de bateria?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        capBateriaM = leer.nextFloat();
                        if (capBateriaM == 1.00) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("Ingrese la nueva capacidad de bateria: ");
                                capBateriaM = leer.nextFloat();
                                ((computadoras) listaComputadoras.get(valoraModificar)).setCapBateria(capBateriaM);
                            }

                        }
                        //////FIN 9
                        System.out.println("¿Desea modificar la duración de la bateria?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        duracionBateriaM = leer.nextFloat();
                        if (duracionBateriaM == 1.00) {

                            if (listaComputadoras.get(valoraModificar) instanceof computadoras) {
                                System.out.println("Ingrese la nueva deración de la bateria: ");
                                duracionBateriaM = leer.nextFloat();
                                ((computadoras) listaComputadoras.get(valoraModificar)).setDuracionBateria(duracionBateriaM);
                            }

                        }
                        //////FIN 10
                    }
                    break;
                case 5:
                    System.out.println("COMPUTADORAS GAMERS");
                    String salida2 = "";
                    for (Object t : listaComputadoras) {
                        if (t instanceof computadoras) {
                            for (int i = 0; i < listaComputadoras.size(); i++) {
                        computadoras compuGamers = listaComputadoras.get(i);

                        if (compuGamers.getTarjetaGrafica().equals("Gamer") && compuGamers.getTamPantalla()>17.0 && compuGamers.getTecladoNum().equals("Si")) {
                            System.out.println(compuGamers);

                        }
                      
                    }
                        }
                    }
 
                    break;
                    case 6:
                    System.out.println("COMPUTADORAS EDUCATIVAS");
 
                    for (Object t : listaComputadoras) {
                        if (t instanceof computadoras) {
                            for (int i = 0; i < listaComputadoras.size(); i++) {
                        computadoras compuEducativa = listaComputadoras.get(i);

                        if (compuEducativa.getCapHDD()<300 && compuEducativa.getSistemaOperativo().equals("ChromeOS") && compuEducativa.getTamPantalla()<12) {
                            System.out.println(compuEducativa);

                        }
                      
                    }
                        }
                    }
   
                    break;
                    
                    case 7:
                    System.out.println("COMPUTADORAS DE POCO USO");
 
                    for (Object t : listaComputadoras) {
                        if (t instanceof computadoras) {
                            for (int i = 0; i < listaComputadoras.size(); i++) {
                        computadoras compPocoUso = listaComputadoras.get(i);

                        if (compPocoUso.getTiempoFabricacion()>2 && compPocoUso.getDuracionBateria()<1 && compPocoUso.getSistemaOperativo().equals("Windows")) {
                            System.out.println(compPocoUso);

                        }
                      
                    }
                        }
                    }
  
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
                    break;
            }
        }
    }

}
