package com.study.mapper;

import com.study.command.BoardVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Repository
public interface BoardMapper {
    ArrayList<BoardVo> selectBoard();
}
