package com.example.demo.dto.comment;

import com.example.demo.entity.ReplyEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReplyResponseDto {

    private Long replyId;
    private String userName;
    private String tag;
    private String comment;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private LocalDateTime modifiedDate;
    private Boolean updated;
    public ReplyResponseDto(ReplyEntity reply){
        replyId = reply.getId();
        userName =reply.getUserName();
        tag = reply.getTag();
        comment = reply.getComment();
        modifiedDate = reply.getCreatedDate();
        updated = reply.getUpdated();
    }
}
