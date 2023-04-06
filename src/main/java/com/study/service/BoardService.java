package com.study.service;

import com.study.command.BoardVo;
import com.study.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public interface BoardService {

    public ArrayList<BoardVo> selectBoard();
}
