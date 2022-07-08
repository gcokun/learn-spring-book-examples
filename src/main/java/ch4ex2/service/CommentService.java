package ch4ex2.service;

import ch4ex2.Comment;
import ch4ex2.CommentProcessor;
import ch4ex2.proxy.CommentNotificationProxy;
import ch4ex2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    public void processComment(Comment comment) {
        CommentProcessor processor = new CommentProcessor();
        processor.setComment(comment);
        processor.attachAuthor("Giz");
        System.out.println("Comment processed : " + processor.getComment());
    }
}
