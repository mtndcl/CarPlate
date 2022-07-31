package com.carplate.carplate.controller;


import com.carplate.carplate.Entity.Comment;
import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.result.Result;
import com.carplate.carplate.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/comments")
public class CommentController {


    private  final CommentService commnetService;


    @Autowired
    public CommentController(CommentService commnetService){

        this.commnetService = commnetService;
    }

    @PostMapping("/adduser")
    public Result addComment(@RequestBody Comment comment){

        return  commnetService.addComment(comment);
    }
}
