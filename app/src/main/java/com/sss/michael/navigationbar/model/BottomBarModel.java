package com.sss.michael.navigationbar.model;

import java.util.ArrayList;
import java.util.List;

public class BottomBarModel {
    //用于决定导航栏默认选中那一项
    private int selectTab;
    //导航栏顶边距
    private int pattingTop;
    //导航栏底边距
    private int pattingBottom;
    //导航栏总体高度
    private int height;
    //顶边开始的保留区域，用于形成异形导航栏，值越大，异形的区域也越大
    private int reserveAreaHeight;
    //背景颜色
    private String backgroundColor;
    //用于决定角标的显示是否由配置文件决定，如果是，将直接显示下面tabItems中的cornerMark值
    private boolean cornerMarkByConfig;
    //tab项
    private List<Tabs> tabs;

    public int getSelectTab() {
        return selectTab;
    }

    public void setSelectTab(int selectTab) {
        this.selectTab = selectTab;
    }

    public int getPattingTop() {
        return pattingTop;
    }

    public void setPattingTop(int pattingTop) {
        this.pattingTop = pattingTop;
    }

    public int getPattingBottom() {
        return pattingBottom;
    }

    public void setPattingBottom(int pattingBottom) {
        this.pattingBottom = pattingBottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getReserveAreaHeight() {
        return reserveAreaHeight;
    }

    public void setReserveAreaHeight(int reserveAreaHeight) {
        this.reserveAreaHeight = reserveAreaHeight;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<Tabs> getTabs() {
        return tabs;
    }

    public void setTabs(List<Tabs> tabs) {
        this.tabs = tabs;
    }

    public boolean isCornerMarkByConfig() {
        return cornerMarkByConfig;
    }

    public void setCornerMarkByConfig(boolean cornerMarkByConfig) {
        this.cornerMarkByConfig = cornerMarkByConfig;
    }

    public static class Tabs {
        //tab权限，可用于根据用户VIP状态来实现动态加载
        private List<Integer> tabPermissions;
        private List<TabItems> tabItems;

        public List<Integer> getTabPermissions() {
            return tabPermissions == null ? new ArrayList<>() : tabPermissions;
        }

        public void setTabPermissions(List<Integer> tabPermissions) {
            this.tabPermissions = tabPermissions;
        }

        public List<TabItems> getTabItems() {
            return tabItems == null ? new ArrayList<>() : tabItems;
        }

        public void setTabItems(List<TabItems> tabItems) {
            this.tabItems = tabItems;
        }

        public static class TabItems {

            private int fragmentIndex;
            //是否是大图模式
            private boolean bigImage;
            //图片宽度
            private int imageWidth;
            //图片高度
            private int imageHeight;
            //点击后打开的链接，用于路由、H5链接等
            private String pageUrl;
            //选中展示图片
            private String checkedUrl;
            //未选中展示
            private String unCheckedUrl;
            //权重，这里是宽度的权重，而不是宽高权重
            private float weight;
            //展示标题
            private String label;
            //模块名称，用于创建绑定fragment
            private String moduleName;
            //图标与标签之间的间距
            private int betweenImageAndText;
            //标签Y轴偏移量
            private int textOffsetY;
            //标签文本字号
            private int textSize;
            //角标文本
            private String cornerMark;
            //角标文本字号
            private float cornerMarkTextSize;
            //角标上下内边距
            private float cornerMarkPaddingVertical;
            //角标左右内边距
            private float cornerMarkPaddingHorizontal;
            //标签选中时字体颜色
            private String checkTextColor;
            //标签未选中时字体颜色
            private String unCheckTextColor;
            //是否选中
            private boolean isChecked;

            public int getFragmentIndex() {
                return fragmentIndex;
            }

            public void setFragmentIndex(int fragmentIndex) {
                this.fragmentIndex = fragmentIndex;
            }

            public boolean isBigImage() {
                return bigImage;
            }

            public void setBigImage(boolean bigImage) {
                this.bigImage = bigImage;
            }

            public int getImageWidth() {
                return imageWidth;
            }

            public void setImageWidth(int imageWidth) {
                this.imageWidth = imageWidth;
            }

            public int getImageHeight() {
                return imageHeight;
            }

            public void setImageHeight(int imageHeight) {
                this.imageHeight = imageHeight;
            }

            public String getPageUrl() {
                return pageUrl;
            }

            public void setPageUrl(String pageUrl) {
                this.pageUrl = pageUrl;
            }

            public String getCheckedUrl() {
                return checkedUrl;
            }

            public void setCheckedUrl(String checkedUrl) {
                this.checkedUrl = checkedUrl;
            }

            public String getUnCheckedUrl() {
                return unCheckedUrl;
            }

            public void setUnCheckedUrl(String unCheckedUrl) {
                this.unCheckedUrl = unCheckedUrl;
            }

            public float getWeight() {
                return weight;
            }

            public void setWeight(float weight) {
                this.weight = weight;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getModuleName() {
                return moduleName;
            }

            public void setModuleName(String moduleName) {
                this.moduleName = moduleName;
            }

            public int getBetweenImageAndText() {
                return betweenImageAndText;
            }

            public void setBetweenImageAndText(int betweenImageAndText) {
                this.betweenImageAndText = betweenImageAndText;
            }

            public int getTextOffsetY() {
                return textOffsetY;
            }

            public void setTextOffsetY(int textOffsetY) {
                this.textOffsetY = textOffsetY;
            }

            public int getTextSize() {
                return textSize;
            }

            public void setTextSize(int textSize) {
                this.textSize = textSize;
            }

            public String getCheckTextColor() {
                return checkTextColor;
            }

            public void setCheckTextColor(String checkTextColor) {
                this.checkTextColor = checkTextColor;
            }

            public String getUnCheckTextColor() {
                return unCheckTextColor;
            }

            public void setUnCheckTextColor(String unCheckTextColor) {
                this.unCheckTextColor = unCheckTextColor;
            }

            public boolean isIsChecked() {
                return isChecked;
            }

            public void setIsChecked(boolean isChecked) {
                this.isChecked = isChecked;
            }

            public String getCornerMark() {
                return cornerMark;
            }

            public void setCornerMark(String cornerMark) {
                this.cornerMark = cornerMark;
            }

            public float getCornerMarkTextSize() {
                return cornerMarkTextSize;
            }

            public void setCornerMarkTextSize(float cornerMarkTextSize) {
                this.cornerMarkTextSize = cornerMarkTextSize;
            }

            public float getCornerMarkPaddingVertical() {
                return cornerMarkPaddingVertical;
            }

            public void setCornerMarkPaddingVertical(float cornerMarkPaddingVertical) {
                this.cornerMarkPaddingVertical = cornerMarkPaddingVertical;
            }

            public float getCornerMarkPaddingHorizontal() {
                return cornerMarkPaddingHorizontal;
            }

            public void setCornerMarkPaddingHorizontal(float cornerMarkPaddingHorizontal) {
                this.cornerMarkPaddingHorizontal = cornerMarkPaddingHorizontal;
            }
        }
    }
}
