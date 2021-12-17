package br.com.carlosfernandes.repository.mongodb.bedroom;

import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomFilter;
import br.com.carlosfernandes.core.ports.driven.repository.bedroom.FindAllBedroomByFilterPort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.query.Criteria.*;

@Service
public record FindAllBedroomByFilter(
        MongoTemplate database
) implements FindAllBedroomByFilterPort {

    @Override
    public <T> List<T> apply(BedroomFilter filter, Class<T> projection) {
        var operations = new ArrayList<AggregationOperation>();
        if (filter.getStatus() != null){
            operations.add(match(where("status").is(filter.getStatus())));
        }

        if (filter.getNumber() != null && !filter.getNumber().isEmpty() ){
            operations.add(match(where("number").is(filter.getNumber())));
        }

        var aggregation = operations.isEmpty()
                ? newAggregation()
                : newAggregation(operations);

        return database.aggregate(aggregation, "bedroom", projection).getMappedResults();
    }
}
