package com.douane.repository;

import com.douane.entite.Materiel;
import com.douane.entite.MaterielNouv;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by hasina on 11/11/17.
 */
public interface MaterielNouvRepository extends CrudRepository<MaterielNouv, Long> {
  public List<MaterielNouv> findByValidation(boolean validation);
}
