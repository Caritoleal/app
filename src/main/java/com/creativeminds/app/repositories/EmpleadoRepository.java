package com.creativeminds.app.repositories;

import com.creativeminds.app.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmpleadoRepository  extends CrudRepository<Empleado, Integer> {
    @Query(value="SELECT * FROM empleado where empresa_id= ?1", nativeQuery=true)

    //@Query(value="SELECT * from movimiento_dinero where empleado_1 in(select id from empleado where empresa_id= ?1)", nativeQuery=true)

    public abstract ArrayList<Empleado> findByEmpresa(Integer id);
}
