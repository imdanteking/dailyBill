package com.chemdim.dailybill.uitls;

public class ResponseMessage {
    /**
     * invalid status message
     */
    public static final String INVALID_LOGIN = "用户名或密码错误";
    public static final String INVALID_SESSION_EXPIRED = "session过期";
    public static final String INVALID_INSUFFICIENT_PERMISSION = "权限不足";
    public static final String INVALID_ILLEGAL_USER_STATUS = "用户状态异常";
    public static final String INVALID_NONEXISTENT_USER = "用户不存在";
    public static final String INVALID_SESSION_AND_IS_NOT_ADMIN = "session存在且不是管理员";
    public static final String INVALID_USERNAME_USED = "用户名已被占用";
    public static final String INVALID_MODIFY_USER_INFO_FAILED = "修改用户信息失败";
    /**
     * valid status message
     */
    public static final String VALID_LOGIN = "登陆成功";
    public static final String VALID_LOGOUT = "退出登陆成功";
    public static final String VALID_GET_USER_INFO = "获取个人信息成功";
    public static final String VALID_SESSION_AND_IS_ADMIN = "session存在且是管理员";
    public static final String VALID_MODIFY_USER_INFO = "修改用户信息成功";
    public static final String VALID_GET_USER_LIST = "获取用户列表成功";
}
