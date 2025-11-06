package Projeto_Java.Fridge.Controller;
import Projeto_Java.Fridge.Model.Comida;
import Projeto_Java.Fridge.Service.ServiceComida;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/comida" )
public class ControllerComida {
    private final ServiceComida serviceComida;

    public ControllerComida( ServiceComida serviceComida ){
        this.serviceComida = serviceComida;
    }

    @GetMapping
    public List<Comida> getAll(){ return serviceComida.getAll(); }

    @PostMapping
    public Comida creat(@RequestBody Comida comida ){ return serviceComida.save( comida ) ; }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ serviceComida.delete( id ); }
}

/*
   Arquitetura por Camadas ( M.V.C )

   ** CONTROLLER
    -> Controla o fluxo de requisitos, mapeando as rotas de API ( URL's )
    através do ponteiro que direciona a interação com o sistema

   ** CONTEÚDO
    - RestController
     -> Anotação para declarar a classe como um Controller REST, informando
     ao Spring que a classe ldia com requisições HTTP ( Hypertext Transfer Protocol - Protocolo de Comunicação  )

    - RequestMapping
     -> Anotação para mapear as rotas, definindo o caminho base para todos os endpoints dentro do controller

    - RequestBody
     -> Anotação que pega o objeto enviado no corpor da requisição HTTPS ( JSON ) para que o Spring utilize

    - Injeção de Dependências
     -> Mecanismo do Spring que conecta as camadas da aplicação ( Controller | Service )
    permitindo que um componente utilize as regras de outro sem ter que criá-los manualmente.

    - Postman
     -> Ferramenta utilizada para testar as rodas da API, permitindo eviar requisições
     ( POST | GET | DELETE | PUT )

     - Métodos - GET
     -> GetMapping ( Read )
       - Retorna uma lista de todas as comidas cadastradas

     - Métodos - POST
     -> PostMapping ( Creat )
       - Usado para criar / enviar novas informações para o servidor através do B.D ( banco de dados )

     - Métodos - DELETE
     -> DeleteMapping ( Delete )
       - Remove um item do B.D usando o ID do item, comunicado pela URL { id }
*/