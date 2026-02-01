package com.harman.jbl.cd_biz_comm.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.v;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\u0004B\u001b\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/harman/jbl/cd_biz_comm/widget/ForegroundMaskLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Lkotlin/H0;", "a", "()V", com.harman.log.b.f47574c, "", v.b.f7402d, "setMaskColor", "(Ljava/lang/Integer;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", androidx.exifinterface.media.a.U4, "Z", "shouldMask", "F", "I", "foregroundColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "G", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ForegroundMaskLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f38023G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final String f38024H = "ForegroundMaskLayout";

    /* renamed from: E, reason: collision with root package name */
    private boolean f38025E;

    /* renamed from: F, reason: collision with root package name */
    private final int f38026F;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundMaskLayout(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        this.f38025E = true;
        this.f38026F = Color.parseColor("#B3121111");
        if (this.f38025E) {
            a();
        }
    }

    public final void a() {
        this.f38025E = true;
        setForeground(new ColorDrawable(this.f38026F));
        setOnClickListener(this);
        invalidate();
    }

    public final void b() {
        this.f38025E = false;
        setForeground(null);
        setOnClickListener(null);
        invalidate();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.e View view) {
        Log.d(f38024H, "content onClick");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@l3.e MotionEvent motionEvent) {
        return this.f38025E;
    }

    public final void setMaskColor(@l3.e Integer num) {
        if (num != null) {
            setForeground(new ColorDrawable(num.intValue()));
            invalidate();
        }
    }

    public /* synthetic */ ForegroundMaskLayout(Context context, AttributeSet attributeSet, int i4, C2197u c2197u) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }
}
