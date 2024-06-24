package cn.chnn10.service;

import cn.chnn10.params.request.ArticlePostReq;

public interface ArticleService {

    /**
     * 发布文章
     * @param req
     * @param author
     * @return
     */
    Long saveArticle(ArticlePostReq req, Long author);
}
