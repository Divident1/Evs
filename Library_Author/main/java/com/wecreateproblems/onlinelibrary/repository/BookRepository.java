
package com.wecreateproblems.onlinelibrary.repository;

import com.wecreateproblems.onlinelibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
