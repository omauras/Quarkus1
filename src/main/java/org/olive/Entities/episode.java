package org.olive.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class episode extends PanacheEntity {

    public String title;

    public String description;

}
