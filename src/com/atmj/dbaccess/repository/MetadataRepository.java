package com.atmj.dbaccess.repository;

import org.springframework.data.repository.CrudRepository;

import com.atmj.dbaccess.entities.MetadataEntity;

public interface MetadataRepository extends CrudRepository<MetadataEntity, String> {

}
