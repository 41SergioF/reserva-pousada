package br.com.carlosfernandes.core.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Bedroom {
	
	private String id;
	private String number;
	private String description;
	
	private Status status;
	
	private List<Reserve> reserves = new ArrayList<>();

	public Bedroom(String id, String number, String description, Status status, List<Reserve> reserves) {
		this.id = id;
		this.number = number;
		this.description = description;
		this.status = status;
		this.reserves = reserves;
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
		Bedroom other = (Bedroom) obj;
		return Objects.equals(id, other.id);
	}
	

}
