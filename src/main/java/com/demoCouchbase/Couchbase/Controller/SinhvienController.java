package com.demoCouchbase.Couchbase.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoCouchbase.Couchbase.Entity.Sinhvien;
import com.demoCouchbase.Couchbase.service.SinhvienService;

@RestController
@RequestMapping("/sv")
public class SinhvienController {

	private SinhvienService sinhvienService;

	public SinhvienController(SinhvienService sinhvienService) {
		this.sinhvienService = sinhvienService;
	}

	@GetMapping
	public List<Sinhvien> findAll() {
		return sinhvienService.findAllList();
	}

	@GetMapping("/{id}")
	public Optional<Sinhvien> findOneById(@PathVariable("id") String id) {		
		return sinhvienService.findById(id);
	}

	@PostMapping
	public Sinhvien Insert(@RequestBody Sinhvien sinhvien) {		
		return sinhvienService.insert(sinhvien);
	}

	@PutMapping
	public Sinhvien Update(@RequestBody Sinhvien sinhvien) {
		return sinhvienService.update(sinhvien);
	}

	@DeleteMapping("/{id}")
	public String Delete(@PathVariable("id") String id) {
		try {

			sinhvienService.delete(id);
			return "Delete successful";
		} catch (Exception e) {
			return "Delete Failed By: " + e;
		}
	}
}
