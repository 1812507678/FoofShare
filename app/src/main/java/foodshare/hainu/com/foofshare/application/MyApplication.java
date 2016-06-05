package foodshare.hainu.com.foofshare.application;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by haijun on 2016/6/5.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化 Bmob SDK
        Bmob.initialize(this, "65d9a29f189d9856a8f3699d77099873");

    }
}
