package androidx.navigation;

import W.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.navigation.C0939p;
import androidx.navigation.C0947y;
import androidx.navigation.T;
import androidx.navigation.i0;
import java.io.IOException;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final String f16326d = "argument";

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final String f16327e = "deepLink";

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final String f16328f = "action";

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final String f16329g = "include";

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f16330h = "${applicationId}";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Context f16332a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final d0 f16333b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f16325c = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private static final ThreadLocal<TypedValue> f16331i = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final X<?> a(@l3.d TypedValue value, @l3.e X<?> x3, @l3.d X<?> expectedNavType, @l3.e String str, @l3.d String foundType) throws XmlPullParserException {
            kotlin.jvm.internal.F.p(value, "value");
            kotlin.jvm.internal.F.p(expectedNavType, "expectedNavType");
            kotlin.jvm.internal.F.p(foundType, "foundType");
            if (x3 != null && x3 != expectedNavType) {
                throw new XmlPullParserException("Type is " + ((Object) str) + " but found " + foundType + ": " + value.data);
            }
            if (x3 == null) {
                return expectedNavType;
            }
            return x3;
        }

        private a() {
        }
    }

    public S(@l3.d Context context, @l3.d d0 navigatorProvider) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(navigatorProvider, "navigatorProvider");
        this.f16332a = context;
        this.f16333b = navigatorProvider;
    }

    private final F a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i4) throws XmlPullParserException, IOException {
        int depth;
        d0 d0Var = this.f16333b;
        String name = xmlResourceParser.getName();
        kotlin.jvm.internal.F.o(name, "parser.name");
        F a4 = d0Var.f(name).a();
        a4.B(this.f16332a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (kotlin.jvm.internal.F.g(f16326d, name2)) {
                    f(resources, a4, attributeSet, i4);
                } else if (kotlin.jvm.internal.F.g(f16327e, name2)) {
                    g(resources, a4, attributeSet);
                } else if (kotlin.jvm.internal.F.g(f16328f, name2)) {
                    c(resources, a4, attributeSet, xmlResourceParser, i4);
                } else if (kotlin.jvm.internal.F.g(f16329g, name2) && (a4 instanceof J)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, i0.c.f16499i);
                    kotlin.jvm.internal.F.o(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((J) a4).Q(b(obtainAttributes.getResourceId(i0.c.f16500j, 0)));
                    H0 h02 = H0.f51801a;
                    obtainAttributes.recycle();
                } else if (a4 instanceof J) {
                    ((J) a4).Q(a(resources, xmlResourceParser, attributeSet, i4));
                }
            }
        }
        return a4;
    }

    private final void c(Resources resources, F f4, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i4) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.f16332a;
        int[] NavAction = a.b.f3780a;
        kotlin.jvm.internal.F.o(NavAction, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(a.b.f3781b, 0);
        C0934k c0934k = new C0934k(obtainStyledAttributes.getResourceId(a.b.f3782c, 0), null, null, 6, null);
        T.a aVar = new T.a();
        aVar.d(obtainStyledAttributes.getBoolean(a.b.f3785f, false));
        aVar.m(obtainStyledAttributes.getBoolean(a.b.f3791l, false));
        aVar.h(obtainStyledAttributes.getResourceId(a.b.f3788i, -1), obtainStyledAttributes.getBoolean(a.b.f3789j, false), obtainStyledAttributes.getBoolean(a.b.f3790k, false));
        aVar.b(obtainStyledAttributes.getResourceId(a.b.f3783d, -1));
        aVar.c(obtainStyledAttributes.getResourceId(a.b.f3784e, -1));
        aVar.e(obtainStyledAttributes.getResourceId(a.b.f3786g, -1));
        aVar.f(obtainStyledAttributes.getResourceId(a.b.f3787h, -1));
        c0934k.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && kotlin.jvm.internal.F.g(f16326d, xmlResourceParser.getName())) {
                e(resources, bundle, attributeSet, i4);
            }
        }
        if (!bundle.isEmpty()) {
            c0934k.d(bundle);
        }
        f4.F(resourceId, c0934k);
        obtainStyledAttributes.recycle();
    }

    private final C0939p d(TypedArray typedArray, Resources resources, int i4) throws XmlPullParserException {
        X<Object> x3;
        C0939p.a aVar = new C0939p.a();
        boolean z3 = false;
        int i5 = 0;
        aVar.c(typedArray.getBoolean(a.b.f3796q, false));
        ThreadLocal<TypedValue> threadLocal = f16331i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(a.b.f3795p);
        Object obj = null;
        if (string != null) {
            x3 = X.f16363c.a(string, resources.getResourcePackageName(i4));
        } else {
            x3 = null;
        }
        if (typedArray.getValue(a.b.f3794o, typedValue)) {
            X<Object> x4 = X.f16365e;
            if (x3 == x4) {
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    i5 = i6;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + x3.c() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i5);
            } else {
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    if (x3 == null) {
                        obj = Integer.valueOf(i7);
                        x3 = x4;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + x3.c() + ". You must use a \"" + x4.c() + "\" type to reference other resources.");
                    }
                } else if (x3 == X.f16373m) {
                    obj = typedArray.getString(a.b.f3794o);
                } else {
                    int i8 = typedValue.type;
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                if (i8 != 18) {
                                    if (i8 >= 16 && i8 <= 31) {
                                        X<Object> x5 = X.f16369i;
                                        if (x3 == x5) {
                                            x3 = f16325c.a(typedValue, x3, x5, string, v.b.f7401c);
                                            obj = Float.valueOf(typedValue.data);
                                        } else {
                                            x3 = f16325c.a(typedValue, x3, X.f16364d, string, v.b.f7400b);
                                            obj = Integer.valueOf(typedValue.data);
                                        }
                                    } else {
                                        throw new XmlPullParserException(kotlin.jvm.internal.F.C("unsupported argument type ", Integer.valueOf(typedValue.type)));
                                    }
                                } else {
                                    x3 = f16325c.a(typedValue, x3, X.f16371k, string, v.b.f7404f);
                                    if (typedValue.data != 0) {
                                        z3 = true;
                                    }
                                    obj = Boolean.valueOf(z3);
                                }
                            } else {
                                x3 = f16325c.a(typedValue, x3, X.f16364d, string, v.b.f7405g);
                                obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            }
                        } else {
                            x3 = f16325c.a(typedValue, x3, X.f16369i, string, v.b.f7401c);
                            obj = Float.valueOf(typedValue.getFloat());
                        }
                    } else {
                        String obj2 = typedValue.string.toString();
                        if (x3 == null) {
                            x3 = X.f16363c.b(obj2);
                        }
                        obj = x3.k(obj2);
                    }
                }
            }
        }
        if (obj != null) {
            aVar.b(obj);
        }
        if (x3 != null) {
            aVar.d(x3);
        }
        return aVar.a();
    }

    private final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i4) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.b.f3792m);
        kotlin.jvm.internal.F.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(a.b.f3793n);
        if (string != null) {
            C0939p d4 = d(obtainAttributes, resources, i4);
            if (d4.c()) {
                d4.e(string, bundle);
            }
            H0 h02 = H0.f51801a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void f(Resources resources, F f4, AttributeSet attributeSet, int i4) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.b.f3792m);
        kotlin.jvm.internal.F.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(a.b.f3793n);
        if (string != null) {
            f4.c(string, d(obtainAttributes, resources, i4));
            H0 h02 = H0.f51801a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void g(Resources resources, F f4, AttributeSet attributeSet) throws XmlPullParserException {
        String i22;
        String i23;
        String i24;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.b.f3797r);
        kotlin.jvm.internal.F.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(a.b.f3801v);
        String string2 = obtainAttributes.getString(a.b.f3799t);
        String string3 = obtainAttributes.getString(a.b.f3800u);
        if ((string != null && string.length() != 0) || ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0))) {
            C0947y.a aVar = new C0947y.a();
            if (string != null) {
                String packageName = this.f16332a.getPackageName();
                kotlin.jvm.internal.F.o(packageName, "context.packageName");
                i24 = kotlin.text.z.i2(string, f16330h, packageName, false, 4, null);
                aVar.g(i24);
            }
            if (string2 != null && string2.length() != 0) {
                String packageName2 = this.f16332a.getPackageName();
                kotlin.jvm.internal.F.o(packageName2, "context.packageName");
                i23 = kotlin.text.z.i2(string2, f16330h, packageName2, false, 4, null);
                aVar.e(i23);
            }
            if (string3 != null) {
                String packageName3 = this.f16332a.getPackageName();
                kotlin.jvm.internal.F.o(packageName3, "context.packageName");
                i22 = kotlin.text.z.i2(string3, f16330h, packageName3, false, 4, null);
                aVar.f(i22);
            }
            f4.d(aVar.a());
            H0 h02 = H0.f51801a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    }

    @l3.d
    @SuppressLint({"ResourceType"})
    public final J b(@androidx.annotation.M int i4) {
        int next;
        Resources res = this.f16332a.getResources();
        XmlResourceParser xml = res.getXml(i4);
        kotlin.jvm.internal.F.o(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e4) {
                    throw new RuntimeException("Exception inflating " + ((Object) res.getResourceName(i4)) + " line " + xml.getLineNumber(), e4);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            kotlin.jvm.internal.F.o(res, "res");
            kotlin.jvm.internal.F.o(attrs, "attrs");
            F a4 = a(res, xml, attrs, i4);
            if (a4 instanceof J) {
                return (J) a4;
            }
            throw new IllegalArgumentException(("Root element <" + ((Object) name) + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
