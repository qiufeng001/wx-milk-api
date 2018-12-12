package wx.milk.api.server;


import wx.redis.WxJedisCommands;

/**
 * 用于提供用户基本操作基本数据获取
 */
public interface IAdministratorDubboProvider {

    /**
     * 获取用户模块的redis操作
     */
    WxJedisCommands getCommonJedis();
}


