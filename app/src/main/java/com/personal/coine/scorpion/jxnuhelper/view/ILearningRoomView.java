package com.personal.coine.scorpion.jxnuhelper.view;/*
 * Copyright(c) Runsdata Technologies Co., Ltd.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Runsdata
 * Technologies Co., Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with Runsdata.
 * For more information about Runsdata, welcome to http://www.runsdata.com
 *
 * Revision History
 * Date     Version     Name        Description
 * 2016/3/17  1.0     huangwei    Creation File
 */

import android.content.Context;

import java.util.List;

public interface ILearningRoomView {
    void showLoading();

    Context loadThisContext();

    void hideLoading();

    void appendView(List<String> roomName, List<String> location, List<String> roomType, List<Integer> capacity, List<String> openTime, List<Integer> restCapacity);

    void showError(String errorMsg);
}
