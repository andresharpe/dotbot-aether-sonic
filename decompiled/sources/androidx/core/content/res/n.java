package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.InterfaceC0560c;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.e0;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12382a = "http://schemas.android.com/apk/res/android";

    private n() {
    }

    public static int a(@N Context context, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i4;
        }
        return i5;
    }

    public static boolean b(@N TypedArray typedArray, @e0 int i4, @e0 int i5, boolean z3) {
        return typedArray.getBoolean(i4, typedArray.getBoolean(i5, z3));
    }

    @P
    public static Drawable c(@N TypedArray typedArray, @e0 int i4, @e0 int i5) {
        Drawable drawable = typedArray.getDrawable(i4);
        if (drawable == null) {
            return typedArray.getDrawable(i5);
        }
        return drawable;
    }

    public static int d(@N TypedArray typedArray, @e0 int i4, @e0 int i5, int i6) {
        return typedArray.getInt(i4, typedArray.getInt(i5, i6));
    }

    public static boolean e(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @N String str, @e0 int i4, boolean z3) {
        if (!r(xmlPullParser, str)) {
            return z3;
        }
        return typedArray.getBoolean(i4, z3);
    }

    @InterfaceC0569l
    public static int f(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @N String str, @e0 int i4, @InterfaceC0569l int i5) {
        if (!r(xmlPullParser, str)) {
            return i5;
        }
        return typedArray.getColor(i4, i5);
    }

    @P
    public static ColorStateList g(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @P Resources.Theme theme, @N String str, @e0 int i4) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i5 = typedValue.type;
            if (i5 != 2) {
                if (i5 >= 28 && i5 <= 31) {
                    return h(typedValue);
                }
                return c.d(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i4 + ": " + typedValue);
        }
        return null;
    }

    @N
    private static ColorStateList h(@N TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @P Resources.Theme theme, @N String str, @e0 int i4, @InterfaceC0569l int i5) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i6 = typedValue.type;
            if (i6 >= 28 && i6 <= 31) {
                return d.b(typedValue.data);
            }
            d g4 = d.g(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            if (g4 != null) {
                return g4;
            }
        }
        return d.b(i5);
    }

    public static float j(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @N String str, @e0 int i4, float f4) {
        if (!r(xmlPullParser, str)) {
            return f4;
        }
        return typedArray.getFloat(i4, f4);
    }

    public static int k(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @N String str, @e0 int i4, int i5) {
        if (!r(xmlPullParser, str)) {
            return i5;
        }
        return typedArray.getInt(i4, i5);
    }

    @InterfaceC0560c
    public static int l(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @N String str, @e0 int i4, @InterfaceC0560c int i5) {
        if (!r(xmlPullParser, str)) {
            return i5;
        }
        return typedArray.getResourceId(i4, i5);
    }

    @P
    public static String m(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @N String str, @e0 int i4) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i4);
    }

    @InterfaceC0560c
    public static int n(@N TypedArray typedArray, @e0 int i4, @e0 int i5, @InterfaceC0560c int i6) {
        return typedArray.getResourceId(i4, typedArray.getResourceId(i5, i6));
    }

    @P
    public static String o(@N TypedArray typedArray, @e0 int i4, @e0 int i5) {
        String string = typedArray.getString(i4);
        if (string == null) {
            return typedArray.getString(i5);
        }
        return string;
    }

    @P
    public static CharSequence p(@N TypedArray typedArray, @e0 int i4, @e0 int i5) {
        CharSequence text = typedArray.getText(i4);
        if (text == null) {
            return typedArray.getText(i5);
        }
        return text;
    }

    @P
    public static CharSequence[] q(@N TypedArray typedArray, @e0 int i4, @e0 int i5) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        if (textArray == null) {
            return typedArray.getTextArray(i5);
        }
        return textArray;
    }

    public static boolean r(@N XmlPullParser xmlPullParser, @N String str) {
        if (xmlPullParser.getAttributeValue(f12382a, str) != null) {
            return true;
        }
        return false;
    }

    @N
    public static TypedArray s(@N Resources resources, @P Resources.Theme theme, @N AttributeSet attributeSet, @N int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @P
    public static TypedValue t(@N TypedArray typedArray, @N XmlPullParser xmlPullParser, @N String str, int i4) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i4);
    }
}
