package com.maple.dao;

import com.maple.pojo.PeriodPayment;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface PeriodPaymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PeriodPayment record);

    int insertSelective(PeriodPayment record);

    PeriodPayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PeriodPayment record);

    int updateByPrimaryKey(PeriodPayment record);
    

    List<PeriodPayment> selectGeneralListByParams(@Param("driverName") String driverName, @Param("coModelType") Integer coModelType, @Param("paymentPlatform") Integer paymentPlatform, @Param("platformStatus") Integer platformStatus);

    List<PeriodPayment> selectListByCarId(@Param("carId") Integer carId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    List<PeriodPayment> selectListByDriverId(@Param("driverId") Integer driverId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    PeriodPayment checkStatus(@Param("driverId") Integer driverId, @Param("serialNo") String serialNo, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    BigDecimal findAmountReceived(@Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("coModelType") Integer coModelType, @Param("paymentPlatform") Integer paymentPlatform, @Param("branch") Integer branch);

    PeriodPayment selectWeekSumByParams(@Param("driverId") Integer driverId, @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("status") Set status);

    BigDecimal findTotalReceivedByCarId(Integer carId);

    Integer findOverdueByCarId(Integer carId);

    List<PeriodPayment> selectListByParams(@Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("driverName") String driverName, @Param("coModelType") Integer coModelType, @Param("payer") String payer, @Param("platformStatus") Integer platformStatus, @Param("paymentPlatform") Integer paymentPlatform, @Param("branch") Integer branch);

    int updateByPaymentStatus(@Param("paymentIdArray") Integer[] paymentIdArray, @Param("paymentStatus") Integer paymentStatus);

    PeriodPayment selectBySerialNo(String serialNo);
}