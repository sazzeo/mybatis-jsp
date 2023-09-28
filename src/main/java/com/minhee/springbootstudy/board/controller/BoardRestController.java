package com.minhee.springbootstudy.board.controller;

import com.minhee.springbootstudy.board.payload.BoardRequestDto;
import com.minhee.springbootstudy.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/board")
@RestController
public class BoardRestController {

    private final BoardService boardService;

    @PostMapping
    public ResponseEntity<Void> add(@Validated @RequestBody BoardRequestDto boardRequestDto) {
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> modify(@Validated @RequestBody BoardRequestDto boardRequestDto) {
        return null;
    }

    @DeleteMapping("/{boardSeq}")
    public ResponseEntity<Void> remove(@PathVariable Long boardSeq) {
        return null;
    }
}
