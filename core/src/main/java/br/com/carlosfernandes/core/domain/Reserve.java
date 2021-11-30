package br.com.carlosfernandes.core.domain;

import java.util.Date;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Reserve {

	private String id;
	private Date start;
	private Date end;
	
	private Client owner;	//Proprietário
	private Bedroom bedroom;//Quarto

	public Reserve(String id, Date start, Date end, Client owner, Bedroom bedroom) {
		this.id = id;
		this.start = start;
		this.end = end;
		this.owner = owner;
		this.bedroom = bedroom;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserve other = (Reserve) obj;
		return Objects.equals(id, other.id);
	}
	
}
