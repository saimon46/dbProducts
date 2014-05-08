package it.uniroma3.db.model;

import javax.persistence.*;

@Entity
public class OrderLine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private float unitPrice;
	
	@Column
	private int quantity;
	
	@ManyToOne
	private Order orders;
	
	@OneToOne
	private Product product;
	
	public OrderLine() {
		
	}

    public OrderLine(float unitPrice, int quantity) {
    	this.unitPrice = unitPrice;
    	this.quantity = quantity;
    }

	// ***** Getters and setters *****
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
