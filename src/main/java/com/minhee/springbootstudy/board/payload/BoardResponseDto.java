package com.minhee.springbootstudy.board.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("boardResponseDto")
@NoArgsConstructor
@Getter
@ToString
public class BoardResponseDto {

    private Long boardSeq;

    private Long userSeq;

    private String title;

    private String contents;

    private LocalDateTime createDate;

}
