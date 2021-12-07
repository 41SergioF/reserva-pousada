package br.com.carlosfernandes.core.domain;

import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Admin {

	private String id;
	private String email;
	private String password;
	
}
