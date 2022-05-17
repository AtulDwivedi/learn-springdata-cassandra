package com.atuldwivedi.learn.springdatacassandra.book;

import org.springframework.data.cassandra.repository.CassandraRepository;

/**
 * @author Atul Dwivedi
 */
public interface BookRepository extends CassandraRepository<Book, String> {
}
