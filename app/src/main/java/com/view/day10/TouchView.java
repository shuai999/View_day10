package com.view.day10;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Email 2185134304@qq.com
 * Created by JackChen on 2018/2/4.
 * Version 1.0
 * Description:
 */
public class TouchView extends View {
    public TouchView(Context context) {
        this(context, null);
    }

    public TouchView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TouchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TAG" , "onTouchEvent -> "+event.getAction()) ;
        return super.onTouchEvent(event);
    }


    /**
     *  复写 dispatchTouchEvent作用就是，在onTouchEvent()方法中可以返回任何值，return false、return true、return super.onTouchEvent(event)都是可以的
     *  但是在 dispatchTouchEvent必须返回true，并且添加super.dispatchTouchEvent(event) ,这样的话现象就是现象一
     * @param event
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        super.dispatchTouchEvent(event) ;
        Log.e("TAG" , "dispatchTouchEvent -> "+event.getAction()) ;
        return true;
    }
}
