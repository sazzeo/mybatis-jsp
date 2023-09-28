package com.minhee.springbootstudy.board.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor
public class BoardRequestDto {

    @NotNull(message = "유저 정보를 입력해주세요")
    private Long userSeq;

    @NotEmpty(message = "제목을 입력해주세요")
    @Size(max = 100, message = "제목은 100자 이하여야합니다.")
    private String title;

    private String contents;

    @Builder.Default
    private LocalDateTime createDate = LocalDateTime.now();

}
