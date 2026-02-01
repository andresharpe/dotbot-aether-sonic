package com.harman.jbl.partybox.ui.customviews;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public class HmPostfixThreeDotsAnimationTextView extends HmCustomFontTextView {

    /* renamed from: O, reason: collision with root package name */
    private static final long f42536O = 1500;

    /* renamed from: L, reason: collision with root package name */
    private volatile String f42537L;

    /* renamed from: M, reason: collision with root package name */
    private String[] f42538M;

    /* renamed from: N, reason: collision with root package name */
    private ValueAnimator f42539N;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            HmPostfixThreeDotsAnimationTextView.this.setText(HmPostfixThreeDotsAnimationTextView.this.f42537L + HmPostfixThreeDotsAnimationTextView.this.f42538M[intValue % HmPostfixThreeDotsAnimationTextView.this.f42538M.length]);
        }
    }

    public HmPostfixThreeDotsAnimationTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42538M = new String[]{".  ", ".. ", "..."};
        this.f42537L = getText() == null ? "" : getText().toString();
    }

    public void setString(@P String str) {
        this.f42537L = str;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        if (i4 == 0) {
            w();
            return;
        }
        ValueAnimator valueAnimator = this.f42539N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void w() {
        if (this.f42539N == null) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 3).setDuration(f42536O);
            this.f42539N = duration;
            duration.setRepeatCount(-1);
            this.f42539N.addUpdateListener(new a());
        }
        this.f42539N.start();
    }

    public HmPostfixThreeDotsAnimationTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42538M = new String[]{".  ", ".. ", "..."};
        this.f42537L = getText() == null ? "" : getText().toString();
    }

    public HmPostfixThreeDotsAnimationTextView(Context context) {
        super(context);
        this.f42538M = new String[]{".  ", ".. ", "..."};
        this.f42537L = getText() == null ? "" : getText().toString();
    }
}
