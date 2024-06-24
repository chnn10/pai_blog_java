package cn.chnn10.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_ai_history")
public class UserAiHistoryDO extends BaseDO {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 问题
     */
    private String question;

    /**
     * 答案
     */
    private String answer;

    /**
     * AI 类型
     *
     * @see AISourceEnum#getCode()
     */
    private Integer aiType;

}
