package com.carplate.carplate.repository;

import com.carplate.carplate.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment,Long> {


}
