package ch4ex2.proxy;

import ch4ex2.Comment;

public class EmailNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email :" + comment.getText());
    }
}
