package com.minhee.springbootstudy.board.dao;

import com.minhee.springbootstudy.board.payload.BoardRequestDto;
import com.minhee.springbootstudy.board.payload.BoardResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


@SpringBootTest
class BoardDaoTest {

    @Autowired
    private BoardDao boardDao;

    @Test
    void insertTest() {
        BoardRequestDto requestDto = BoardRequestDto.builder()
                .userSeq(1L)
                .title("제목")
                .contents("내용")
                .createDate(LocalDateTime.now())
                .build();

        Integer result = boardDao.insertBoard(requestDto);
    }

    @Test
    void selectTest() {
        BoardResponseDto responseDto = boardDao.select(1L);
        System.out.println(responseDto);
    }

}