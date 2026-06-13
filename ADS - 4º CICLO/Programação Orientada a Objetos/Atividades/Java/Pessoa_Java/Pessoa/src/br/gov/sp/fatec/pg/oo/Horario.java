package br.gov.sp.fatec.pg.oo;

public class Horario {
    private Integer horas;
    private Integer minutos;
    private Integer segundos;

    public Horario(){
       this.horas = 0; this.minutos = 0; this.segundos = 0;
    }

    public Horario( Integer horas , Integer minutos , Integer segundos ){
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    
    public Integer getHoras(){ return this.horas; }

    public void setHoras( Integer horas ){
        if ( horas >= 0 && horas <24 ){
            this.horas = horas; 
        } else {
            this.horas = 0; 
        }
    } 

    public Integer getMinutos(){ return this.minutos; }

    public void setMinutos( Integer minutos ){
        if ( minutos >= 0 && minutos < 60 ){
            this.minutos = minutos; 
        } else {
            this.minutos = 0;
        }
    }

    public Integer getSegundos(){ return this.segundos; }

    public void setSegundos( Integer segundos ){
        if ( segundos >= 0 && segundos < 60 ){
            this.segundos = segundos; 
        } else {
            this.segundos = 0;
        }  
    }

    public Boolean getIsManana(){
        if ( getHoras() >= 6 || getHoras() < 12 ) { 
            return true;
        } else {
            return false;
        }
    }

    public Boolean getIsTarde(){
        if ( getHoras() >= 12 || getHoras() < 18 ){
            return true;
        } else {
            return false;
        }
    }
   
    public Boolean getIsNoche(){
        if ( getHoras() >= 18 || getHoras() < 24 ){
            return true;
        } else {
            return false;
        }
    }

    public Boolean getIsMadrugada(){
        if ( getHoras() >= 0 || getHoras() < 6 ){
            return true;
        } else {
            return false;
        }
    }

    public String getHorario(){
        String horario = "";

        if ( getHoras() <= 10 ){
            horario += "0";
            horario += getHoras() + ":";
        }

        if ( getMinutos() < 10 ){
            horario += "0";
            horario += getMinutos() + ":";
        }

        if ( getSegundos() < 10 ){
            horario += "0";
            horario += getSegundos();
        }

        return data;
    }
}