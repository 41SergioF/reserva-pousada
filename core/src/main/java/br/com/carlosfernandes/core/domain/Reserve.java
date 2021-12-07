package br.com.carlosfernandes.core.domain;

import java.util.Date;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
public class Reserve {

	private String id;
	private Date start;
	private Date end;
	
	private ObjectId userId; //Proprietário
	private ObjectId bedroomId; //Quarto
	
}
