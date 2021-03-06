package com.demoCouchbase.Couchbase.Repository;

import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.DynamicProxyable;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.data.couchbase.repository.Scope;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.demoCouchbase.Couchbase.Entity.Sinhvien;

@Repository()
@Scope("_default")
@Collection("_default")
@ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
public interface SinhvienRepository extends CouchbaseRepository<Sinhvien, String>, DynamicProxyable<SinhvienRepository> {

}
