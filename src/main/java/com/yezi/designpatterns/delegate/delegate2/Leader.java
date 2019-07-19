package com.yezi.designpatterns.delegate.delegate2;

import com.yezi.designpatterns.delegate.delegate2.impl.ExcuterA;
import com.yezi.designpatterns.delegate.delegate2.impl.ExcuterB;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IExcuter {
    private Map<String,IExcuter> targets = new HashMap<String,IExcuter>();
    public Leader(){
        targets.put("登录",new ExcuterA());
        targets.put("加密",new ExcuterB());
    }
    @Override
    public void excute(String commend) {
        targets.get(commend).excute(commend);
    }
}
