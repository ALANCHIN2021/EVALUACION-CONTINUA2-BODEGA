package com.idat.EC2AlanEscumpaniBodega.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2AlanEscumpaniBodega.Modelo.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Integer> {
	
	

}
