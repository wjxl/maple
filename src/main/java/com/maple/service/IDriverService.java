package com.maple.service;

import com.maple.common.ServerResponse;
import com.maple.pojo.Driver;

/**
 * Created by Maple.Ran on 2017/5/26.
 */
public interface IDriverService {
    ServerResponse saveDriver(Integer userId, Driver driver);

    ServerResponse setDriverStatus(Integer userId, String driverIds,Integer status);

    ServerResponse delete(Integer userId, String driverIds, Integer pageNum, Integer pageSize);

    ServerResponse list(Integer userId, String driverName, String phoneNum, Integer driverStatus, Integer coModelType, int pageNum, int pageSize);

    ServerResponse search(Integer userId, String createDateTop,String createDateBut, String name, String status, int pageNum, int pageSize);

    ServerResponse detail(Integer userId, Integer driverId);

    ServerResponse manageDriverStatus(String driverIds, Integer status);

    ServerResponse addAccount(Integer driverId, Integer platformCode, String account);

    ServerResponse getAccountList(Integer driverId);
}