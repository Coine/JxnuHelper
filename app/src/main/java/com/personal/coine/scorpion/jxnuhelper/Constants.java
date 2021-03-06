/*
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
 * 2016/3/7  1.0     huangwei    Creation File
 */
package com.personal.coine.scorpion.jxnuhelper;

import android.os.Environment;

/**
 * Description:
 *
 * @author huangwei
 *         Date 2016/3/7
 */
public class Constants {
    public static final String SAVED_IMAGE_DIR_PATH = Environment.getExternalStorageDirectory().toString() + "/jxnu/";
    public static final int REQUEST_CODE_PICK_IMAGE = 1;
    public static final int REQUEST_CODE_CAPTURE_CAMEIA = 2;
    public static final int PHOTO_REQUEST_CUT = 3;

}