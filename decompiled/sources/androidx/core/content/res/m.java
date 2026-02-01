package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.InterfaceC0560c;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.W;
import androidx.annotation.e0;
import androidx.annotation.r;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class m {
    private static final void a(TypedArray typedArray, @e0 int i4) {
        if (typedArray.hasValue(i4)) {
        } else {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getBoolean(i4, false);
    }

    @InterfaceC0569l
    public static final int c(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getColor(i4, 0);
    }

    @l3.d
    public static final ColorStateList d(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        ColorStateList colorStateList = typedArray.getColorStateList(i4);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float e(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getDimension(i4, 0.0f);
    }

    @r
    public static final int f(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getDimensionPixelOffset(i4, 0);
    }

    @r
    public static final int g(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getDimensionPixelSize(i4, 0);
    }

    @l3.d
    public static final Drawable h(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        Drawable drawable = typedArray.getDrawable(i4);
        F.m(drawable);
        return drawable;
    }

    public static final float i(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getFloat(i4, 0.0f);
    }

    @l3.d
    @W(26)
    public static final Typeface j(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return l.a(typedArray, i4);
    }

    public static final int k(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getInt(i4, 0);
    }

    public static final int l(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getInteger(i4, 0);
    }

    @InterfaceC0560c
    public static final int m(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        return typedArray.getResourceId(i4, 0);
    }

    @l3.d
    public static final String n(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        String string = typedArray.getString(i4);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @l3.d
    public static final CharSequence[] o(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        CharSequence[] textArray = typedArray.getTextArray(i4);
        F.o(textArray, "getTextArray(index)");
        return textArray;
    }

    @l3.d
    public static final CharSequence p(@l3.d TypedArray typedArray, @e0 int i4) {
        F.p(typedArray, "<this>");
        a(typedArray, i4);
        CharSequence text = typedArray.getText(i4);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R q(@l3.d TypedArray typedArray, @l3.d X2.l<? super TypedArray, ? extends R> block) {
        F.p(typedArray, "<this>");
        F.p(block, "block");
        R C3 = block.C(typedArray);
        typedArray.recycle();
        return C3;
    }
}
