package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.widget.GroupSpeakerView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class B implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38466E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38467F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38468G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final GroupSpeakerView f38469H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38470I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38471J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38472K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38473L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38474M;

    private B(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N GroupSpeakerView groupSpeakerView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView3, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView4) {
        this.f38466E = constraintLayout;
        this.f38467F = constraintLayout2;
        this.f38468G = hmCustomFontTextView;
        this.f38469H = groupSpeakerView;
        this.f38470I = imageView;
        this.f38471J = hmCustomFontTextView2;
        this.f38472K = constraintLayout3;
        this.f38473L = hmCustomFontTextView3;
        this.f38474M = hmCustomFontTextView4;
    }

    @androidx.annotation.N
    public static B a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.f41267e3;
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
        if (hmCustomFontTextView != null) {
            i4 = j.h.r5;
            GroupSpeakerView groupSpeakerView = (GroupSpeakerView) C2067c.a(view, i4);
            if (groupSpeakerView != null) {
                i4 = j.h.q6;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = j.h.h8;
                    HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                    if (hmCustomFontTextView2 != null) {
                        i4 = j.h.V8;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                        if (constraintLayout2 != null) {
                            i4 = j.h.Nf;
                            HmCustomFontTextView hmCustomFontTextView3 = (HmCustomFontTextView) C2067c.a(view, i4);
                            if (hmCustomFontTextView3 != null) {
                                i4 = j.h.Ai;
                                HmCustomFontTextView hmCustomFontTextView4 = (HmCustomFontTextView) C2067c.a(view, i4);
                                if (hmCustomFontTextView4 != null) {
                                    return new B(constraintLayout, constraintLayout, hmCustomFontTextView, groupSpeakerView, imageView, hmCustomFontTextView2, constraintLayout2, hmCustomFontTextView3, hmCustomFontTextView4);
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
    public static B c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static B e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41562x, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38466E;
    }
}
