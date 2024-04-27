package dz.ibnrochd.master14.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Data
//@Entity
//@Table(schema = "cabinet", name = "consultation")
public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;
	//@Id
	private Long id;
	//@OneToMany(mappedBy = "consultation")
	private List<LigneConsultation> lignesConsultation;

	//@ManyToOne()
	//@JoinColumn(name = "id_patient")
	private Patient patient;

}
