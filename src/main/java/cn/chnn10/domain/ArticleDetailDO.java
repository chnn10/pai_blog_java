package cn.chnn10.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("article_detail")
public class ArticleDetailDO extends BaseDO {

    // D:\IdeaProject\paicoding\pai_blog_java\src\main\java\cn\chnn10\domain\ArticleDetailDO.java
    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 文章内容
     */
    private String content;

    private Integer deleted;
}
