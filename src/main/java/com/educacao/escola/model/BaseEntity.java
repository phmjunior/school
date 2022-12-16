package com.educacao.escola.model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseEntity<ID extends Serializable> implements Serializable {
		
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;
	
    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
    
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			
		BaseEntity<?> other = (BaseEntity<?>) obj;
		
		if (getId() == null) {
			return false;
		} 
		else if (!getId().equals(other.getId()))
			return false;
		
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
}