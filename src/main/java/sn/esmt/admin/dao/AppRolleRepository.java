package sn.esmt.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.admin.entities.AppRolleEntity;

@Repository
public interface AppRolleRepository extends JpaRepository<AppRolleEntity,Integer> {

    AppRolleEntity findById(int id);

}
