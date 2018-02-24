package com.gxg.administrator.mydemo7.animatedpieview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gxg.administrator.mydemo7.R;
import com.gxg.administrator.mydemo7.animatedpieview.popup.PopupSetting;
import com.razerdp.widget.animatedpieview.AnimatedPieView;
import com.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import com.razerdp.widget.animatedpieview.callback.OnPieSelectListener;
import com.razerdp.widget.animatedpieview.data.IPieInfo;
import com.razerdp.widget.animatedpieview.data.SimplePieInfo;

import java.util.Random;

public class AnimatedPieViewActivity extends AppCompatActivity {
    private final Random random = new Random();
    private AnimatedPieView mAnimatedPieView;
    private Button start;
    private Button setting;
    private PopupSetting mPopupSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animated_pie_view);
        initView();
    }

    private void initView() {
        mPopupSetting = new PopupSetting(this);
        start = (Button) findViewById(R.id.start);
        setting = (Button) findViewById(R.id.setting);
        mAnimatedPieView = (AnimatedPieView) findViewById(R.id.animatedPieView);
        AnimatedPieViewConfig config = new AnimatedPieViewConfig();
        config.startAngle(-90)
                .animationDrawDuration(0)
                .addData(new SimplePieInfo(30, getColor("FF446767")), true)
                .addData(new SimplePieInfo(18.0f, getColor("FFFFD28C")), true)
                .addData(new SimplePieInfo(123.0f, getColor("FFbb76b4")), true)
                .addData(new SimplePieInfo(87.0f, getColor("FFFFD28C"), "长文字test"), false)
                .addData(new SimplePieInfo(15.0f, getColor("ff2bbc80")), true)
                .addData(new SimplePieInfo(55.0f, getColor("ff8be8ff")), true)
                .addData(new SimplePieInfo(30.0f, getColor("fffa734d")), true)
                .addData(new SimplePieInfo(30.0f, getColor("ff957de0")), true)
                .drawDescText(true)
                .animationDrawDuration(1200)
                .textGuideLineStrokeWidth(4)
                .textSize(12)
                .pieRadiusScale(0.8f)
                .pieSelectListener(new OnPieSelectListener<IPieInfo>() {
                    @Override
                    public void onSelectPie(@NonNull IPieInfo pieInfo, boolean isScaleUp) {
                        if (isScaleUp) {
                            Toast.makeText(AnimatedPieViewActivity.this, pieInfo.getDesc(), Toast.LENGTH_SHORT).show();
                        }

                    }
                })
                .focusAlphaType(AnimatedPieViewConfig.FOCUS_WITH_ALPHA_REV);
        mAnimatedPieView.applyConfig(config);

        mPopupSetting.setOnOkButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimatedPieView.start();
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimatedPieView.start();
            }
        });


        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnimatedPieView.isInAnimating()) return;
                mPopupSetting.showPopupWindow(mAnimatedPieView.getConfig());
            }
        });

    }

    private int randomColor() {
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        return Color.argb(255, red, green, blue);
    }

    private int getColor(String colorStr) {
        if (TextUtils.isEmpty(colorStr)) return Color.BLACK;
        if (!colorStr.startsWith("#")) colorStr = "#" + colorStr;
        return Color.parseColor(colorStr);
    }
}
