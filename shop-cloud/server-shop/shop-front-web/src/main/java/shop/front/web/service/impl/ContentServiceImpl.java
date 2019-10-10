package shop.front.web.service.impl;

import org.springframework.stereotype.Service;
import shop.common.pojo.TbPanel;
import shop.common.pojo.TbPanelContent;
import shop.front.web.remote.ContentRemote;
import shop.front.web.service.ContentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 内容
 *
 * @author mingzhi.xie
 * @date 2019/4/7
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    private ContentRemote contentRemote;

    @Override
    public List<TbPanelContent> getNavList() {
        return contentRemote.getNavList();
    }

    @Override
    public List<TbPanel> getHome() {
        return contentRemote.getHome();
    }
}
