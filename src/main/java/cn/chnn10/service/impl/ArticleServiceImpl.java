package cn.chnn10.service.impl;

import cn.chnn10.params.request.ArticlePostReq;
import cn.chnn10.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public Long saveArticle(ArticlePostReq req, Long author) {
        return null;
    }
}
