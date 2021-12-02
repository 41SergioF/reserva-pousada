package br.com.carlosfernandes.repository.mongodb.connections;

import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoTemplateSingleton {

    /// Impede que a classe seja instanciada
    private MongoTemplateSingleton() {}

    /* Esse variárel se torna uma constante que salva um instancia de conexão
     * com o Banco de dados */
    public static final MongoTemplate operations;

    /// A conexão é feita nas linhas abaixo
    static {
        // Esse trexo cria a conecxão com o bando de dados
        var client = MongoClients.create("mongodb://localhost:27017/reserva_mongo");
        // Chama o banco de dados
        operations = new MongoTemplate(client, "reserva_mongo");
    }

}
