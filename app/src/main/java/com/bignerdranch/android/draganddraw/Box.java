package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by Administrator on 2017/5/29/029.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF f) {
        mOrigin = f;
        mCurrent = f;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public void setOrigin(PointF origin) {
        mOrigin = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }
}
