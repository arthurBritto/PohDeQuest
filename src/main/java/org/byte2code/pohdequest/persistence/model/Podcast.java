package org.byte2code.pohdequest.persistence.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="podcast")
public class Podcast extends AbstractModel{

    private String title;

    @ManyToMany(
            mappedBy = "user"
    )
    private Set<User> users;

}
