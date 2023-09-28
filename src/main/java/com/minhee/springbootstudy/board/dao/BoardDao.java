package com.minhee.springbootstudy.board.dao;

import com.minhee.springbootstudy.board.payload.BoardRequestDto;
import com.minhee.springbootstudy.board.payload.BoardResponseDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDao {

    Integer insertBoard(BoardRequestDto boardRequestDto);

    BoardResponseDto select(Long boardSeq);
}
