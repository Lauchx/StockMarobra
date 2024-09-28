/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stock.Model.Entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author retam
 */
@Entity
@Table(name = "stock")
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    int inbound;
    int outbond;
    int currentQuantity;

    public Stock() {
    }

    public Stock(int currentQuantity) {
        this.inbound = 0;
        this.outbond = 0;
        this.currentQuantity = currentQuantity;
    }
    

    public Long getId() {
        return id;
    }

    public int getInbound() {
        return inbound;
    }

    public int getOutbond() {
        return outbond;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInbound(int inbound) {
        this.inbound = inbound;
    }

    public void setOutbond(int outbond) {
        this.outbond = outbond;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + this.inbound;
        hash = 71 * hash + this.outbond;
        hash = 71 * hash + this.currentQuantity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stock other = (Stock) obj;
        if (this.inbound != other.inbound) {
            return false;
        }
        if (this.outbond != other.outbond) {
            return false;
        }
        if (this.currentQuantity != other.currentQuantity) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return " |Cantidad actual: " + this.currentQuantity + " |Entrante:" + this.inbound + " |Saliente:" + this.outbond;
    }
}
