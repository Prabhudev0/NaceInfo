package com.dbCLM.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Naces")
public class Nace {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long Level;
	private char Code;
	private String Parent;
	private String Description;
	@Column(name="This_item_includes")
	private String ThisItemIncludes;
	@Column(name="This_item_also_includes")
	private String ThisItemAlsoIncludes;
	private String Rulings;
	@Column(name="This_item_excludes")
	private String ThisItemExcludes;
	@Column(name="Reference_to_ISIC_Rev.4")
	private String ReferenceToISIC;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLevel() {
		return Level;
	}

	public void setLevel(Long level) {
		Level = level;
	}

	public char getCode() {
		return Code;
	}

	public void setCode(char code) {
		Code = code;
	}

	public String getParent() {
		return Parent;
	}

	public void setParent(String parent) {
		Parent = parent;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getThisItemIncludes() {
		return ThisItemIncludes;
	}

	public void setThisItemIncludes(String thisItemIncludes) {
		ThisItemIncludes = thisItemIncludes;
	}

	public String getThisItemAlsoIncludes() {
		return ThisItemAlsoIncludes;
	}

	public void setThisItemAlsoIncludes(String thisItemAlsoIncludes) {
		ThisItemAlsoIncludes = thisItemAlsoIncludes;
	}

	public String getRulings() {
		return Rulings;
	}

	public void setRulings(String rulings) {
		Rulings = rulings;
	}

	public String getThisItemExcludes() {
		return ThisItemExcludes;
	}

	public void setThisItemExcludes(String thisItemExcludes) {
		ThisItemExcludes = thisItemExcludes;
	}

	public String getReferenceToISIC() {
		return ReferenceToISIC;
	}

	public void setReferenceToISIC(String referenceToISIC) {
		ReferenceToISIC = referenceToISIC;
	}
	
	
	
}
