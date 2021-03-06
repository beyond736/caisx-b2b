package com.jshop.exception.order;

/**
 * Created by yanglikai on 2017/9/8.
 */
public class OrderServiceException extends Exception {
  private int code;
  private String msg;

  public OrderServiceException() {
    super();
  }

  /**
   * 构造函数.
   *
   * @param code 错误编号
   * @param msg  错误信息
   */
  public OrderServiceException(int code, String msg) {
    super(code + ":" + msg);
    this.code = code;
    this.msg = msg;
  }

  public int getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }
}
