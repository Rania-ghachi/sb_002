package dz.ibnrochd.master14.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
//@Entity
//@Table(schema = "cabinet", name = "rendez_vous")
public class RendezVous implements Serializable {

	private static final long serialVersionUID = -7275578697948165342L;

	//@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Column(name = "date_rdv", nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Date dateRdv;

    //@ManyToOne()
    //@JoinColumn(name = "id_patient", nullable = false)
    private Patient patient;

    //////////////////////////////////////////////
    
    public RendezVous() {
		
	}
	public RendezVous(int id, Date dateRdv, Patient patient) {
		super();
		this.id = id;
		this.dateRdv = dateRdv;
		this.patient = patient;
	}
    
}
