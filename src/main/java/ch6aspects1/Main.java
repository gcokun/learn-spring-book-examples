package ch6aspects1;

import ch6aspects1.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment = new Comment();
        comment.setText("Heyya");
        var service = context.getBean(CommentService.class);
        String result = service.publishComment(comment);
        System.out.println(result);
    }
}
