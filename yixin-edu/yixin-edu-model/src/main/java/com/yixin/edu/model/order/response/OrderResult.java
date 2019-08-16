package com.yixin.edu.model.order.response;

import com.yixin.edu.common.model.response.ResponseResult;
import com.yixin.edu.common.model.response.ResultCode;
import com.yixin.edu.model.order.XcOrders;
import lombok.Data;
import lombok.ToString;

/**
 * Created by mrt on 2018/3/26.
 */
@Data
@ToString
public class OrderResult extends ResponseResult {
    private XcOrders xcOrders;
    public OrderResult(ResultCode resultCode, XcOrders xcOrders) {
        super(resultCode);
        this.xcOrders = xcOrders;
    }


}
