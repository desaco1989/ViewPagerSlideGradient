package com.desaco.testicon.backup;

/**
 * 所有的常量
 * Created by desaco on 2016/12/6.
 */
public class ConstantAttr {
    //图片放置的位置
    public final static String SDCARD_IMGS_PATH = "/duchuang/pictures/";
    public final static String URL = "url";
    public final static String mTitle = "mTitle";
    public final static String isShowTitle = "isShowTitle";
    public final static String isShare = "isShare";
    public final static String ID = "id";
    public final static String labelName = "labelName";
    public final static String newsId = "newsId";
    public final static String newsUrl = "newsUrl";
    public final static String newsTitle = "newsTitle";
    public final static String singleType = "singleType";
    public final static String Cate = "Cate";
    public final static String mUrl = "mUrl";
    public final static String categoryId = "categoryId";
    public final static String param = "param";
    public final static String isDayNight = "isDayNight";
    public final static String data = "data";
    public final static String nativeItem = "nativeItem";
    public final static String mobile = "mobile";
    public final static String mType = "mType";
    public final static String thirdLogin = "thirdLogin";
    public final static String nickName = "nickName";
    public final static String token = "token";
    public final static String isLoadingActivity = "isLoadingActivity";

    public final static String newsType = "newsType";
    public final static String videoType = "videoType";
    public final static String channelId = "channelId";

    public final static String UpdateVersion = "UpdateVersion";//主动更新的版本号
    public final static String UpdateUrl = "UpdateUrl";//主动更新的url地址
    public final static String CancelUpdateVersion = "CancelUpdateVersion";//取消“我”的页面 设置红点显示的版本号

    //应用的包名
    public final static String package_name = "com.nayun.framework";
    //30原创；31 点播; 32 VR
    public final static String original_video = "30";
    public final static String point_video = "31";
    public final static String vr_video = "32";

    public static final String H5PageName = "page.zip";
    public static final String externalUrl = "externalUrl";
    //点击Push通知，统计用户的点击量；1表示通知栏点击，2表示弹框点击，3表示列表点击
    public static final String from_notification_bar = "1";
    public static final String from_app_internal_dlg = "2";
    public static final String from_me_push_list_unread = "3";//推送消息列表，未读消息，需要统计
    public static final String from_me_push_list_read = "4";//推送消息列表，已读消息，不需要统计

    public static final int pageNum = 0;//每一页显示条数等于0
    //标志，需要重新展示启动页（广告）
    public static final String SHOW_ADS_PAGE = "show_ads_page";

    //允许安装未知来源的Apk
    public static final int REQUEST_INSTALL_PACKAGES = 1074;
    //startActivityForResult() “订阅”列表跳转到登陆的ReqestCode
    public static final int subscribe_list_loginActivity = 200;

    //登录状态已失效
    public static final String login_invidate = "401";


}
