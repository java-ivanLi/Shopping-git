package com.sybinal.shop.validator;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sybinal.shop.service.catalog.ProductCategoryService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.HashMap;
import java.util.List;


public class Junit {
    private static ObjectMapper MAPPER = new ObjectMapper();


    @Test
    public void  test(){

      /*  for(HashMap<String,Object> map : list){
            for(String key : map.keySet()){

                System.out.println(key+":"+map.get(key));

            }
            System.out.println();
        }*/
        try {
            ApplicationContext app = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/spring-core-config.xml");

            ProductCategoryService  impl = (ProductCategoryService)app.getBean("productCategoryServiceImpl");
            List<HashMap<String, Object>> list = impl.ProductCategoryCount();
            String s = MAPPER.writeValueAsString(list);

            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
