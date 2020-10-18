package com.example.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}
