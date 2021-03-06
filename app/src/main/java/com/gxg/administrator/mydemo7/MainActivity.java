package com.gxg.administrator.mydemo7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.gxg.administrator.mydemo7.RefreshHeaderLayout.RefreshHeaderLayoutActivity;
import com.gxg.administrator.mydemo7.StickHeader.StickHeaderActivity;
import com.gxg.administrator.mydemo7.alivlayout.AliVLayoutActivity;
import com.gxg.administrator.mydemo7.allviewtouming.AllViewToumingActivity;
import com.gxg.administrator.mydemo7.animatedpieview.AnimatedPieViewActivity;
import com.gxg.administrator.mydemo7.chinaMap.ChinaMapActivity;
import com.gxg.administrator.mydemo7.colorfulline.ColorFullIneActivity;
import com.gxg.administrator.mydemo7.constrainlayout.ConstrainLayoutActivity;
import com.gxg.administrator.mydemo7.coordinatortablayout.CoordinatortablayoutActivity;
import com.gxg.administrator.mydemo7.daojishi.DaoJiShiActivity;
import com.gxg.administrator.mydemo7.designtest.DesignTestActivity;
import com.gxg.administrator.mydemo7.dingbuxuanfu.DingBuXuanFuActivity;
import com.gxg.administrator.mydemo7.headscroll.HeadScrollActivity;
import com.gxg.administrator.mydemo7.iswiperefreshlayout.IRecycleviewActivity;
import com.gxg.administrator.mydemo7.okhttp.OkHttpActivity;
import com.gxg.administrator.mydemo7.pictures.PicturesActivity;
import com.gxg.administrator.mydemo7.prdownloader.utils.PRDownloaderActivity;
import com.gxg.administrator.mydemo7.pubuliu.RecycleViewDemo;
import com.gxg.administrator.mydemo7.pubuliuhead.MyPubuliuActivity;
import com.gxg.administrator.mydemo7.scrolldemo.ScrollDemoActivity;
import com.gxg.administrator.mydemo7.shichagundong.ShiChaGunDongActivity;
import com.gxg.administrator.mydemo7.shijuexiaoguo.ShiJueTeXiaoActivity;
import com.gxg.administrator.mydemo7.shimmer.ShimmerActivity;
import com.gxg.administrator.mydemo7.tongzhilan.TongZhiLanActivity;
import com.gxg.administrator.mydemo7.videos.VideoActivity;
import com.gxg.administrator.mydemo7.webview.WebViewActivity;
import com.gxg.administrator.mydemo7.wxpwd.WxPwdActivity;
import com.gxg.administrator.mydemo7.yinying.YinYingActivity;
import com.gxg.administrator.mydemo7.zhihu.ZhiHuActivity;
import com.gxg.administrator.mydemo7.zuolatiaozhuan.HomeActivity;
import com.gxg.administrator.mydemo7.zxing.ZXingActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv_pbl)
    TextView mRvPbl;
    @Bind(R.id.rv_head)
    TextView mRv;

    //修改

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }

    @OnClick({R.id.rv_china_map,R.id.rv_animatedpieview,R.id.rv_xiazaiduandianxuchuan,R.id.rv_stickheader,R.id.rv_coordinatortablayout,R.id.rv_default,R.id.shipin,R.id.yueshubuju,R.id.shichagundong,R.id.zhihu,R.id.dingbu_xuanfu,R.id.all_view_touming,R.id.view_left_more,R.id.view_daojishi,R.id.view_shijuetexiao,R.id.view_wxpay,R.id.view_colorline,R.id.view_tongzhilan,R.id.view_addyinying,R.id.refresh_item,R.id.tv_headscroll,R.id.tv_design,R.id.tv_web,R.id.tv_okhttp, R.id.tv_scroll, R.id.iv_zxing, R.id.rv_pbl, R.id.rv_head, R.id.rv_ali, R.id.rv_fre_head, R.id.iv_picture})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.yueshubuju:
                startActivity(new Intent(MainActivity.this, ConstrainLayoutActivity.class));
                break;
            case R.id.rv_pbl:
                startActivity(new Intent(MainActivity.this, RecycleViewDemo.class));
                break;
            case R.id.rv_ali:
                startActivity(new Intent(MainActivity.this, AliVLayoutActivity.class));
                break;
            case R.id.rv_head:
                startActivity(new Intent(MainActivity.this, MyPubuliuActivity.class));
                break;
            case R.id.rv_fre_head:
                startActivity(new Intent(MainActivity.this, RefreshHeaderLayoutActivity.class));
                break;
            case R.id.iv_picture:
                startActivity(new Intent(MainActivity.this, PicturesActivity.class));
                break;
            case R.id.iv_zxing:
                startActivity(new Intent(MainActivity.this, ZXingActivity.class));
                break;
            case R.id.tv_scroll:
                startActivity(new Intent(MainActivity.this, ScrollDemoActivity.class));
                break;
            case R.id.tv_okhttp:
                startActivity(new Intent(MainActivity.this, OkHttpActivity.class));
                break;
            case R.id.tv_web:
                startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                break;
            case R.id.tv_design:
                startActivity(new Intent(MainActivity.this, DesignTestActivity.class));
                break;
            case R.id.tv_headscroll:
                startActivity(new Intent(MainActivity.this, HeadScrollActivity.class));
                break;
            case R.id.refresh_item:
                startActivity(new Intent(MainActivity.this, IRecycleviewActivity.class));
                break;
            case R.id.view_addyinying:
                startActivity(new Intent(MainActivity.this, YinYingActivity.class));
                break;
            case R.id.view_tongzhilan:
                startActivity(new Intent(MainActivity.this, TongZhiLanActivity.class));
                break;
            case R.id.view_colorline:
                startActivity(new Intent(MainActivity.this, ColorFullIneActivity.class));
                break;
            case R.id.view_wxpay:
                startActivity(new Intent(MainActivity.this, WxPwdActivity.class));
                break;
            case R.id.view_shijuetexiao:
                startActivity(new Intent(MainActivity.this, ShiJueTeXiaoActivity.class));
                break;
            case R.id.view_daojishi:
                startActivity(new Intent(MainActivity.this, DaoJiShiActivity.class));
                break;
            case R.id.view_left_more:
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                break;
            case R.id.all_view_touming:
                startActivity(new Intent(MainActivity.this, AllViewToumingActivity.class));
                break;
            case R.id.dingbu_xuanfu:
                startActivity(new Intent(MainActivity.this, DingBuXuanFuActivity.class));
                break;
            case R.id.zhihu:
                startActivity(new Intent(MainActivity.this, ZhiHuActivity.class));
                break;
            case R.id.shichagundong:
                startActivity(new Intent(MainActivity.this, ShiChaGunDongActivity.class));
                break;
            case R.id.shipin:
                startActivity(new Intent(MainActivity.this, VideoActivity.class));
                break;
            case R.id.rv_default:
                startActivity(new Intent(MainActivity.this, ShimmerActivity.class));
                break;
            case R.id.rv_coordinatortablayout:
                startActivity(new Intent(MainActivity.this, CoordinatortablayoutActivity.class));
                break;
            case R.id.rv_stickheader:
                startActivity(new Intent(MainActivity.this, StickHeaderActivity.class));
                break;
            case R.id.rv_xiazaiduandianxuchuan:
                startActivity(new Intent(MainActivity.this, PRDownloaderActivity.class));
                break;
            case R.id.rv_animatedpieview:
                startActivity(new Intent(MainActivity.this, AnimatedPieViewActivity.class));
                break;
            case R.id.rv_china_map:
                startActivity(new Intent(MainActivity.this, ChinaMapActivity.class));
                break;
        }
    }
}
