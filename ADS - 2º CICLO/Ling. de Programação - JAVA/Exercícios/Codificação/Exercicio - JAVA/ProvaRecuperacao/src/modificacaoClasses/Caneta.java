package modificacaoClasses;
// classe criada utilizando o Getting / Setting

public class Caneta{
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;
    // atributo

    public Caneta ( String modelo, String cor, double ponta, int carga, boolean tampada ){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
    // constructor com parâmetros

    public Caneta(){}
    // definição do construtor vazio

    // GETTERS //
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public double getPonta(){
        return ponta;
    }
    public int getCarga(){
        return carga;
    }
    public boolean isTampada(){
        return tampada;
    }

    // SETTERS //
    public void setModelo( String modelo ){
        this.modelo = modelo;
    }
    public void setCor( String cor ) {
        this.cor = cor;
    }
    public void setPonta ( double ponta ){
        this.ponta = ponta;
    }
    public void setCarga ( int carga ) {
        this.carga = carga;
    }
    public void setTampada ( boolean tampada ){
        this.tampada = tampada;
    }

    // MÉTODOS //
    public void Rabiscar() {
        if ( this.tampada == true ){
            System.out.println("Proibido rabiscar");
        } else {
            System.out.print("Pode rabiscar");
        }
    }
    // verifica se pode rabiscar

    public void Tampar(){
        this.tampada = true;
    }
    public void Destampar(){
        this.tampada = false;
    }

    // verifica se a tampa está destamapada ou não
    public void VerificarTampa() {
        if ( this.tampada ) {
            Destampar();
        } else {
            Tampar();
        }

    }

}