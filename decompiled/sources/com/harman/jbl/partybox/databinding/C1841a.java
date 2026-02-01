package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmAppImageView;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1841a implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f39310E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f39311F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final CheckBox f39312G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39313H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final CheckBox f39314I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmAppImageView f39315J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f39316K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final CheckBox f39317L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39318M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f39319N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39320O;

    private C1841a(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N RelativeLayout relativeLayout, @androidx.annotation.N CheckBox checkBox, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N CheckBox checkBox2, @androidx.annotation.N HmAppImageView hmAppImageView, @androidx.annotation.N RelativeLayout relativeLayout2, @androidx.annotation.N CheckBox checkBox3, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N RelativeLayout relativeLayout3, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView3) {
        this.f39310E = linearLayout;
        this.f39311F = relativeLayout;
        this.f39312G = checkBox;
        this.f39313H = hmCustomFontTextView;
        this.f39314I = checkBox2;
        this.f39315J = hmAppImageView;
        this.f39316K = relativeLayout2;
        this.f39317L = checkBox3;
        this.f39318M = hmCustomFontTextView2;
        this.f39319N = relativeLayout3;
        this.f39320O = hmCustomFontTextView3;
    }

    @androidx.annotation.N
    public static C1841a a(@androidx.annotation.N View view) {
        int i4 = j.h.f41240Z0;
        RelativeLayout relativeLayout = (RelativeLayout) C2067c.a(view, i4);
        if (relativeLayout != null) {
            i4 = j.h.f41245a1;
            CheckBox checkBox = (CheckBox) C2067c.a(view, i4);
            if (checkBox != null) {
                i4 = j.h.f41250b1;
                HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView != null) {
                    i4 = j.h.f41306m2;
                    CheckBox checkBox2 = (CheckBox) C2067c.a(view, i4);
                    if (checkBox2 != null) {
                        i4 = j.h.f41178J2;
                        HmAppImageView hmAppImageView = (HmAppImageView) C2067c.a(view, i4);
                        if (hmAppImageView != null) {
                            i4 = j.h.o4;
                            RelativeLayout relativeLayout2 = (RelativeLayout) C2067c.a(view, i4);
                            if (relativeLayout2 != null) {
                                i4 = j.h.p4;
                                CheckBox checkBox3 = (CheckBox) C2067c.a(view, i4);
                                if (checkBox3 != null) {
                                    i4 = j.h.q4;
                                    HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                                    if (hmCustomFontTextView2 != null) {
                                        i4 = j.h.Wg;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) C2067c.a(view, i4);
                                        if (relativeLayout3 != null) {
                                            i4 = j.h.vh;
                                            HmCustomFontTextView hmCustomFontTextView3 = (HmCustomFontTextView) C2067c.a(view, i4);
                                            if (hmCustomFontTextView3 != null) {
                                                return new C1841a((LinearLayout) view, relativeLayout, checkBox, hmCustomFontTextView, checkBox2, hmAppImageView, relativeLayout2, checkBox3, hmCustomFontTextView2, relativeLayout3, hmCustomFontTextView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1841a c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1841a e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41470a, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f39310E;
    }
}
