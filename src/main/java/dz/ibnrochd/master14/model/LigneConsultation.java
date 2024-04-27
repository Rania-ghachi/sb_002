package dz.ibnrochd.master14.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
//@Entity
//@Table(schema = "cabinet", name = "ligne_consultation")
public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;
	//@Id
	private Long id;
	//@ManyToOne
	//@JoinColumn(name = "id_consultation")
	private Consultation consultation;
	//@ManyToOne
	//@JoinColumn(name = "traitement_id")
	private Traitement traitement;
}
