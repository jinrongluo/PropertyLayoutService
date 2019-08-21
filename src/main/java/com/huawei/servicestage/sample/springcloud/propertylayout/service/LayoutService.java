package com.huawei.servicestage.sample.springcloud.propertylayout.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.huawei.servicestage.sample.springcloud.propertylayout.dao.LayoutDao;
import com.huawei.servicestage.sample.springcloud.propertylayout.model.Layout;

@RestController
public class LayoutService {

	@Autowired
	private LayoutDao layoutDao;
	
    @RequestMapping(value="/layouts", produces = { "application/json" }, 
            method = RequestMethod.GET)
    public Iterable<Layout> getAllLayouts() {
    	return layoutDao.findAll();
    }
    
    @RequestMapping(value="/layouts/{layoutid}", produces = { "application/json" }, 
            method = RequestMethod.GET)
    public Layout getLayoutById(@PathVariable("layoutid") String lid) {
    	Optional<Layout> layout = layoutDao.findById(lid);
    	if(layout.isPresent()) {
    		return layout.get();
    	}else{
    		return null;
    	}
    }
}
