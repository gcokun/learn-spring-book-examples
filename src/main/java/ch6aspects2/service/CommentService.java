package ch6aspects2.service;

import ch6aspects2.Comment;
import ch6aspects2.aspects.ToLog;
import ch6aspects2.aspects.ToValidate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToValidate
    public String publishComment(Comment comment) {
        logger.info("Publishing comment : " + comment.getText());
        return "Success";
    }


    @ToLog
    @ToValidate
    public String editComment(Comment comment) {
        logger.info("Editing comment : " + comment.getText());
        return "Success";
    }

    public String deleteComment(Comment comment) {
        logger.info("Deleting comment : " + comment.getText());
        return "Success";
    }
}
