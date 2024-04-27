package dz.ibnrochd.master14.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter

//@Entity
//@Table(schema = "cabinet", name = "patient")
public class Patient implements Serializable {
	private static final long serialVersionUID = -3415388341943341473L;
	//@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@Column(name = "nom", nullable = false, length = 255)
    private String nom;
    //@Column(name = "prenom", nullable = false, length = 255)
    private String prenom;
    //@Column(name = "sexe", nullable = false, length = 1)
    private String sexe;
    //@Column(name = "date_naissance", nullable = false)
    //@Temporal(TemporalType.DATE)
    private Date dateNaissance;
   // @Column(name = "numero_telephone", nullable = false, length = 255)
    private String numeroTelephone;
   // @Column(name = "adresse", nullable = false, length = 255)
    private String adresse;
    //@OneToMany(mappedBy = "patient")
    private List<Consultation> consultations = new ArrayList<>();
    //@OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVous = new ArrayList<>();
    /////////////////////////////////////////////////////////

    public Patient() {
	}

	public Patient(int id, String nom, String prenom, String sexe, Date dateNaissance, String numeroTelephone,
			String adresse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.numeroTelephone = numeroTelephone;
		this.adresse = adresse;
	}

}
