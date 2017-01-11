package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="geneProductCount")
public class GeneProductCount {
	@Id @GeneratedValue
	private Long termId;
	private String code;
	private String speciedbName;
	private String species;
	private String productCount;
	
	

	
	
	
	public GeneProductCount(String code, String speciedbName, String species, String productCount) {
		super();
		this.code = code;
		this.speciedbName = speciedbName;
		this.species= species;
		this.productCount= productCount;
	}
	 
	public GeneProductCount() {
	this("","","","");
	}

	public Long getTermId() {
		return termId;
	}
	
	public void setTermId(Long termId) {
		this.termId = termId;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getSpeciedbName() {
		return speciedbName;
	}

	public void setSpeciedbName(String speciedbName) {
		this.speciedbName = speciedbName;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	

}
