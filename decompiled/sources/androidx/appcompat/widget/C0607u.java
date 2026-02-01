package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import d.C2042a;

/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0607u extends RatingBar {

    /* renamed from: E, reason: collision with root package name */
    private final C0606t f6321E;

    public C0607u(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap b4 = this.f6321E.b();
        if (b4 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b4.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }

    public C0607u(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49126I2);
    }

    public C0607u(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b0.a(this, getContext());
        C0606t c0606t = new C0606t(this);
        this.f6321E = c0606t;
        c0606t.c(attributeSet, i4);
    }
}
