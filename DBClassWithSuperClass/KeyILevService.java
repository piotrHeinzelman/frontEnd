package com.heinzelman.connector.keys;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public abstract class KeyILevService implements KeyILevRepo {

    @Autowired
    protected final KeyILevRepo keyILevRepo;

    public KeyILevService( KeyILevRepo keyILevRepo ){
        this.keyILevRepo = keyILevRepo;
    }



    @Override
    public Optional<KeyILev> findByName( String name ) {
        return keyILevRepo.findByName( name );
    }

    @Override
    public <S extends KeyILev> S save(S entity) {
        return keyILevRepo.save( entity );
    }

    @Override
    public <S extends KeyILev> Iterable<S> saveAll(Iterable<S> entities) {
        return keyILevRepo.saveAll( entities );
    }

    @Override
    public Optional<KeyILev> findById(Long aLong) {
        return keyILevRepo.findById( aLong );
    }

    @Override
    public boolean existsById(Long aLong) {
        return keyILevRepo.existsById( aLong );
    }

    @Override
    public Iterable<KeyILev> findAll() {
        return keyILevRepo.findAll();
    }

    @Override
    public Iterable<KeyILev> findAllById(Iterable<Long> longs) {
        return keyILevRepo.findAllById( longs );
    }

    @Override
    public long count() {
        return keyILevRepo.count();
    }

    @Override
    public void deleteById(Long aLong) {
        keyILevRepo.deleteById( aLong );
    }

    @Override
    public void delete(KeyILev entity) {
        keyILevRepo.delete( entity );
    }

    @Override
    public void deleteAll(Iterable<? extends KeyILev> entities) {
        keyILevRepo.deleteAll( entities );
    }

    @Override
    public void deleteAll() {
        keyILevRepo.deleteAll();
    }
}
