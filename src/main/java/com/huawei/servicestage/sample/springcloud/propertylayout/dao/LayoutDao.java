package com.huawei.servicestage.sample.springcloud.propertylayout.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.huawei.servicestage.sample.springcloud.propertylayout.model.Layout;

public interface LayoutDao extends JpaRepository<Layout, String> {

}
