package lab2p2_pabloguevara;

import java.util.Date;

public class computadoras {
    private String modelo;
    private int NumSerie;
    private float CapHDD;
    private float tamPantalla;
    private String tecladoNum;
    private String TipoProcesador;
    private String tarjetaGrafica;
    private String sistemaOperativo;
    private float tiempoFabricacion;
    private float capBateria;
    private float duracionBateria;

    public computadoras(String modelo, int NumSerie, float CapHDD, float tamPantalla, String tecladoNum, String TipoProcesador, String tarjetaGrafica, String sistemaOperativo, float tiempoFabricacion, float capBateria, float duracionBateria) {
        this.modelo = modelo;
        this.NumSerie = NumSerie;
        this.CapHDD = CapHDD;
        this.tamPantalla = tamPantalla;
        this.tecladoNum = tecladoNum;
        this.TipoProcesador = TipoProcesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.sistemaOperativo = sistemaOperativo;
        this.tiempoFabricacion = tiempoFabricacion;
        this.capBateria = capBateria;
        this.duracionBateria = duracionBateria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(int NumSerie) {
        this.NumSerie = NumSerie;
    }

    public float getCapHDD() {
        return CapHDD;
    }

    public void setCapHDD(float CapHDD) {
        this.CapHDD = CapHDD;
    }

    public float getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(float tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public String getTecladoNum() {
        return tecladoNum;
    }

    public void setTecladoNum(String tecladoNum) {
        this.tecladoNum = tecladoNum;
    }

    public String getTipoProcesador() {
        return TipoProcesador;
    }

    public void setTipoProcesador(String TipoProcesador) {
        this.TipoProcesador = TipoProcesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public float getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(float tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public float getCapBateria() {
        return capBateria;
    }

    public void setCapBateria(float capBateria) {
        this.capBateria = capBateria;
    }

    public float getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(float duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    @Override
    public String toString() {
        return "Computadoras{" + "modelo=" + modelo + ", NumSerie=" + NumSerie + ", CapHDD=" + CapHDD + ", tamPantalla=" + tamPantalla + ", tecladoNum=" + tecladoNum + ", TipoProcesador=" + TipoProcesador + ", tarjetaGrafica=" + tarjetaGrafica + ", sistemaOperativo=" + sistemaOperativo + ", tiempoFabricacion=" + tiempoFabricacion + ", capBateria=" + capBateria +" miliamperes"+ ", duracionBateria=" + duracionBateria + '}';
    }
    
    
}
