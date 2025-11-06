package Projeto_Java.Fridge.Service;
import Projeto_Java.Fridge.Model.Comida;
import Projeto_Java.Fridge.Repository.RepositoryComida;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceComida {

    private final RepositoryComida repositoryComida;

    public ServiceComida( RepositoryComida repositoryComida ){
        this.repositoryComida = repositoryComida;
    }

    public List<Comida> getAll(){ return repositoryComida.findAll(); }
    public Comida save( Comida comida ){ return repositoryComida.save( comida ); }
    public void delete( Long id ){ repositoryComida.deleteById( id ); }
}

/*
    - SERVICE
     -> É a camada responsável pela aplicação de negócio, implementando a lógica e aplicação

    - Métodos - GetAll()
    -> GetAll()
     -> Retorna todos os dados, chamando o métodos findAll() do Repository

    - Métodos - GetSave()
    -> GetSave()
     -> Recebe um objeto ( comida ) e chama o métodos save() do Repository para persistir o dado

    - Métodos - GetDelete()
    -> GetDelete()
     -> Recebe o id e chama o métodos deleteById() do repository
*/
