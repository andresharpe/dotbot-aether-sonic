package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.content.C0669d;
import f.C2050a;
import f.b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class V {

    /* renamed from: h, reason: collision with root package name */
    private static final String f5992h = "ResourceManagerInternal";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f5993i = false;

    /* renamed from: k, reason: collision with root package name */
    private static final String f5995k = "appcompat_skip_skip";

    /* renamed from: l, reason: collision with root package name */
    private static final String f5996l = "android.graphics.drawable.VectorDrawable";

    /* renamed from: m, reason: collision with root package name */
    private static V f5997m;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.m<ColorStateList>> f5999a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.l<String, e> f6000b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.collection.m<String> f6001c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.h<WeakReference<Drawable.ConstantState>>> f6002d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f6003e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6004f;

    /* renamed from: g, reason: collision with root package name */
    private f f6005g;

    /* renamed from: j, reason: collision with root package name */
    private static final PorterDuff.Mode f5994j = PorterDuff.Mode.SRC_IN;

    /* renamed from: n, reason: collision with root package name */
    private static final c f5998n = new c(6);

    /* loaded from: classes.dex */
    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.V.e
        public Drawable a(@androidx.annotation.N Context context, @androidx.annotation.N XmlPullParser xmlPullParser, @androidx.annotation.N AttributeSet attributeSet, @androidx.annotation.P Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.V.e
        public Drawable a(@androidx.annotation.N Context context, @androidx.annotation.N XmlPullParser xmlPullParser, @androidx.annotation.N AttributeSet attributeSet, @androidx.annotation.P Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.f(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends androidx.collection.j<Integer, PorterDuffColorFilter> {
        public c(int i4) {
            super(i4);
        }

        private static int s(int i4, PorterDuff.Mode mode) {
            return ((i4 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter t(int i4, PorterDuff.Mode mode) {
            return f(Integer.valueOf(s(i4, mode)));
        }

        PorterDuffColorFilter u(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return j(Integer.valueOf(s(i4, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.V.e
        public Drawable a(@androidx.annotation.N Context context, @androidx.annotation.N XmlPullParser xmlPullParser, @androidx.annotation.N AttributeSet attributeSet, @androidx.annotation.P Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C2050a.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e4) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e4);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(@androidx.annotation.N Context context, @androidx.annotation.N XmlPullParser xmlPullParser, @androidx.annotation.N AttributeSet attributeSet, @androidx.annotation.P Resources.Theme theme);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface f {
        boolean a(@androidx.annotation.N Context context, @InterfaceC0578v int i4, @androidx.annotation.N Drawable drawable);

        @androidx.annotation.P
        PorterDuff.Mode b(int i4);

        @androidx.annotation.P
        Drawable c(@androidx.annotation.N V v3, @androidx.annotation.N Context context, @InterfaceC0578v int i4);

        @androidx.annotation.P
        ColorStateList d(@androidx.annotation.N Context context, @InterfaceC0578v int i4);

        boolean e(@androidx.annotation.N Context context, @InterfaceC0578v int i4, @androidx.annotation.N Drawable drawable);
    }

    /* loaded from: classes.dex */
    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.V.e
        public Drawable a(@androidx.annotation.N Context context, @androidx.annotation.N XmlPullParser xmlPullParser, @androidx.annotation.N AttributeSet attributeSet, @androidx.annotation.P Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.f(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                return null;
            }
        }
    }

    private void a(@androidx.annotation.N String str, @androidx.annotation.N e eVar) {
        if (this.f6000b == null) {
            this.f6000b = new androidx.collection.l<>();
        }
        this.f6000b.put(str, eVar);
    }

    private synchronized boolean b(@androidx.annotation.N Context context, long j4, @androidx.annotation.N Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                androidx.collection.h<WeakReference<Drawable.ConstantState>> hVar = this.f6002d.get(context);
                if (hVar == null) {
                    hVar = new androidx.collection.h<>();
                    this.f6002d.put(context, hVar);
                }
                hVar.p(j4, new WeakReference<>(constantState));
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void c(@androidx.annotation.N Context context, @InterfaceC0578v int i4, @androidx.annotation.N ColorStateList colorStateList) {
        if (this.f5999a == null) {
            this.f5999a = new WeakHashMap<>();
        }
        androidx.collection.m<ColorStateList> mVar = this.f5999a.get(context);
        if (mVar == null) {
            mVar = new androidx.collection.m<>();
            this.f5999a.put(context, mVar);
        }
        mVar.a(i4, colorStateList);
    }

    private void d(@androidx.annotation.N Context context) {
        if (this.f6004f) {
            return;
        }
        this.f6004f = true;
        Drawable j4 = j(context, b.a.f50209a);
        if (j4 != null && q(j4)) {
            return;
        }
        this.f6004f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        Drawable c4;
        if (this.f6003e == null) {
            this.f6003e = new TypedValue();
        }
        TypedValue typedValue = this.f6003e;
        context.getResources().getValue(i4, typedValue, true);
        long e4 = e(typedValue);
        Drawable i5 = i(context, e4);
        if (i5 != null) {
            return i5;
        }
        f fVar = this.f6005g;
        if (fVar == null) {
            c4 = null;
        } else {
            c4 = fVar.c(this, context, i4);
        }
        if (c4 != null) {
            c4.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e4, c4);
        }
        return c4;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    public static synchronized V h() {
        V v3;
        synchronized (V.class) {
            try {
                if (f5997m == null) {
                    V v4 = new V();
                    f5997m = v4;
                    p(v4);
                }
                v3 = f5997m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v3;
    }

    private synchronized Drawable i(@androidx.annotation.N Context context, long j4) {
        androidx.collection.h<WeakReference<Drawable.ConstantState>> hVar = this.f6002d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> i4 = hVar.i(j4);
        if (i4 != null) {
            Drawable.ConstantState constantState = i4.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.s(j4);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter t3;
        synchronized (V.class) {
            c cVar = f5998n;
            t3 = cVar.t(i4, mode);
            if (t3 == null) {
                t3 = new PorterDuffColorFilter(i4, mode);
                cVar.u(i4, mode, t3);
            }
        }
        return t3;
    }

    private ColorStateList n(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        androidx.collection.m<ColorStateList> mVar;
        WeakHashMap<Context, androidx.collection.m<ColorStateList>> weakHashMap = this.f5999a;
        if (weakHashMap == null || (mVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return mVar.i(i4);
    }

    private static void p(@androidx.annotation.N V v3) {
    }

    private static boolean q(@androidx.annotation.N Drawable drawable) {
        if (!(drawable instanceof androidx.vectordrawable.graphics.drawable.i) && !f5996l.equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    private Drawable r(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        int next;
        androidx.collection.l<String, e> lVar = this.f6000b;
        if (lVar == null || lVar.isEmpty()) {
            return null;
        }
        androidx.collection.m<String> mVar = this.f6001c;
        if (mVar != null) {
            String i5 = mVar.i(i4);
            if (f5995k.equals(i5) || (i5 != null && this.f6000b.get(i5) == null)) {
                return null;
            }
        } else {
            this.f6001c = new androidx.collection.m<>();
        }
        if (this.f6003e == null) {
            this.f6003e = new TypedValue();
        }
        TypedValue typedValue = this.f6003e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long e4 = e(typedValue);
        Drawable i6 = i(context, e4);
        if (i6 != null) {
            return i6;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f6001c.a(i4, name);
                    e eVar = this.f6000b.get(name);
                    if (eVar != null) {
                        i6 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i6 != null) {
                        i6.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e4, i6);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e5) {
                Log.e(f5992h, "Exception while inflating drawable", e5);
            }
        }
        if (i6 == null) {
            this.f6001c.a(i4, f5995k);
        }
        return i6;
    }

    private Drawable v(@androidx.annotation.N Context context, @InterfaceC0578v int i4, boolean z3, @androidx.annotation.N Drawable drawable) {
        ColorStateList m4 = m(context, i4);
        if (m4 != null) {
            if (L.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r4 = androidx.core.graphics.drawable.d.r(drawable);
            androidx.core.graphics.drawable.d.o(r4, m4);
            PorterDuff.Mode o4 = o(i4);
            if (o4 != null) {
                androidx.core.graphics.drawable.d.p(r4, o4);
                return r4;
            }
            return r4;
        }
        f fVar = this.f6005g;
        if ((fVar == null || !fVar.e(context, i4, drawable)) && !x(context, i4, drawable) && z3) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, e0 e0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (L.a(drawable) && drawable.mutate() != drawable) {
            Log.d(f5992h, "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = e0Var.f6191d;
        if (!z3 && !e0Var.f6190c) {
            drawable.clearColorFilter();
            return;
        }
        if (z3) {
            colorStateList = e0Var.f6188a;
        } else {
            colorStateList = null;
        }
        if (e0Var.f6190c) {
            mode = e0Var.f6189b;
        } else {
            mode = f5994j;
        }
        drawable.setColorFilter(g(colorStateList, mode, iArr));
    }

    public synchronized Drawable j(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        return k(context, i4, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(@androidx.annotation.N Context context, @InterfaceC0578v int i4, boolean z3) {
        Drawable r4;
        try {
            d(context);
            r4 = r(context, i4);
            if (r4 == null) {
                r4 = f(context, i4);
            }
            if (r4 == null) {
                r4 = C0669d.i(context, i4);
            }
            if (r4 != null) {
                r4 = v(context, i4, z3, r4);
            }
            if (r4 != null) {
                L.b(r4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        ColorStateList n4;
        n4 = n(context, i4);
        if (n4 == null) {
            f fVar = this.f6005g;
            if (fVar == null) {
                n4 = null;
            } else {
                n4 = fVar.d(context, i4);
            }
            if (n4 != null) {
                c(context, i4, n4);
            }
        }
        return n4;
    }

    PorterDuff.Mode o(int i4) {
        f fVar = this.f6005g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i4);
    }

    public synchronized void s(@androidx.annotation.N Context context) {
        androidx.collection.h<WeakReference<Drawable.ConstantState>> hVar = this.f6002d.get(context);
        if (hVar != null) {
            hVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(@androidx.annotation.N Context context, @androidx.annotation.N p0 p0Var, @InterfaceC0578v int i4) {
        try {
            Drawable r4 = r(context, i4);
            if (r4 == null) {
                r4 = p0Var.a(i4);
            }
            if (r4 != null) {
                return v(context, i4, false, r4);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.f6005g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(@androidx.annotation.N Context context, @InterfaceC0578v int i4, @androidx.annotation.N Drawable drawable) {
        f fVar = this.f6005g;
        if (fVar != null && fVar.a(context, i4, drawable)) {
            return true;
        }
        return false;
    }
}
