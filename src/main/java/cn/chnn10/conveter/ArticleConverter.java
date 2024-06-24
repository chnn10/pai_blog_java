package cn.chnn10.conveter;

import cn.chnn10.domain.ArticleDO;
import cn.chnn10.enums.ArticleTypeEnum;
import cn.chnn10.enums.YesOrNoEnum;
import cn.chnn10.params.request.ArticlePostReq;

public class ArticleConverter {

    public static ArticleDO toArticleDo(ArticlePostReq req, Long author) {
        ArticleDO articleDO = new ArticleDO();
        articleDO.setUserId(author);
        articleDO.setId(req.getArticleId());
        articleDO.setTitle(req.getTitle());
        articleDO.setShortTitle(req.getShortTitle());
        articleDO.setArticleType(ArticleTypeEnum.valueOf(req.getArticleType().toUpperCase()).getCode());
        articleDO.setCategoryId(req.getCategoryId());
        articleDO.setPicture(req.getCover() == null ? "" : req.getCover());
        articleDO.setSource(req.getSource());
        articleDO.setSourceUrl(req.getSourceUrl());
        articleDO.setSummary(req.getSummary());
        articleDO.setStatus(req.pushStatus().getCode());
        articleDO.setDeleted(req.deleted() ? YesOrNoEnum.YES.getCode() : YesOrNoEnum.NO.getCode());
        return articleDO;
    }
}
