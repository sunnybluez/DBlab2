package dao;

import entity.PackageUsage;
import entity.PackageUsageKey;

public interface PackageUsageMapper {
    int deleteByPrimaryKey(PackageUsageKey key);

    int insert(PackageUsage record);

    int insertSelective(PackageUsage record);

    PackageUsage selectByPrimaryKey(PackageUsageKey key);

    int updateByPrimaryKeySelective(PackageUsage record);

    int updateByPrimaryKey(PackageUsage record);
}