package com.xindai.credit.service;

import com.xindai.credit.bean.NplmBorrowerInfo;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface NplmBorrowerInfoService {

    // 获取所有借款人的信息列表
    List<NplmBorrowerInfo> getAllBorrower();

    // 分页查询所有合同的信息列表
    List<NplmBorrowerInfo> getPageQuery(int pageNum,int rows);

    // 获取数据的总条数
    int  getCount();
}
