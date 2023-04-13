package com.lizhi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lizhi.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.lizhi.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




