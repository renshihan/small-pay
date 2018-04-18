package com.renshihan.pay.common.utils.exception;


import com.renshihan.pay.common.utils.enums.NoChannelExceptionCodes;

public class NoChannelException extends RuntimeException {
    private String code;
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public NoChannelException(String s) {
        super(s);
    }
    public NoChannelException(NoChannelExceptionCodes noChannelExceptionCodes){

        super(noChannelExceptionCodes.getMessage());
        this.code=noChannelExceptionCodes.getCode();
    }
    public NoChannelException(NoChannelExceptionCodes noChannelExceptionCodes,String message){

        super(message);
        this.code=noChannelExceptionCodes.getCode();
    }
    public String getCode() {
        return code;
    }
}
