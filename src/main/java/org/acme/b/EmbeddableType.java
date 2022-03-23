package org.acme.b;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmbeddableType {

    @Column
    private String field;

    public String getField() {
        return field;
    }

    public void setField(final String field) {
        this.field = field;
    }
}
