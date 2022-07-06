package ch4ex2;

import ch4ex2.proxy.EmailNotificationProxy;
import ch4ex2.repository.DBCommentRepo;
import ch4ex2.service.CommentService;

public class Main {
    public static void main (String[] args) {
        var commentRepo = new DBCommentRepo();
        var notificationProxy = new EmailNotificationProxy();
        var service = new CommentService(commentRepo, notificationProxy);
        var comment = new Comment();
        comment.setText("Helloo");
        service.publishComment(comment);
    }
}
