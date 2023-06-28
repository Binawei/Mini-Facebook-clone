package com.facebook.facebook.services;

import com.facebook.facebook.entities.Commentfac;
import com.facebook.facebook.entities.Post;
import com.facebook.facebook.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class CommentServicesimpl {
    private final CommentRepository commentRepository;

    public CommentServicesimpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

}
