package dao;

import entity.UseRecord;

public interface UseRecordMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UseRecord record);

    int insertSelective(UseRecord record);

    UseRecord selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UseRecord record);

    int updateByPrimaryKey(UseRecord record);
}