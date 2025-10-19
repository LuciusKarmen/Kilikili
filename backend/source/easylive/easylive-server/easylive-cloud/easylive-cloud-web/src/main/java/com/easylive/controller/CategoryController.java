package com.easylive.controller;

import com.easylive.api.consumer.CategoryClient;
import com.easylive.entity.po.CategoryInfo;
import com.easylive.entity.vo.ResponseVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Validated
@RequestMapping("/category")
public class CategoryController extends ABaseController {

    @Resource
    private CategoryClient categoryClient;

    @RequestMapping("/loadAllCategory")
    public ResponseVO loadAllCategory() {
        List<CategoryInfo> categoryInfoList = categoryClient.loadAllCategory();
        return getSuccessResponseVO(categoryInfoList);
    }
}
