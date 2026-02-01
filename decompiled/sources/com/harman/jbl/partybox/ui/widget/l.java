package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public class l extends RelativeLayout {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f46131G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final String f46132H = "ForegroundMaskRelativeLayout";

    /* renamed from: E, reason: collision with root package name */
    private boolean f46133E;

    /* renamed from: F, reason: collision with root package name */
    private final int f46134F;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@l3.d Context context) {
        super(context);
        F.p(context, "context");
        this.f46134F = Color.parseColor("#B3121111");
        if (this.f46133E) {
            a();
        }
    }

    public final void a() {
        this.f46133E = true;
        setForeground(new ColorDrawable(this.f46134F));
        invalidate();
    }

    public final void b() {
        this.f46133E = false;
        setForeground(null);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@l3.e MotionEvent motionEvent) {
        return this.f46133E;
    }

    public final void setMaskColor(@l3.e Integer num) {
        if (num != null) {
            setForeground(new ColorDrawable(num.intValue()));
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        this.f46134F = Color.parseColor("#B3121111");
        if (this.f46133E) {
            a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        F.p(context, "context");
        this.f46134F = Color.parseColor("#B3121111");
        if (this.f46133E) {
            a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        F.p(context, "context");
        this.f46134F = Color.parseColor("#B3121111");
        if (this.f46133E) {
            a();
        }
    }
}
