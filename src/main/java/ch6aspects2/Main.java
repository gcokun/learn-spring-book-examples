package ch6aspects2;

import ch6aspects2.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("I'd like to annotate stuff!");
        comment.setAuthor("Giz");
        service.publishComment(comment);
        service.editComment(comment);
        service.deleteComment(comment);

        Comment comment2 = new Comment();
        comment2.setText("I shouldn't be here!");
        comment2.setAuthor("Cas");
        service.publishComment(comment2);
        service.editComment(comment2);
    }
}
