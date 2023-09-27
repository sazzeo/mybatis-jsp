package com.minhee.springbootstudy.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BoardServiceImpl implements BoardService {

    @Override
    public void test() {
        System.out.println("test");
    }

}
