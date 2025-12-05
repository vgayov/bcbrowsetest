package com.extensions.bcbrowseapp;

import com.qad.ipc.dto.BCExecutionError;
import com.qad.ipc.dto.Output;
import com.qad.ipc.service.Extension;
import com.qad.sales.salesorder.SalesOrderHeaderBaseService;
import com.qad.sales.salesorder.SalesOrderHeaderDataSet;

@Extension
public class MyExt extends SalesOrderHeaderBaseService {

    @Override
    public void fetch(String domainCode, String salesOrderNumber, Output<SalesOrderHeaderDataSet> dsSalesOrderHeader)
            throws BCExecutionError {
        // TODO Auto-generated method stub
        //Test
        super.fetch(domainCode, salesOrderNumber, dsSalesOrderHeader);
    }

}
