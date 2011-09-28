package nl.natuurmonumenten.activiteiten;

import java.io.Serializable;

public class ExtraInfo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String omschrijving;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getOmschrijving() {
        return omschrijving;
    }
    
}
