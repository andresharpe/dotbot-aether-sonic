package com.google.android.material.textview;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.e0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import d1.C2044a;

/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@N Context context) {
        this(context, null);
    }

    private void u(@N Resources.Theme theme, int i4) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i4, a.o.zm);
        int x3 = x(getContext(), obtainStyledAttributes, a.o.Bm, a.o.Cm);
        obtainStyledAttributes.recycle();
        if (x3 >= 0) {
            setLineHeight(x3);
        }
    }

    private static boolean v(Context context) {
        return b.b(context, a.c.hg, true);
    }

    private static int w(@N Resources.Theme theme, @P AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.Dm, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.Em, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int x(@N Context context, @N TypedArray typedArray, @N @e0 int... iArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length && i4 < 0; i5++) {
            i4 = c.d(context, typedArray, iArr[i5], -1);
        }
        return i4;
    }

    private static boolean y(@N Context context, @N Resources.Theme theme, @P AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.Dm, i4, i5);
        int x3 = x(context, obtainStyledAttributes, a.o.Fm, a.o.Gm);
        obtainStyledAttributes.recycle();
        if (x3 != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@N Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (v(context)) {
            u(context.getTheme(), i4);
        }
    }

    public MaterialTextView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public MaterialTextView(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(C2044a.c(context, attributeSet, i4, i5), attributeSet, i4);
        int w3;
        Context context2 = getContext();
        if (v(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (y(context2, theme, attributeSet, i4, i5) || (w3 = w(theme, attributeSet, i4, i5)) == -1) {
                return;
            }
            u(theme, w3);
        }
    }
}
