package com.demo.community.mapper;

import com.demo.community.model.LikeComment;
import com.demo.community.model.LikeCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LikeCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    long countByExample(LikeCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int deleteByExample(LikeCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int insert(LikeComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int insertSelective(LikeComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    List<LikeComment> selectByExampleWithRowbounds(LikeCommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    List<LikeComment> selectByExample(LikeCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    LikeComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") LikeComment record, @Param("example") LikeCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int updateByExample(@Param("record") LikeComment record, @Param("example") LikeCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int updateByPrimaryKeySelective(LikeComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKE_COMMENT
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    int updateByPrimaryKey(LikeComment record);
}