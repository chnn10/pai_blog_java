package cn.chnn10.service.impl;

import cn.chnn10.conveter.ArticleConverter;
import cn.chnn10.domain.ArticleDO;
import cn.chnn10.params.request.ArticlePostReq;
import cn.chnn10.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public Long saveArticle(ArticlePostReq req, Long author) {
        ArticleDO articleDO = ArticleConverter.toArticleDo(req, author);
        return null;
    }

    private Long insertArticle(ArticlePostReq req, String content, Set<Long> tags) {
        return null;
    }

    private Long updateArticle(ArticlePostReq req, String content, Set<Long> tags) {
        return null;
    }
}
