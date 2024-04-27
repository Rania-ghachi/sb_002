package dz.ibnrochd.master14.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter

//@Entity
//@Table(schema = "cabinet", name = "traitement")
public class Traitement implements Serializable {

	private static final long serialVersionUID = 8248365590951840055L;
	//@Id
	private Long id;

	//@OneToMany(mappedBy = "traitement")
	private List<LigneConsultation> lignesConsultation;
}
