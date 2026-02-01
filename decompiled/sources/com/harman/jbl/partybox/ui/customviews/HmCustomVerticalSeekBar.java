package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.C0609w;

/* loaded from: classes2.dex */
public class HmCustomVerticalSeekBar extends C0609w {
    public HmCustomVerticalSeekBar(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0609w, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i5, i4);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i5, i4, i7, i6);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            setProgress(getMax() - ((int) ((getMax() * motionEvent.getY()) / getHeight())));
            onSizeChanged(getWidth(), getHeight(), 0, 0);
        }
        return true;
    }

    public HmCustomVerticalSeekBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }

    public HmCustomVerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
