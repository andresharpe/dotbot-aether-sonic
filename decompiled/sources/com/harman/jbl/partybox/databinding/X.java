package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.ColorPickerView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class X implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39188E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39189F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final CheckBox f39190G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ColorPickerView f39191H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39192I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39193J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39194K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39195L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39196M;

    private X(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N CheckBox checkBox, @androidx.annotation.N ColorPickerView colorPickerView, @androidx.annotation.N TextView textView2, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ConstraintLayout constraintLayout3) {
        this.f39188E = constraintLayout;
        this.f39189F = textView;
        this.f39190G = checkBox;
        this.f39191H = colorPickerView;
        this.f39192I = textView2;
        this.f39193J = constraintLayout2;
        this.f39194K = imageView;
        this.f39195L = imageView2;
        this.f39196M = constraintLayout3;
    }

    @androidx.annotation.N
    public static X a(@androidx.annotation.N View view) {
        int i4 = j.h.f41146B2;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.f41150C2;
            CheckBox checkBox = (CheckBox) C2067c.a(view, i4);
            if (checkBox != null) {
                i4 = j.h.f41154D2;
                ColorPickerView colorPickerView = (ColorPickerView) C2067c.a(view, i4);
                if (colorPickerView != null) {
                    i4 = j.h.f41158E2;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i4 = j.h.G4;
                        ImageView imageView = (ImageView) C2067c.a(view, i4);
                        if (imageView != null) {
                            i4 = j.h.q6;
                            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                            if (imageView2 != null) {
                                i4 = j.h.pf;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                                if (constraintLayout2 != null) {
                                    return new X(constraintLayout, textView, checkBox, colorPickerView, textView2, constraintLayout, imageView, imageView2, constraintLayout2);
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
    public static X c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static X e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41422O, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39188E;
    }
}
