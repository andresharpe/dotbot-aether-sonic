package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.BatteryView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class G1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38646E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38647F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38648G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38649H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38650I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final BatteryView f38651J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final BatteryView f38652K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38653L;

    private G1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N BatteryView batteryView, @androidx.annotation.N BatteryView batteryView2, @androidx.annotation.N ImageView imageView2) {
        this.f38646E = constraintLayout;
        this.f38647F = imageView;
        this.f38648G = constraintLayout2;
        this.f38649H = textView;
        this.f38650I = linearLayout;
        this.f38651J = batteryView;
        this.f38652K = batteryView2;
        this.f38653L = imageView2;
    }

    @androidx.annotation.N
    public static G1 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41204Q0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = j.h.f41337s3;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                i4 = j.h.s8;
                LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout != null) {
                    i4 = j.h.R9;
                    BatteryView batteryView = (BatteryView) C2067c.a(view, i4);
                    if (batteryView != null) {
                        i4 = j.h.Td;
                        BatteryView batteryView2 = (BatteryView) C2067c.a(view, i4);
                        if (batteryView2 != null) {
                            i4 = j.h.sh;
                            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                            if (imageView2 != null) {
                                return new G1(constraintLayout, imageView, constraintLayout, textView, linearLayout, batteryView, batteryView2, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static G1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static G1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41524n1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38646E;
    }
}
