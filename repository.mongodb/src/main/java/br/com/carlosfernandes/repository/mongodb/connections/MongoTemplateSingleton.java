package br.com.carlosfernandes.repository.mongodb.connections;

import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoTemplateSingleton {

    private MongoTemplateSingleton() {}

    public static final MongoTemplate operations;

    static {
        // Esse trexo cria a conecxão com o bando de dados
        var client = MongoClients.create("mongodb://localhost:27017/reserva_mongo");
        // Chama o banco de dados
        operations = new MongoTemplate(client, "reserva_mongo");
    }

}
