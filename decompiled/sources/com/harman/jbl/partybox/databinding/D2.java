package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.BatteryView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class D2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38548E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38549F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38550G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38551H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38552I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final BatteryView f38553J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final BatteryView f38554K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38555L;

    private D2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N BatteryView batteryView, @androidx.annotation.N BatteryView batteryView2, @androidx.annotation.N TextView textView) {
        this.f38548E = constraintLayout;
        this.f38549F = constraintLayout2;
        this.f38550G = imageView;
        this.f38551H = imageView2;
        this.f38552I = imageView3;
        this.f38553J = batteryView;
        this.f38554K = batteryView2;
        this.f38555L = textView;
    }

    @androidx.annotation.N
    public static D2 a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.r7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.s7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.B7;
                ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                if (imageView3 != null) {
                    i4 = j.h.Ua;
                    BatteryView batteryView = (BatteryView) C2067c.a(view, i4);
                    if (batteryView != null) {
                        i4 = j.h.Va;
                        BatteryView batteryView2 = (BatteryView) C2067c.a(view, i4);
                        if (batteryView2 != null) {
                            i4 = j.h.Ai;
                            TextView textView = (TextView) C2067c.a(view, i4);
                            if (textView != null) {
                                return new D2(constraintLayout, constraintLayout, imageView, imageView2, imageView3, batteryView, batteryView2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static D2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static D2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41460X1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38548E;
    }
}
