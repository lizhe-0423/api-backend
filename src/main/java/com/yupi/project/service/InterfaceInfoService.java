package com.lizhi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhi.yuapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
