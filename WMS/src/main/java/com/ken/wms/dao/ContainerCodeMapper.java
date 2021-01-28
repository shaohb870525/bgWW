package com.ken.wms.dao;

import com.ken.wms.domain.ContainerCode;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ContainerCodeMapper {

    /**
     * 检索所有箱码
     *
     */
	List<ContainerCode> selectAll();

  

}
