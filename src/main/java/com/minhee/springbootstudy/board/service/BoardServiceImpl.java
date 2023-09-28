package com.minhee.springbootstudy.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class BoardServiceImpl implements BoardService {

    @Override
    public void test() {
        System.out.println("test");
    }

}
