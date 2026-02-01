package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.d0;
import kotlin.H0;

/* renamed from: androidx.core.content.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670e {
    public static final /* synthetic */ <T> T a(Context context) {
        kotlin.jvm.internal.F.p(context, "<this>");
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.f5);
        return (T) C0669d.o(context, Object.class);
    }

    public static final void b(@l3.d Context context, @d0 int i4, @l3.d int[] attrs, @l3.d X2.l<? super TypedArray, H0> block) {
        kotlin.jvm.internal.F.p(context, "<this>");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        kotlin.jvm.internal.F.p(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, attrs);
        kotlin.jvm.internal.F.o(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        block.C(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void c(@l3.d Context context, @l3.e AttributeSet attributeSet, @l3.d int[] attrs, @InterfaceC0563f int i4, @d0 int i5, @l3.d X2.l<? super TypedArray, H0> block) {
        kotlin.jvm.internal.F.p(context, "<this>");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        kotlin.jvm.internal.F.p(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i4, i5);
        kotlin.jvm.internal.F.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.C(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(Context context, AttributeSet attributeSet, int[] attrs, int i4, int i5, X2.l block, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            attributeSet = null;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        kotlin.jvm.internal.F.p(context, "<this>");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        kotlin.jvm.internal.F.p(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i4, i5);
        kotlin.jvm.internal.F.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.C(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
