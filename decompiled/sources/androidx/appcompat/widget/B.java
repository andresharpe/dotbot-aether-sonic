package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0823k0;
import d.C2042a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class B {

    /* renamed from: l, reason: collision with root package name */
    private static final String f5622l = "ACTVAutoSizeHelper";

    /* renamed from: n, reason: collision with root package name */
    private static final int f5624n = 12;

    /* renamed from: o, reason: collision with root package name */
    private static final int f5625o = 112;

    /* renamed from: p, reason: collision with root package name */
    private static final int f5626p = 1;

    /* renamed from: s, reason: collision with root package name */
    static final float f5629s = -1.0f;

    /* renamed from: t, reason: collision with root package name */
    private static final int f5630t = 1048576;

    /* renamed from: a, reason: collision with root package name */
    private int f5631a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5632b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f5633c = f5629s;

    /* renamed from: d, reason: collision with root package name */
    private float f5634d = f5629s;

    /* renamed from: e, reason: collision with root package name */
    private float f5635e = f5629s;

    /* renamed from: f, reason: collision with root package name */
    private int[] f5636f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f5637g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f5638h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.N
    private final TextView f5639i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f5640j;

    /* renamed from: k, reason: collision with root package name */
    private final f f5641k;

    /* renamed from: m, reason: collision with root package name */
    private static final RectF f5623m = new RectF();

    /* renamed from: q, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f5627q = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f5628r = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(16)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        @InterfaceC0577u
        @androidx.annotation.N
        static StaticLayout a(@androidx.annotation.N CharSequence charSequence, @androidx.annotation.N Layout.Alignment alignment, int i4, @androidx.annotation.N TextView textView, @androidx.annotation.N TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i4, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @InterfaceC0577u
        static int b(@androidx.annotation.N TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(18)
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        @InterfaceC0577u
        static boolean a(@androidx.annotation.N View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(23)
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        @InterfaceC0577u
        @androidx.annotation.N
        static StaticLayout a(@androidx.annotation.N CharSequence charSequence, @androidx.annotation.N Layout.Alignment alignment, int i4, int i5, @androidx.annotation.N TextView textView, @androidx.annotation.N TextPaint textPaint, @androidx.annotation.N f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i4);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i5 == -1) {
                i5 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i5);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w(B.f5622l, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    @androidx.annotation.W(23)
    /* loaded from: classes.dex */
    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.B.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) B.p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.B.d, androidx.appcompat.widget.B.f
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.B.f
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {
        f() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) B.p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(@androidx.annotation.N TextView textView) {
        this.f5639i = textView;
        this.f5640j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5641k = new e();
        } else {
            this.f5641k = new d();
        }
    }

    private boolean A(int i4, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f5639i.getText();
        TransformationMethod transformationMethod = this.f5639i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f5639i)) != null) {
            text = transformation;
        }
        int b4 = a.b(this.f5639i);
        o(i4);
        StaticLayout e4 = e(text, (Layout.Alignment) p(this.f5639i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b4);
        if ((b4 != -1 && (e4.getLineCount() > b4 || e4.getLineEnd(e4.getLineCount() - 1) != text.length())) || e4.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    private boolean B() {
        return !(this.f5639i instanceof C0600m);
    }

    private void C(float f4, float f5, float f6) throws IllegalArgumentException {
        if (f4 > 0.0f) {
            if (f5 > f4) {
                if (f6 > 0.0f) {
                    this.f5631a = 1;
                    this.f5634d = f4;
                    this.f5635e = f5;
                    this.f5633c = f6;
                    this.f5637g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
    }

    private static <T> T a(@androidx.annotation.N Object obj, @androidx.annotation.N String str, @androidx.annotation.N T t3) {
        try {
            Field m4 = m(str);
            if (m4 == null) {
                return t3;
            }
            return (T) m4.get(obj);
        } catch (IllegalAccessException e4) {
            Log.w(f5622l, "Failed to access TextView#" + str + " member", e4);
            return t3;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f5631a = 0;
        this.f5634d = f5629s;
        this.f5635e = f5629s;
        this.f5633c = f5629s;
        this.f5636f = new int[0];
        this.f5632b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i4) {
        return new StaticLayout(charSequence, this.f5638h, i4, alignment, ((Float) a(this.f5639i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f5639i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f5639i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private int g(RectF rectF) {
        int length = this.f5636f.length;
        if (length != 0) {
            int i4 = 1;
            int i5 = length - 1;
            int i6 = 0;
            while (i4 <= i5) {
                int i7 = (i4 + i5) / 2;
                if (A(this.f5636f[i7], rectF)) {
                    int i8 = i7 + 1;
                    i6 = i4;
                    i4 = i8;
                } else {
                    i6 = i7 - 1;
                    i5 = i6;
                }
            }
            return this.f5636f[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @androidx.annotation.P
    private static Field m(@androidx.annotation.N String str) {
        try {
            Field field = f5628r.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f5628r.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e4) {
            Log.w(f5622l, "Failed to access TextView#" + str + " member", e4);
            return null;
        }
    }

    @androidx.annotation.P
    private static Method n(@androidx.annotation.N String str) {
        try {
            Method method = f5627q.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f5627q.put(str, method);
            }
            return method;
        } catch (Exception e4) {
            Log.w(f5622l, "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    static <T> T p(@androidx.annotation.N Object obj, @androidx.annotation.N String str, @androidx.annotation.N T t3) {
        try {
            return (T) n(str).invoke(obj, new Object[0]);
        } catch (Exception e4) {
            Log.w(f5622l, "Failed to invoke TextView#" + str + "() method", e4);
            return t3;
        }
    }

    private void v(float f4) {
        if (f4 != this.f5639i.getPaint().getTextSize()) {
            this.f5639i.getPaint().setTextSize(f4);
            boolean a4 = b.a(this.f5639i);
            if (this.f5639i.getLayout() != null) {
                this.f5632b = false;
                try {
                    Method n4 = n("nullLayouts");
                    if (n4 != null) {
                        n4.invoke(this.f5639i, new Object[0]);
                    }
                } catch (Exception e4) {
                    Log.w(f5622l, "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (!a4) {
                    this.f5639i.requestLayout();
                } else {
                    this.f5639i.forceLayout();
                }
                this.f5639i.invalidate();
            }
        }
    }

    private boolean x() {
        if (B() && this.f5631a == 1) {
            if (!this.f5637g || this.f5636f.length == 0) {
                int floor = ((int) Math.floor((this.f5635e - this.f5634d) / this.f5633c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round(this.f5634d + (i4 * this.f5633c));
                }
                this.f5636f = c(iArr);
            }
            this.f5632b = true;
        } else {
            this.f5632b = false;
        }
        return this.f5632b;
    }

    private void y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArray.getDimensionPixelSize(i4, -1);
            }
            this.f5636f = c(iArr);
            z();
        }
    }

    private boolean z() {
        boolean z3;
        if (this.f5636f.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f5637g = z3;
        if (z3) {
            this.f5631a = 1;
            this.f5634d = r0[0];
            this.f5635e = r0[r1 - 1];
            this.f5633c = f5629s;
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void b() {
        int measuredWidth;
        if (!q()) {
            return;
        }
        if (this.f5632b) {
            if (this.f5639i.getMeasuredHeight() > 0 && this.f5639i.getMeasuredWidth() > 0) {
                if (this.f5641k.b(this.f5639i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f5639i.getMeasuredWidth() - this.f5639i.getTotalPaddingLeft()) - this.f5639i.getTotalPaddingRight();
                }
                int height = (this.f5639i.getHeight() - this.f5639i.getCompoundPaddingBottom()) - this.f5639i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f5623m;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float g4 = g(rectF);
                            if (g4 != this.f5639i.getTextSize()) {
                                w(0, g4);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f5632b = true;
    }

    @androidx.annotation.i0
    @androidx.annotation.N
    StaticLayout e(@androidx.annotation.N CharSequence charSequence, @androidx.annotation.N Layout.Alignment alignment, int i4, int i5) {
        return c.a(charSequence, alignment, i4, i5, this.f5639i, this.f5638h, this.f5641k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int h() {
        return Math.round(this.f5635e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int i() {
        return Math.round(this.f5634d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int j() {
        return Math.round(this.f5633c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] k() {
        return this.f5636f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int l() {
        return this.f5631a;
    }

    @androidx.annotation.i0
    void o(int i4) {
        TextPaint textPaint = this.f5638h;
        if (textPaint == null) {
            this.f5638h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f5638h.set(this.f5639i.getPaint());
        this.f5638h.setTextSize(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean q() {
        if (B() && this.f5631a != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(@androidx.annotation.P AttributeSet attributeSet, int i4) {
        float f4;
        float f5;
        float f6;
        int resourceId;
        TypedArray obtainStyledAttributes = this.f5640j.obtainStyledAttributes(attributeSet, C2042a.m.f50174v0, i4, 0);
        TextView textView = this.f5639i;
        C0823k0.z1(textView, textView.getContext(), C2042a.m.f50174v0, attributeSet, obtainStyledAttributes, i4, 0);
        if (obtainStyledAttributes.hasValue(C2042a.m.f49971B0)) {
            this.f5631a = obtainStyledAttributes.getInt(C2042a.m.f49971B0, 0);
        }
        if (obtainStyledAttributes.hasValue(C2042a.m.f49967A0)) {
            f4 = obtainStyledAttributes.getDimension(C2042a.m.f49967A0, f5629s);
        } else {
            f4 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(C2042a.m.f50186y0)) {
            f5 = obtainStyledAttributes.getDimension(C2042a.m.f50186y0, f5629s);
        } else {
            f5 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(C2042a.m.f50182x0)) {
            f6 = obtainStyledAttributes.getDimension(C2042a.m.f50182x0, f5629s);
        } else {
            f6 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(C2042a.m.f50190z0) && (resourceId = obtainStyledAttributes.getResourceId(C2042a.m.f50190z0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (B()) {
            if (this.f5631a == 1) {
                if (!this.f5637g) {
                    DisplayMetrics displayMetrics = this.f5640j.getResources().getDisplayMetrics();
                    if (f5 == f5629s) {
                        f5 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f6 == f5629s) {
                        f6 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f4 == f5629s) {
                        f4 = 1.0f;
                    }
                    C(f5, f6, f4);
                }
                x();
                return;
            }
            return;
        }
        this.f5631a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void s(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (B()) {
            DisplayMetrics displayMetrics = this.f5640j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (x()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void t(@androidx.annotation.N int[] iArr, int i4) throws IllegalArgumentException {
        if (B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f5640j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                this.f5636f = c(iArr2);
                if (!z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f5637g = false;
            }
            if (x()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void u(int i4) {
        if (B()) {
            if (i4 != 0) {
                if (i4 == 1) {
                    DisplayMetrics displayMetrics = this.f5640j.getResources().getDisplayMetrics();
                    C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (x()) {
                        b();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i4);
            }
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void w(int i4, float f4) {
        Resources resources;
        Context context = this.f5640j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        v(TypedValue.applyDimension(i4, f4, resources.getDisplayMetrics()));
    }
}
