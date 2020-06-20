package com.kronos.secondmoudle;

import android.widget.Toast;

import com.kronos.router.BindRouter;
import com.kronos.router.RouterCallback;
import com.kronos.router.RouterContext;
import com.kronos.router.interceptor.TestInterceptor;

/**
 * Created by Leif Zhang on 2016/12/6.
 * Email leifzhanggithub@gmail.com
 */
@BindRouter(urls = {"https://wwww.baidu.com"}, interceptors = {TestInterceptor.class})
public class SimpleCallBack implements RouterCallback {
    @Override
    public void run(RouterContext context) {
        Toast.makeText(context.getContext(), "testing", Toast.LENGTH_SHORT).show();
    }
}
