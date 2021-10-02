package com.heinzelman.connector.keys;

import javax.persistence.Table;

@Table(name = "code_second")
public class Codev2 extends KeyILev {

    public Codev2( String myName ) {
        super();
        setName( myName );
    }

    @Override
    public void setName( String name ) {
        super.setName( name.trim().toUpperCase() );
    }



}
