package Projeto_Java.Fridge.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table( name = "Controle_Comida")
public class Comida {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )

    private Long id;
    private String prato;
    private Integer quantidade;
    private LocalDate validade;
    private double preco;

    public Comida(){}

    public Comida(Long id, String prato, Integer quantidade, LocalDate validade, double preco ){
        this.id = id;
        this.prato = prato;
        this.quantidade = quantidade;
        this.validade = validade;
        this.preco = preco;
    }

    public Long getId(){ return id; }
    public String getPrato(){ return prato; }
    public Integer getQuantidade(){ return quantidade; }
    public LocalDate getValidade(){ return validade; }
    public double getPreço(){ return preco; }

    public void setId( Long id ){ this.id = id; }
    public void setPrato( String prato ){ this.prato = prato; }
    public void setQuantidade( Integer quantidade ){ this.quantidade = quantidade; }
    public void setValidade( LocalDate validade ){ this.validade = validade; }
    public void setPreco( double preco ) { this.preco = preco; }
}

/*
 Arquitetura de Camadas - M.V.C ( Model / View / Controller )

  Model -> Entity e Table
  -> Define as estruturas dos dados ( objetos / entidades ) representada
  por uma tabela no banco de dados, com os seus atributos.

*/

