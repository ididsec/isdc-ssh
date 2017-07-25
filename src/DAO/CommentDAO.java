package DAO;

import Entity.Comment;

/**
 * Copyright (c) 2017 Peter Mao. All rights reserved.
 * Created by mao on 17-7-22.
 */
public interface CommentDAO {

    Comment getCommentById(int commentId);

    void addComment(Comment comment);

    boolean delComment(int commentId);

}