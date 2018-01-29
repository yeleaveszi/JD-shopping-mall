package top.linsir.jd_shopping_mall.di.component;

import android.app.Activity;

import dagger.Component;
import top.linsir.jd_shopping_mall.MainActivity;
import top.linsir.jd_shopping_mall.di.module.ActivityModule;
import top.linsir.jd_shopping_mall.di.scope.ActivityScope;

/**
 * 作者：潇湘夜雨 on 2018/1/29.
 * 邮箱：879689064@qq.com
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();


    void inject(MainActivity mainActivity);


}