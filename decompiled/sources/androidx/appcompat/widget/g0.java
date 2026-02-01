package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.i;
import e.C2046a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6202a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f6203b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f6204c;

    @androidx.annotation.W(21)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC0577u
        static int b(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
        }
    }

    private g0(Context context, TypedArray typedArray) {
        this.f6202a = context;
        this.f6203b = typedArray;
    }

    public static g0 E(Context context, int i4, int[] iArr) {
        return new g0(context, context.obtainStyledAttributes(i4, iArr));
    }

    public static g0 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g0 G(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public boolean A(int i4, TypedValue typedValue) {
        return this.f6203b.getValue(i4, typedValue);
    }

    public TypedArray B() {
        return this.f6203b;
    }

    public boolean C(int i4) {
        return this.f6203b.hasValue(i4);
    }

    public int D() {
        return this.f6203b.length();
    }

    public TypedValue H(int i4) {
        return this.f6203b.peekValue(i4);
    }

    public void I() {
        this.f6203b.recycle();
    }

    public boolean a(int i4, boolean z3) {
        return this.f6203b.getBoolean(i4, z3);
    }

    @androidx.annotation.W(21)
    public int b() {
        return a.a(this.f6203b);
    }

    public int c(int i4, int i5) {
        return this.f6203b.getColor(i4, i5);
    }

    public ColorStateList d(int i4) {
        int resourceId;
        ColorStateList a4;
        if (this.f6203b.hasValue(i4) && (resourceId = this.f6203b.getResourceId(i4, 0)) != 0 && (a4 = C2046a.a(this.f6202a, resourceId)) != null) {
            return a4;
        }
        return this.f6203b.getColorStateList(i4);
    }

    public float e(int i4, float f4) {
        return this.f6203b.getDimension(i4, f4);
    }

    public int f(int i4, int i5) {
        return this.f6203b.getDimensionPixelOffset(i4, i5);
    }

    public int g(int i4, int i5) {
        return this.f6203b.getDimensionPixelSize(i4, i5);
    }

    public Drawable h(int i4) {
        int resourceId;
        if (this.f6203b.hasValue(i4) && (resourceId = this.f6203b.getResourceId(i4, 0)) != 0) {
            return C2046a.b(this.f6202a, resourceId);
        }
        return this.f6203b.getDrawable(i4);
    }

    public Drawable i(int i4) {
        int resourceId;
        if (this.f6203b.hasValue(i4) && (resourceId = this.f6203b.getResourceId(i4, 0)) != 0) {
            return C0599l.b().d(this.f6202a, resourceId, true);
        }
        return null;
    }

    public float j(int i4, float f4) {
        return this.f6203b.getFloat(i4, f4);
    }

    @androidx.annotation.P
    public Typeface k(@androidx.annotation.e0 int i4, int i5, @androidx.annotation.P i.g gVar) {
        int resourceId = this.f6203b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f6204c == null) {
            this.f6204c = new TypedValue();
        }
        return androidx.core.content.res.i.k(this.f6202a, resourceId, this.f6204c, i5, gVar);
    }

    public float l(int i4, int i5, int i6, float f4) {
        return this.f6203b.getFraction(i4, i5, i6, f4);
    }

    public int m(int i4) {
        return this.f6203b.getIndex(i4);
    }

    public int n() {
        return this.f6203b.getIndexCount();
    }

    public int o(int i4, int i5) {
        return this.f6203b.getInt(i4, i5);
    }

    public int p(int i4, int i5) {
        return this.f6203b.getInteger(i4, i5);
    }

    public int q(int i4, int i5) {
        return this.f6203b.getLayoutDimension(i4, i5);
    }

    public int r(int i4, String str) {
        return this.f6203b.getLayoutDimension(i4, str);
    }

    public String s(int i4) {
        return this.f6203b.getNonResourceString(i4);
    }

    public String t() {
        return this.f6203b.getPositionDescription();
    }

    public int u(int i4, int i5) {
        return this.f6203b.getResourceId(i4, i5);
    }

    public Resources v() {
        return this.f6203b.getResources();
    }

    public String w(int i4) {
        return this.f6203b.getString(i4);
    }

    public CharSequence x(int i4) {
        return this.f6203b.getText(i4);
    }

    public CharSequence[] y(int i4) {
        return this.f6203b.getTextArray(i4);
    }

    public int z(int i4) {
        return a.b(this.f6203b, i4);
    }
}
