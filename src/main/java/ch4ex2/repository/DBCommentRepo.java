package ch4ex2.repository;

import ch4ex2.Comment;

public class DBCommentRepo implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Writing to Database :" + comment.getText());
    }
}
