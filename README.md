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

  "selectTab": 0,
  "pattingTop": 8,
  "pattingBottom": 6,
  "height": 60,
  "reserveAreaHeight": 10,
  "backgroundColor": "#FFFFFF",
  "cornerMarkByConfig": true,
  "tabs": [
    {
      "tabPermissions": [
        0
      ],
      "tabItems": [
        {
          "fragmentIndex": 0,
          "bigImage": false,
          "imageWidth": 23,
          "imageHeight": 23,
          "pageUrl": "",
          "checkedUrl": "https://pics1.baidu.com/feed/77c6a7efce1b9d1681608e21b0371a868d546439.jpeg",
          "unCheckedUrl": "https://pics0.baidu.com/feed/77c6a7efce1b9d16cbf6fe3baa371a868d5464ad.jpeg",
          "weight": 0.33,
          "label": "宝马",
          "moduleName": "bmw",
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
