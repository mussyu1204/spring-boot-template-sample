package com.example.demo.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HogeMapper {

    @Insert("INSERT INTO HOGE_TABLE (lastname, firstname) VALUES (#{lastName}, #{firstName})")
    public void insertHoge(Hoge hoge);

    @Select("SELECT * FROM HOGE_TABLE WHERE id = #{id}")
    public Hoge findOneById(@Param("id") Integer id);

    @Select("SELECT * FROM HOGE_TABLE;")
    public List<Hoge> findAll();
}
