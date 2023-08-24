package com.springboot.Practice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Mobile {
	
	@Id
	private int id;
	private String mobilename;
	private String prize;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public Mobile(int id, String mobilename, String prize) {
		super();
		this.id = id;
		this.mobilename = mobilename;
		this.prize = prize;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Mobile mobile = (Mobile) o;
		return id == mobile.id && Objects.equals(mobilename, mobile.mobilename) && Objects.equals(prize, mobile.prize);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mobilename, prize);
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobilename=" + mobilename + ", prize=" + prize + "]";
	}
	
	
	

}
