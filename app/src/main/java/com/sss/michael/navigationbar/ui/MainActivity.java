package com.sss.michael.navigationbar.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sss.michael.navigationbar.R;
import com.sss.michael.navigationbar.model.BottomBarModel;
import com.sss.michael.navigationbar.utils.DensityUtil;
import com.sss.michael.navigationbar.widget.BottomNavigationBar;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationBar bottomNavigationBar;
    private View navigationHolderView;
    private BottomBarModel bottomBarModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        navigationHolderView = findViewById(R.id.navigation_holder_view);
        bottomNavigationBar = findViewById(R.id.navigation_bar);
        bottomBarModel = bottomNavigationBar.initBottomBarConfig(null);

        findViewById(R.id.normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preCreateTabs(0);
            }
        });
        findViewById(R.id.vip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preCreateTabs(1);
            }
        });
        findViewById(R.id.corner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //如果设置为true，角标的显示(包括字体大小、颜色等将由【main_tabs_config.json】配置文件来决定)
                bottomNavigationBar.setCornerMarkByConfig(false);
                //这里将通过标签名称来匹配角标位置，标签名称取决于配置文件【main_tabs_config.json】的label字段
                bottomNavigationBar.setCornerMarkByLabel("宝马", "角标");
                bottomNavigationBar.setCornerMarkByLabel("莲花", "角标");
            }
        });

        ConstraintLayout.LayoutParams layoutParamsNavigation = (ConstraintLayout.LayoutParams) bottomNavigationBar.getLayoutParams();
        if (layoutParamsNavigation != null && bottomBarModel.getHeight() > 0) {
            layoutParamsNavigation.height = DensityUtil.dp2px(bottomBarModel.getHeight());
            bottomNavigationBar.setLayoutParams(layoutParamsNavigation);
        }

        //为透明背景设置高度
        ConstraintLayout.LayoutParams layoutParamsHolder = (ConstraintLayout.LayoutParams) navigationHolderView.getLayoutParams();
        if (layoutParamsHolder != null) {
            layoutParamsHolder.topMargin = DensityUtil.dp2px(bottomBarModel.getReserveAreaHeight());
            navigationHolderView.setLayoutParams(layoutParamsHolder);
        }

        preCreateTabs(0);
        bottomNavigationBar.setOnBottomNavigationBarCallBack(new BottomNavigationBar.OnBottomNavigationBarCallBack() {

            @Override
            public void onBottomNavigationBarItemClick(int position, boolean bigImage, BottomNavigationBar.Extra extra) {
                Toast.makeText(MainActivity.this, ("索引位置："+position) + "," + ("模块位置："+extra.getFragmentIndex()), Toast.LENGTH_SHORT).show();
            }
        });
    }


    /**
     * 通过权限来加载导航栏
     *
     * @param permission 0游客模式   1vip模式
     */
    private void preCreateTabs(int permission) {


        //用来解决多层循环跳出
        boolean exist = false;
        for (BottomBarModel.Tabs tab : bottomBarModel.getTabs()) {
            if (exist) {
                break;
            }
            for (Integer integer : tab.getTabPermissions()) {
                if (integer.intValue() == permission) {
                    createTabs(tab.getTabItems(), bottomBarModel);
                    exist = true;
                    break;
                }
            }

        }
    }


    /**
     * 创建导航tab
     */
    private void createTabs(List<BottomBarModel.Tabs.TabItems> tabItems, BottomBarModel bottomBarModel) {
        bottomNavigationBar.clear();
        List<BottomNavigationBar.BottomNavigationBarItem> items = new ArrayList<>();
        for (int i = 0; i < tabItems.size(); i++) {
            if ("lotus".equals(tabItems.get(i).getModuleName())) {
                //创建莲花模块
            } else if ("bmw".equals(tabItems.get(i).getModuleName())) {
                //创建宝马模块
            } else if ("benz".equals(tabItems.get(i).getModuleName())) {
                //创建奔驰模块
            }

            BottomNavigationBar.Builder builder = new BottomNavigationBar.Builder(bottomNavigationBar);
            builder.setBetweenImageAndText(tabItems.get(i).getBetweenImageAndText());
            builder.setBigImage(tabItems.get(i).isBigImage());
            builder.setChecked(tabItems.get(i).isIsChecked());
            builder.setCheckedUrl(tabItems.get(i).getCheckedUrl());
            builder.setUnCheckedUrl(tabItems.get(i).getUnCheckedUrl());
            builder.setFragmentIndex(tabItems.get(i).getFragmentIndex());
            builder.setImageHeight(tabItems.get(i).getImageHeight());
            builder.setImageWidth(tabItems.get(i).getImageWidth());
            builder.setLabel(tabItems.get(i).getLabel());
            builder.setPageUrl(tabItems.get(i).getPageUrl());
            builder.setTextOffsetY(tabItems.get(i).getTextOffsetY());
            builder.setTextSize(tabItems.get(i).getTextSize());
            builder.setWeight(tabItems.get(i).getWeight());
            if (bottomBarModel.isCornerMarkByConfig()) {
                builder.setCornerMark(tabItems.get(i).getCornerMark());
            }
            builder.setCornerMarkTextSize(tabItems.get(i).getCornerMarkTextSize());
            builder.setCornerMarkPaddingVertical(tabItems.get(i).getCornerMarkPaddingVertical());
            builder.setCornerMarkPaddingHorizontal(tabItems.get(i).getCornerMarkPaddingHorizontal());
            try {
                builder.setCheckTextColor(Color.parseColor(tabItems.get(i).getCheckTextColor()));
                builder.setUnCheckTextColor(Color.parseColor(tabItems.get(i).getUnCheckTextColor()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            BottomNavigationBar.BottomNavigationBarItem navigationBarItem = builder.build(MainActivity.this);
            items.add(navigationBarItem);
        }
        bottomNavigationBar
                .setCornerMarkByConfig(bottomBarModel.isCornerMarkByConfig())
                .setPaddingTop(bottomBarModel.getPattingTop())
                .setPaddingBottom(bottomBarModel.getPattingBottom())
                .setReserveArealHeight(bottomBarModel.getReserveAreaHeight())
                .setItems(items);

    }

}