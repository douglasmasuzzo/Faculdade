package modificacaoClasses;

public class Teste_Caneta {
    public String modelo;
    public String color;
    private double ponta;
    // atributos

    public Teste_Caneta( String modelo, String color, double ponta ){
        this.modelo = modelo;
        this.color = color;
        this.ponta = ponta;
    }

    public Teste_Caneta(){}
    // constructor com parâmetros + vazio

    // GETTERS E SETTERS //
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public double getPonto(){
        return ponta;
    }

    public void setModelo ( String modelo ){
        this.modelo = modelo;
    }
    public void setColor ( String color ){
        this.color = color;
    }
    public void setPonta ( double ponta ){
        this.ponta = ponta;
    }

}

/*
    public String getModelo()
        return this.modelo;

    public void setModelo( String modelo )
        this.modelo = modelo

    public String getColor()
        return this.color

    public void setColor( String color )
        this.color = color

    public double getPonto()
        return this.ponto;

    public void setPonto( double ponto )
        this.ponto = ponto
 */