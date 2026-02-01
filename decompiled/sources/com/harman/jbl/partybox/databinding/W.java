package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.ButtonSettingsCard;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class W implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39163E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ButtonSettingsCard f39164F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f39165G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ButtonSettingsCard f39166H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39167I;

    private W(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ButtonSettingsCard buttonSettingsCard, @androidx.annotation.N F1 f12, @androidx.annotation.N ButtonSettingsCard buttonSettingsCard2, @androidx.annotation.N ImageView imageView) {
        this.f39163E = constraintLayout;
        this.f39164F = buttonSettingsCard;
        this.f39165G = f12;
        this.f39166H = buttonSettingsCard2;
        this.f39167I = imageView;
    }

    @androidx.annotation.N
    public static W a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.N3;
        ButtonSettingsCard buttonSettingsCard = (ButtonSettingsCard) C2067c.a(view, i4);
        if (buttonSettingsCard != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            F1 a5 = F1.a(a4);
            i4 = j.h.oa;
            ButtonSettingsCard buttonSettingsCard2 = (ButtonSettingsCard) C2067c.a(view, i4);
            if (buttonSettingsCard2 != null) {
                i4 = j.h.jb;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    return new W((ConstraintLayout) view, buttonSettingsCard, a5, buttonSettingsCard2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static W c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static W e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41418N, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39163E;
    }
}
