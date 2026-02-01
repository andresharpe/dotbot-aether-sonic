package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.k0;
import androidx.core.view.C0823k0;
import java.io.IOException;
import m.C2356a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.C2394a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f12337a = new ThreadLocal<>();

    private c() {
    }

    @N
    public static ColorStateList a(@N Resources resources, @N XmlPullParser xmlPullParser, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @N
    public static ColorStateList b(@N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @N
    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f12337a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    @P
    public static ColorStateList d(@N Resources resources, @k0 int i4, @P Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
            return null;
        }
    }

    private static ColorStateList e(@N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f4;
        Resources resources2 = resources;
        int i4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray h4 = h(resources2, theme, attributeSet, C2356a.j.f55006d);
                int resourceId = h4.getResourceId(C2356a.j.f55007e, -1);
                if (resourceId != -1 && !f(resources2, resourceId)) {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = h4.getColor(C2356a.j.f55007e, -65281);
                    }
                } else {
                    color = h4.getColor(C2356a.j.f55007e, -65281);
                }
                float f5 = 1.0f;
                if (h4.hasValue(C2356a.j.f55008f)) {
                    f5 = h4.getFloat(C2356a.j.f55008f, 1.0f);
                } else if (h4.hasValue(C2356a.j.f55010h)) {
                    f5 = h4.getFloat(C2356a.j.f55010h, 1.0f);
                }
                if (Build.VERSION.SDK_INT >= 31 && h4.hasValue(C2356a.j.f55009g)) {
                    f4 = h4.getFloat(C2356a.j.f55009g, -1.0f);
                } else {
                    f4 = h4.getFloat(C2356a.j.f55011i, -1.0f);
                }
                h4.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i6 = 0;
                for (int i7 = 0; i7 < attributeCount; i7++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C2356a.C0511a.f54842a && attributeNameResource != C2356a.C0511a.f54854m) {
                        int i8 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i6] = attributeNameResource;
                        i6 = i8;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i6);
                iArr2 = h.a(iArr2, i5, g(color, f5, f4));
                iArr = (int[][]) h.c(iArr, i5, trimStateSet);
                i5++;
            }
            i4 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i5];
        int[][] iArr5 = new int[i5];
        System.arraycopy(iArr2, 0, iArr4, 0, i5);
        System.arraycopy(iArr, 0, iArr5, 0, i5);
        return new ColorStateList(iArr5, iArr4);
    }

    private static boolean f(@N Resources resources, @InterfaceC0571n int i4) {
        TypedValue c4 = c();
        resources.getValue(i4, c4, true);
        int i5 = c4.type;
        if (i5 >= 28 && i5 <= 31) {
            return true;
        }
        return false;
    }

    @InterfaceC0569l
    private static int g(@InterfaceC0569l int i4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 100.0d) float f5) {
        boolean z3;
        if (f5 >= 0.0f && f5 <= 100.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (f4 == 1.0f && !z3) {
            return i4;
        }
        int e4 = C2394a.e((int) ((Color.alpha(i4) * f4) + 0.5f), 0, 255);
        if (z3) {
            a c4 = a.c(i4);
            i4 = a.p(c4.j(), c4.i(), f5);
        }
        return (i4 & C0823k0.f13588s) | (e4 << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
