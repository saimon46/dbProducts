package it.uniroma3.db.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	@Temporal (TemporalType.DATE)
	private Date creationTime;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "orders")
	private List<OrderLine> orderLines;
	
	public Order () {
		
	}

    public Order (Date creationTime) {
    	this.creationTime = creationTime;
    }
	
	// ***** Getters and setters *****
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
}
