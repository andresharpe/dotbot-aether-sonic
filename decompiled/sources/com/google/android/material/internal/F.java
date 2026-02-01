package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class F extends ImageButton {

    /* renamed from: E, reason: collision with root package name */
    private int f32519E;

    public F(Context context) {
        this(context, null);
    }

    public final void c(int i4, boolean z3) {
        super.setVisibility(i4);
        if (z3) {
            this.f32519E = i4;
        }
    }

    public final int getUserSetVisibility() {
        return this.f32519E;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        c(i4, true);
    }

    public F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public F(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f32519E = getVisibility();
    }
}
