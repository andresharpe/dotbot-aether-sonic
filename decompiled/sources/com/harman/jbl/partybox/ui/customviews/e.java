package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public class e extends RelativeLayout {

    /* renamed from: K, reason: collision with root package name */
    private static final String f42711K = "e";

    /* renamed from: E, reason: collision with root package name */
    private float f42712E;

    /* renamed from: F, reason: collision with root package name */
    private int f42713F;

    /* renamed from: G, reason: collision with root package name */
    private int f42714G;

    /* renamed from: H, reason: collision with root package name */
    private int f42715H;

    /* renamed from: I, reason: collision with root package name */
    private int f42716I;

    /* renamed from: J, reason: collision with root package name */
    private ViewOutlineProvider f42717J;

    /* loaded from: classes2.dex */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int measuredWidth;
            int measuredHeight;
            e eVar = e.this;
            if (eVar.f42715H > 0) {
                measuredWidth = e.this.f42715H;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            eVar.f42715H = measuredWidth;
            e eVar2 = e.this;
            if (eVar2.f42716I > 0) {
                measuredHeight = e.this.f42716I;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            eVar2.f42716I = measuredHeight;
            outline.setRoundRect(new Rect(e.this.f42713F, e.this.f42714G, e.this.f42713F + e.this.f42715H, e.this.f42714G + e.this.f42716I), e.this.f42712E);
        }
    }

    public e(Context context) {
        super(context);
        this.f42717J = new a();
        h();
    }

    private void h() {
        setOutlineProvider(this.f42717J);
        setClipToOutline(true);
    }

    public void i(int i4, int i5, int i6, int i7, float f4) {
        this.f42713F = i4;
        this.f42714G = i5;
        this.f42715H = i6;
        this.f42716I = i7;
        this.f42712E = f4;
        invalidateOutline();
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42717J = new a();
        h();
    }

    public e(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42717J = new a();
        h();
    }

    private e(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f42717J = new a();
        h();
    }
}
