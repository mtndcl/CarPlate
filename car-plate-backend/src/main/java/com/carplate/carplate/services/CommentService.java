package com.carplate.carplate.services;


import com.carplate.carplate.Entity.Comment;
import com.carplate.carplate.repository.CommentRepository;
import com.carplate.carplate.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {


    private  final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository){
        this.commentRepository=commentRepository;

    }

    public Result addComment(Comment comment) {


        commentRepository.saveAndFlush(comment);


        return  new Result();

    }
}
