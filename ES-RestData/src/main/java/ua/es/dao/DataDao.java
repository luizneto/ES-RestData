package ua.es.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.es.model.DataModel;


@Repository
public interface DataDao extends JpaRepository<DataModel, Integer> {

}
