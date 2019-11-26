package com.sybinal.shop.service.advertise;

import com.sybinal.shop.common.PageInformation;
import com.sybinal.shop.mapper.AdvertiseMapper;
import com.sybinal.shop.model.Advertise;
import com.sybinal.shop.model.ProductCategory;
import com.sybinal.shop.utils.PagingTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdertiseServiceImpl implements  AdertiseService{

    @Autowired
    private AdvertiseMapper advertiseMapper;

    @Autowired
    PagingTool pagingTool;

    public Map<String, Object> selectAdvertiseAll(PageInformation pageInfo, ProductCategory category) {
        HashMap<String, Object> datas = new HashMap<String, Object>();
        int pageCount = advertiseMapper.selectAdvertiseCount(category);
        List<Advertise> list = pagingTool.PagingData("com.sybinal.shop.mapper.AdvertiseMapper.selectAdvertiseAll", category,
                (Integer.parseInt(pageInfo.getiDisplayStart())/Integer.parseInt(pageInfo.getiDisplayLength()))+1,Integer.parseInt(pageInfo.getiDisplayLength()));
        //分页计算公式: ((当前页-1)*总显示数,总显示数)
        datas.put("sEcho", pageInfo.getsEcho());
        datas.put("iTotalRecords", pageCount);   //（返回总记录数）
        datas.put("iTotalDisplayRecords", pageCount);  //（过滤后记录数）
        datas.put("aaData", list);     //（分页查询结果）
        return datas;

    }

    @Transactional
    public int removeAdvertise(String id) {

        return   advertiseMapper.removeAdvertise(Integer.parseInt(id));
    }

    @Override
    public Advertise getAdvertiseContent(Integer id) {

        return advertiseMapper.getAdvertiseContent(id);
    }


    //添加
    @Override
    @Transactional
    public int addAdvertise(Advertise advertise) {
        return advertiseMapper.addAdvertise(advertise);
    }

    //修改
    @Override
    @Transactional
    public int updateAdvertise(Advertise advertise) {
        return advertiseMapper.updateAdvertise(advertise);
    }

    @Override
    public Advertise checkAdvertiseName(String name) {
        return advertiseMapper.checkAdvertiseName(name);
    }

    @Override
    public List<ProductCategory> selectProductCategory() {
        return advertiseMapper.selectProductCategory();
    }

    @Override
    public List<Advertise> selectIndexAdvertiseFalg() {
        return advertiseMapper.selectIndexAdvertiseFalg();
    }
}
