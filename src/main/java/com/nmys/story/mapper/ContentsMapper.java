package com.nmys.story.mapper;

import com.nmys.story.model.dto.Archive;
import com.nmys.story.model.entity.Contents;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ContentsMapper {

    /**
     * Description:根据类型查询最新发布的文章
     * Author:70kg
     * Param [Type]
     * Return java.util.List<com.nmys.story.model.entity.Contents>
     * Date 2018/5/10 9:50
     */
    List<Contents> getContentsByType(@Param("type") String type, @Param("status") String status);

    /**
     * Description:更新文章
     * Author:70kg
     * Param [content]
     * Return boolean
     * Date 2018/5/11 14:02
     */
    boolean updateContent(Contents content);

    /**
     * Description:根据id获取文章
     * Author:70kg
     * Param [id]
     * Return com.nmys.story.model.entity.Contents
     * Date 2018/5/11 15:56
     */
    Contents getContentById(@Param("id") Integer id);

    /**
     * Description: 查询归档文章
     * author: itachi
     * Date: 2018/5/12 下午9:02
     */
    List<Archive> selectArchive();

    /**
     * Description: 查询文章by特定条件
     * author: itachi
     * Date: 2018/5/12 下午9:19
     */
    List<Contents> getContentsByConditions(@Param("type") String type, @Param("status") String status, @Param("startTime") Integer startTime, @Param("endTime") Integer endTime);


}
