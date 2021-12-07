package br.com.carlosfernandes.core.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Bedroom {
	
	private String id;
	private String number;
	private String description;
	
	private Status status;

	private List<ObjectId> reserves = new ArrayList<>();

}
