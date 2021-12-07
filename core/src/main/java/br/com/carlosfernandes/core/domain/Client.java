package br.com.carlosfernandes.core.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Client {

	private String id;
	private String name;
	private String email;
	private String password;
	
}
