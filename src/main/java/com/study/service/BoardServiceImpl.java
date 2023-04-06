package com.study.service;

import com.study.command.BoardVo;
import com.study.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public ArrayList<BoardVo> selectBoard() {
		return boardMapper.selectBoard();
	}
}
