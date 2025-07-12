
package com.wecreateproblems.onlinelibrary.repository;

import com.wecreateproblems.onlinelibrary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
