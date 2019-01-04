package dao;

import entity.Package;

public interface PackageMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Package record);

    int insertSelective(Package record);

    Package selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Package record);

    int updateByPrimaryKey(Package record);
}