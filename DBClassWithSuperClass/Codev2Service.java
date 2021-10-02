package com.heinzelman.connector.keys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Codev2Service extends KeyILevService {

    @Autowired
    protected Codev2Repo codev2Repo;

    public Codev2Service( KeyILevRepo keyILevRepo ) {
        super(keyILevRepo);
    }



}
