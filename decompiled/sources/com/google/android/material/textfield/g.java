package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0823k0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class g {
    private g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@N TextInputLayout textInputLayout, @N CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.d.r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                androidx.core.graphics.drawable.d.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            }
            if (mode != null) {
                androidx.core.graphics.drawable.d.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static int[] b(@N TextInputLayout textInputLayout, @N CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@N TextInputLayout textInputLayout, @N CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
            androidx.core.graphics.drawable.d.o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private static void d(@N CheckableImageButton checkableImageButton, @P View.OnLongClickListener onLongClickListener) {
        boolean z3;
        boolean K02 = C0823k0.K0(checkableImageButton);
        boolean z4 = false;
        int i4 = 1;
        if (onLongClickListener != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (K02 || z3) {
            z4 = true;
        }
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(K02);
        checkableImageButton.setPressable(K02);
        checkableImageButton.setLongClickable(z3);
        if (!z4) {
            i4 = 2;
        }
        C0823k0.R1(checkableImageButton, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(@N CheckableImageButton checkableImageButton, @P View.OnClickListener onClickListener, @P View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        d(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(@N CheckableImageButton checkableImageButton, @P View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d(checkableImageButton, onLongClickListener);
    }
}
