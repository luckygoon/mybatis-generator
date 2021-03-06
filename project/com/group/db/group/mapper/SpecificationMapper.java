package com.group.db.group.mapper;

import com.group.db.group.model.Specification;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpecificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specification
     *
     * @mbg.generated
     */
    Specification selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specification
     *
     * @mbg.generated
     */
    int insertSelective(Specification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specification
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Specification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specification
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    List<Specification> selectByCondition(Specification record);

    List<Specification> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specification
     *
     * @mbg.generated
     */
    int deleteBySelective(Specification record);
}