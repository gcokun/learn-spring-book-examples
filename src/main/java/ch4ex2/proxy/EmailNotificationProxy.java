package ch4ex2.proxy;

import ch4ex2.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email :" + comment.getText());
    }
}
