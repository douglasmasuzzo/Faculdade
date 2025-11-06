package Projeto_Java.Fridge.Repository;
import Projeto_Java.Fridge.Model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RepositoryComida extends JpaRepository< Comida, Long > {
}

/*
    Arquitetura por Camadas ( M.V.C )

    ** REPOSITORY
     -> É a camada que conecta ao banco de dados e executa as operações de persistência

    - Interface
     -> a classe RepositoryComida deve ser uma Interface, não uma classe

    - Extends JpaRepository
     -> O repository herda de JpaRepository, que é uma biblioteca do SpringData JPA

    - Camadas de persistências
     -> é conectado com o banco de dados para salvar | buscar | deletar dados.
      O JpaRepository fornece seus próprios métodos ( findAll | save | deleteById )

    - Métodos Prontos
    -> já fornece os métodos básicos de CRUD prontos.
*/