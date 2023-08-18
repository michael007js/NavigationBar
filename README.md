# NavigationBar
这是一个纯自绘的底部导航栏，可通过配置文件远程来实现远程可控式加载

- √[支持异形导航栏]（需加工）
- √[支持角标]
- √[支持热切换]
- √[支持动态加载]
- √[可定制实现远程加载]


配置文件【main_tabs_config.json】建议本地留存了一份用于应对网络波动而引发的拉去失败，其内容如下：

```
{
  "selectTab": 0,//"这个字段用于决定导航栏默认选中那一项"
  "pattingTop": 8,//导航栏顶边距
  "pattingBottom": 6,//导航栏底边距
  "height": 60,//导航栏总体高度
  "reserveAreaHeight": 10,//导航栏定边开始的保留区域，用于形成异形导航栏，值越大，异形的区域也越大
  "backgroundColor": "#FFFFFF",//背景颜色
  "cornerMarkByConfig": true,//用于决定角标的显示是否由配置文件决定，如果是，将直接显示下面tabItems中的cornerMark值
  "tabs": [
    {
      "tabPermissions": [
        0//tab权限
      ],
      "tabItems": [
        {
          "fragmentIndex": 0,
          "bigImage": false,//是否是大图模式
          "imageWidth": 23,//图片宽度
          "imageHeight": 23,//图片高度
          "pageUrl": "",//点击后打开的链接，用于路由、H5链接等
          "checkedUrl": "https://pics1.baidu.com/feed/77c6a7efce1b9d1681608e21b0371a868d546439.jpeg",//选中展示图片
          "unCheckedUrl": "https://pics0.baidu.com/feed/77c6a7efce1b9d16cbf6fe3baa371a868d5464ad.jpeg",//未选中展示
          "weight": 0.33,//权重，这里是宽度的权重，而不是宽高权重
          "label": "宝马",//展示标题
          "moduleName": "bmw",//模块名称，用于创建绑定fragment
          "betweenImageAndText": 3,//图标与标签之间的间距
          "textOffsetY": 3,//标签Y轴偏移量
          "textSize": 10,//标签文本字号
          "cornerMark": "",//角标文本
          "cornerMarkTextSize": 8,//角标文本字号
          "cornerMarkPaddingVertical": 2,//角标上下内边距
          "cornerMarkPaddingHorizontal": 4,//角标左右内边距
          "checkTextColor": "#e9302d",//标签选中时字体颜色
          "unCheckTextColor": "#666666",//标签未选中时字体颜色
          "isChecked": true//是否选中
        },
        {
          "fragmentIndex": 1,
          "bigImage": false,
          "imageWidth": 23,
          "imageHeight": 23,
          "pageUrl": "",
          "checkedUrl": "https://pics1.baidu.com/feed/77c6a7efce1b9d1681608e21b0371a868d546439.jpeg",
          "unCheckedUrl": "https://pics3.baidu.com/feed/4a36acaf2edda3cc87cc0bdc48009708203f9211.jpeg",
          "weight": 0.33,
          "label": "奔驰",
          "moduleName": "benz",
          "betweenImageAndText": 3,
          "textOffsetY": 3,
          "textSize": 10,
          "cornerMark": "",
          "cornerMarkTextSize": 8,
          "cornerMarkPaddingVertical": 2,
          "cornerMarkPaddingHorizontal": 4,
          "checkTextColor": "#e9302d",
          "unCheckTextColor": "#666666",
          "isChecked": false
        },
        {
          "fragmentIndex": 2,
          "bigImage": false,
          "imageWidth": 23,
          "imageHeight": 23,
          "pageUrl": "",
          "checkedUrl": "https://pics1.baidu.com/feed/77c6a7efce1b9d1681608e21b0371a868d546439.jpeg",
          "unCheckedUrl": "https://pics1.baidu.com/feed/b8389b504fc2d562a4db91f6a4f83ee674c66cc8.jpeg",
          "weight": 0.33,
          "label": "阿罗",
          "moduleName": "romeo",
          "betweenImageAndText": 3,
          "textOffsetY": 3,
          "textSize": 10,
          "cornerMark": "",
          "cornerMarkTextSize": 8,
          "cornerMarkPaddingVertical": 2,
          "cornerMarkPaddingHorizontal": 4,
          "checkTextColor": "#e9302d",
          "unCheckTextColor": "#666666",
          "isChecked": false
        }
      ]
    },
    {
      "tabPermissions": [
        1
      ],
      "tabItems": [
        {
          "fragmentIndex": 0,
          "bigImage": false,
          "imageWidth": 23,
          "imageHeight": 23,
          "pageUrl": "",
          "checkedUrl": "https://pics1.baidu.com/feed/77c6a7efce1b9d1681608e21b0371a868d546439.jpeg",
          "unCheckedUrl": "https://pics4.baidu.com/feed/902397dda144ad345009de999a4ba2fd30ad8568.jpeg",
          "weight": 0.33,
          "label": "莲花",
          "moduleName": "lotus",
          "betweenImageAndText": 3,
          "textOffsetY": 3,
          "textSize": 10,
          "cornerMark": "",
          "cornerMarkTextSize": 8,
          "cornerMarkPaddingVertical": 2,
          "cornerMarkPaddingHorizontal": 4,
          "checkTextColor": "#e9302d",
          "unCheckTextColor": "#666666",
          "isChecked": true
        },
        {
          "fragmentIndex": 1,
          "bigImage": true,
          "imageWidth": 54,
          "imageHeight": 54,
          "pageUrl": "",
          "checkedUrl": "https://img.zcool.cn/community/0140105b472293a80121ade0c97728.gif",
          "unCheckedUrl": "https://img.zcool.cn/community/0140105b472293a80121ade0c97728.gif",
          "weight": 0.33,
          "label": "小钱钱",
          "moduleName": "money",
          "betweenImageAndText": 3,
          "textOffsetY": 3,
          "textSize": 10,
          "cornerMark": "",
          "cornerMarkTextSize": 8,
          "cornerMarkPaddingVertical": 2,
          "cornerMarkPaddingHorizontal": 4,
          "checkTextColor": "#e9302d",
          "unCheckTextColor": "#666666",
          "isChecked": false
        },
        {
          "fragmentIndex": 2,
          "bigImage": false,
          "imageWidth": 23,
          "imageHeight": 23,
          "pageUrl": "",
          "checkedUrl": "https://pics1.baidu.com/feed/77c6a7efce1b9d1681608e21b0371a868d546439.jpeg",
          "unCheckedUrl": "https://pics1.baidu.com/feed/77c6a7efce1b9d1681608e21b0371a868d546439.jpeg",
          "weight": 0.33,
          "label": "绅宝",
          "moduleName": "saab",
          "betweenImageAndText": 3,
          "textOffsetY": 3,
          "textSize": 10,
          "cornerMark": "",
          "cornerMarkTextSize": 8,
          "cornerMarkPaddingVertical": 2,
          "cornerMarkPaddingHorizontal": 4,
          "checkTextColor": "#e9302d",
          "unCheckTextColor": "#666666",
          "isChecked": false
        }
      ]
    }
  ]
}
```
