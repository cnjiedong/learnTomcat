package com.yingzi.center.breeding.exception;

import com.dtyunxi.lang.BusinessRuntimeException;

/**
 * BusinessRuntimeException
 *
 * @author 无名
 * @since 1.0.0
 */
public class CenterBreedingBusinessRuntimeException extends BusinessRuntimeException {

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorMsg;

    public CenterBreedingBusinessRuntimeException(String msg) {
        super(msg);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}