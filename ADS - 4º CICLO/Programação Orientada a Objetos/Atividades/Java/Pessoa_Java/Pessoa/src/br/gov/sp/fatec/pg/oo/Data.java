package br.gov.sp.fatec.pg.oo;

public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Integer getDia(){ return this.dia; }  

    public void setDia( Integer dia ){
        if ( dia < 1 ){
            this.dia = 1;
        } else if ( dia > 31 ) {
            this.dia = 31; 
        } else {
            this.dia = dia;
        }
    }

    public Integer getMes(){ return this.mes; }

    public void setMes( Integer mes ) {
        if ( mes < 1 ){
            this.mes = 1;
        } else if ( mes > 12 ){
            this.mes = 12;
        } else {
            this.mes = mes;
        }
    }

    public Integer getAno(){ return this.ano; }

    public void setAno( Integer ano ){
        if ( ano >= 1950 ){
            this.ano = ano; 
        } else {
            this.ano = 1950;
        }
    }

    public Boolean getIsBissexto(){
        if ( getAno() % 4 == 0 || getAno() % 400 == 0 && ( getAno() % 100 != 0  ) ){
            return true;
        } else {
            return false;
        }
    }

    public String getData(){
        String data = "";

        if ( getDia() <= 10 ){
            data += "0";
            data += getDia() + "/";
        }
        
        if ( getMes() < 10 ) {
            data += "0";
            data += getMes() + "/";
            data += getAno();
        }

        return data;
    }
}
