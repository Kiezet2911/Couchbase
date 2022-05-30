package com.demoCouchbase.Couchbase.service;

import java.util.List;
import java.util.Optional;

import com.demoCouchbase.Couchbase.Entity.Sinhvien;

public interface SinhvienService {

	List<Sinhvien> findAllList();

	Optional<Sinhvien> findById(String id);

	Sinhvien insert(Sinhvien sinhvien);

	Sinhvien update(Sinhvien sinhvien);

	void delete(String id);

}
