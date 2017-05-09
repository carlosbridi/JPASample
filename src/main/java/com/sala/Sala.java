package com.sala;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.utils.EntityId;

@Entity
@Table(name = "sala")
@SequenceGenerator(name="sala_seq", sequenceName = "sala_seq", 
allocationSize = 1, initialValue = 1)
public class Sala implements EntityId<Long> {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sala_seq")
	@Id
	private Long id;
	@Column(name = "codigosala")
	private String codigoSala;
	@Column(name = "nomesala")
	private String nomeSala;
	
	public Sala(){
	}
	
	public Long getId() {
		return id;
	}

	public String getCodigoSala() {
		return codigoSala;
	}
 
	public void setCodigoSala(String codigoSala) {
		this.codigoSala = codigoSala;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
