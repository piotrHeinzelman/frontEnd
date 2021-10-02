package com.heinzelman.connector.keys;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
public abstract class KeyILev implements Serializable {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    protected Long id;

    @Column ( name = "name", unique=true )
    protected String name;

    public KeyILev() {}
    public KeyILev( String name ) { this.name = name; }
    public void setName( String name ) { this.name = name; }

    @Override
    public String toString() {
        return "KeyILev{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyILev keyILev = (KeyILev) o;
        return Objects.equals(id, keyILev.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
