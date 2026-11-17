package com.hmall.item.service;

import com.hmall.api.item.dto.ItemDTO;
import com.hmall.api.item.dto.OrderDetailDTO;
import com.hmall.item.domain.po.Item;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author 黑马程序员
 */
public interface IItemService extends IService<Item> {

    void deductStock(List<OrderDetailDTO> items);

    List<ItemDTO> queryItemByIds(Collection<Long> ids);
}
