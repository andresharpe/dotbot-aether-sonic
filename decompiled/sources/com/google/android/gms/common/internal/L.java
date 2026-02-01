package com.google.android.gms.common.internal;

import H0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* loaded from: classes.dex */
public final class L extends Button {
    public L(Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int b(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return i7;
                }
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown color scheme: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
            return i6;
        }
        return i5;
    }

    public final void a(Resources resources, int i4, int i5) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i6 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i6);
        setMinWidth(i6);
        int i7 = a.c.f849b;
        int i8 = a.c.f854g;
        int b4 = b(i5, i7, i8, i8);
        int i9 = a.c.f858k;
        int i10 = a.c.f863p;
        int b5 = b(i5, i9, i10, i10);
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown button size: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            b4 = b5;
        }
        Drawable r4 = androidx.core.graphics.drawable.d.r(resources.getDrawable(b4));
        androidx.core.graphics.drawable.d.o(r4, resources.getColorStateList(a.b.f847k));
        androidx.core.graphics.drawable.d.p(r4, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r4);
        int i11 = a.b.f837a;
        int i12 = a.b.f842f;
        setTextColor((ColorStateList) C1285y.l(resources.getColorStateList(b(i5, i11, i12, i12))));
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    setText((CharSequence) null);
                } else {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("Unknown button size: ");
                    sb2.append(i4);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                setText(resources.getString(a.e.f894q));
            }
        } else {
            setText(resources.getString(a.e.f893p));
        }
        setTransformationMethod(null);
        if (com.google.android.gms.common.util.l.k(getContext())) {
            setGravity(19);
        }
    }
}
