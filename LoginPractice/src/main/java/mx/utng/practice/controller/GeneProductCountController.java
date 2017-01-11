package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.GeneProductCount;

import mx.utng.practice.repository.GeneProductCountRepository;


@Named
@ViewScoped
public class GeneProductCountController {
	
	@Autowired
	private GeneProductCountRepository geneProductCountRepository;
	private GeneProductCount geneProductCount=new GeneProductCount();
	private boolean editMode=false;
	private List<GeneProductCount> geneProductCounts;
	@PostConstruct
	public void init(){
		setGeneProductCounts(geneProductCountRepository.findAll());
	}
	
	public List<GeneProductCount> getGeneProductCounts() {
		return geneProductCounts;
	}
	
	public void setGeneProductCounts(List<GeneProductCount> geneProductCounts) {
		this.geneProductCounts = geneProductCounts;
	}


	public void save(){
		geneProductCountRepository.save(geneProductCount);
		if(!editMode){
			getGeneProductCounts().add(geneProductCount);
		}
		geneProductCount=new GeneProductCount();
		setEditMode(false);
	}
	
	public void delete(GeneProductCount geneProductCount){
		geneProductCountRepository.delete(geneProductCount);
		geneProductCounts.remove(geneProductCount);
	}
	
	public void update(GeneProductCount geneProductCount){
		setGeneProductCount(geneProductCount);
		setEditMode(true);
	}
	public void cancel(){
		geneProductCount=new GeneProductCount();
		setEditMode(false);
	}
	public GeneProductCount getGeneProductCount() {
		return geneProductCount;
	}
	
	public void setGeneProductCount(GeneProductCount geneProductCount) {
		this.geneProductCount = geneProductCount;
	}
	
	public boolean isEditMode() {
		return editMode;
	}
	
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
	
}