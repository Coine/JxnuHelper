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
 * 2016/3/6  1.0     huangwei    Creation File
 */

import android.content.Context;

public interface ILoginView {
    String getPhoneNumber();

    String getPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity();

    void showFailedError(String description);

    Context getContext();
}
