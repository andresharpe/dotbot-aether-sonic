package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public class HmAppImageView extends AppCompatImageView {

    /* renamed from: H, reason: collision with root package name */
    private static final String f42491H = "HmAppImageView";

    public HmAppImageView(@N Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@N MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        setAlpha(1.0f);
                    }
                } else {
                    setAlpha(0.5f);
                }
            } else {
                setAlpha(1.0f);
            }
        } else {
            setAlpha(0.5f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public HmAppImageView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HmAppImageView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
