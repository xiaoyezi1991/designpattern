package com.yezi.designpatterns.proxy.interfaces.impl;

import com.yezi.designpatterns.proxy.interfaces.Star;

public class RealStar  implements Star {
    @Override
    public void sing() {
        System.out.println("高歌一曲！！！");
    }
}
