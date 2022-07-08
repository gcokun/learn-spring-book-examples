package ch4ex2;

import ch4ex2.proxy.EmailNotificationProxy;
import ch4ex2.repository.DBCommentRepo;
import ch4ex2.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);
        var comment = new Comment();
        comment.setText("Helloo");
        service.publishComment(comment);
        System.out.println(service.getClass());
    }
}
