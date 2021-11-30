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
public class Client {

	private String id;
	private String name;
	private String email;

	private List<Reserve> reserves = new ArrayList<>();

	public Client(String id, String name, String email, List<Reserve> reserves) {
		this.id = id;
		this.name = name;
		this.email = email;
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
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
