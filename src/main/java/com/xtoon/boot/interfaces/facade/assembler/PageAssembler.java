package com.xtoon.boot.interfaces.facade.assembler;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xtoon.boot.interfaces.common.Page;

/**
 * Assembler class for the page.
 *
 * @author haoxin
 * @date 2021-04-04
 **/
public class PageAssembler {
    public static Page toPage(IPage iPage) {
        Page page = new Page(iPage.getRecords(), iPage.getTotal(), iPage.getSize(), iPage.getCurrent());
        return page;
    }
}
