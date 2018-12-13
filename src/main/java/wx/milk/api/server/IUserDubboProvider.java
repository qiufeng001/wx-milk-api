package wx.milk.api.server;

import wx.query.Query;
import wx.security.User;

public interface IUserDubboProvider {
    User findByParam(Query query);
}
