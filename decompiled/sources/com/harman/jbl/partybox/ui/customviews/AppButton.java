package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.P;
import androidx.appcompat.widget.C0594g;

/* loaded from: classes2.dex */
public class AppButton extends C0594g {
    public AppButton(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        setAlpha(1.0f);
                        setScaleX(1.0f);
                        setScaleY(1.0f);
                    }
                } else {
                    setAlpha(0.8f);
                    setScaleX(0.97f);
                    setScaleY(0.97f);
                }
            } else {
                setAlpha(1.0f);
                setScaleX(1.0f);
                setScaleY(1.0f);
            }
        } else {
            setAlpha(0.8f);
            setScaleX(0.97f);
            setScaleY(0.97f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public AppButton(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppButton(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
