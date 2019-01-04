package dao;

import entity.BookRecord;
import entity.BookRecordKey;

public interface BookRecordMapper {
    int deleteByPrimaryKey(BookRecordKey key);

    int insert(BookRecord record);

    int insertSelective(BookRecord record);

    BookRecord selectByPrimaryKey(BookRecordKey key);

    int updateByPrimaryKeySelective(BookRecord record);

    int updateByPrimaryKey(BookRecord record);
}