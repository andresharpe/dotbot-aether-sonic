package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.InterfaceC0560c;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.v;
import java.io.Serializable;
import kotlin.jvm.internal.C2197u;
import kotlin.text.C2220b;

/* loaded from: classes.dex */
public abstract class X<T> {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final l f16363c = new l(null);

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<Integer> f16364d = new f();

    /* renamed from: e, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<Integer> f16365e = new i();

    /* renamed from: f, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<int[]> f16366f = new e();

    /* renamed from: g, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<Long> f16367g = new h();

    /* renamed from: h, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<long[]> f16368h = new g();

    /* renamed from: i, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<Float> f16369i = new d();

    /* renamed from: j, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<float[]> f16370j = new c();

    /* renamed from: k, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<Boolean> f16371k = new b();

    /* renamed from: l, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<boolean[]> f16372l = new a();

    /* renamed from: m, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<String> f16373m = new k();

    /* renamed from: n, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final X<String[]> f16374n = new j();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16375a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f16376b = "nav_type";

    /* loaded from: classes.dex */
    public static final class a extends X<boolean[]> {
        a() {
            super(true);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e boolean[] zArr) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends X<Boolean> {
        b() {
            super(false);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return v.b.f7404f;
        }

        @Override // androidx.navigation.X
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Boolean bool) {
            l(bundle, str, bool.booleanValue());
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean k(@l3.d String value) {
            boolean z3;
            kotlin.jvm.internal.F.p(value, "value");
            if (kotlin.jvm.internal.F.g(value, L1.a.f1650s3)) {
                z3 = true;
            } else if (kotlin.jvm.internal.F.g(value, L1.a.t3)) {
                z3 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z3);
        }

        public void l(@l3.d Bundle bundle, @l3.d String key, boolean z3) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putBoolean(key, z3);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends X<float[]> {
        c() {
            super(true);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return "float[]";
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e float[] fArr) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends X<Float> {
        d() {
            super(false);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return v.b.f7401c;
        }

        @Override // androidx.navigation.X
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Float f4) {
            l(bundle, str, f4.floatValue());
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void l(@l3.d Bundle bundle, @l3.d String key, float f4) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putFloat(key, f4);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends X<int[]> {
        e() {
            super(true);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return "integer[]";
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e int[] iArr) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putIntArray(key, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends X<Integer> {
        f() {
            super(false);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return v.b.f7400b;
        }

        @Override // androidx.navigation.X
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Integer num) {
            l(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(@l3.d String value) {
            boolean s22;
            int parseInt;
            int a4;
            kotlin.jvm.internal.F.p(value, "value");
            s22 = kotlin.text.z.s2(value, "0x", false, 2, null);
            if (s22) {
                String substring = value.substring(2);
                kotlin.jvm.internal.F.o(substring, "this as java.lang.String).substring(startIndex)");
                a4 = C2220b.a(16);
                parseInt = Integer.parseInt(substring, a4);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void l(@l3.d Bundle bundle, @l3.d String key, int i4) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putInt(key, i4);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends X<long[]> {
        g() {
            super(true);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return "long[]";
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e long[] jArr) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putLongArray(key, jArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends X<Long> {
        h() {
            super(false);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return "long";
        }

        @Override // androidx.navigation.X
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Long l4) {
            l(bundle, str, l4.longValue());
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long k(@l3.d String value) {
            boolean J12;
            String str;
            boolean s22;
            long parseLong;
            int a4;
            kotlin.jvm.internal.F.p(value, "value");
            J12 = kotlin.text.z.J1(value, "L", false, 2, null);
            if (J12) {
                str = value.substring(0, value.length() - 1);
                kotlin.jvm.internal.F.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = value;
            }
            s22 = kotlin.text.z.s2(value, "0x", false, 2, null);
            if (s22) {
                String substring = str.substring(2);
                kotlin.jvm.internal.F.o(substring, "this as java.lang.String).substring(startIndex)");
                a4 = C2220b.a(16);
                parseLong = Long.parseLong(substring, a4);
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        public void l(@l3.d Bundle bundle, @l3.d String key, long j4) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putLong(key, j4);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends X<Integer> {
        i() {
            super(false);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return v.b.f7406h;
        }

        @Override // androidx.navigation.X
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Integer num) {
            l(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.X
        @l3.d
        @InterfaceC0560c
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(@l3.d String value) {
            boolean s22;
            int parseInt;
            int a4;
            kotlin.jvm.internal.F.p(value, "value");
            s22 = kotlin.text.z.s2(value, "0x", false, 2, null);
            if (s22) {
                String substring = value.substring(2);
                kotlin.jvm.internal.F.o(substring, "this as java.lang.String).substring(startIndex)");
                a4 = C2220b.a(16);
                parseInt = Integer.parseInt(substring, a4);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void l(@l3.d Bundle bundle, @l3.d String key, @InterfaceC0560c int i4) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putInt(key, i4);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends X<String[]> {
        j() {
            super(true);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return "string[]";
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e String[] strArr) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putStringArray(key, strArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends X<String> {
        k() {
            super(true);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            return v.b.f7403e;
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            return value;
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e String str) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            bundle.putString(key, str);
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        public /* synthetic */ l(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public X<?> a(@l3.e String str, @l3.e String str2) {
            boolean s22;
            String str3;
            boolean J12;
            X<Integer> x3 = X.f16364d;
            if (kotlin.jvm.internal.F.g(x3.c(), str)) {
                return x3;
            }
            X x4 = X.f16366f;
            if (kotlin.jvm.internal.F.g(x4.c(), str)) {
                return x4;
            }
            X<Long> x5 = X.f16367g;
            if (kotlin.jvm.internal.F.g(x5.c(), str)) {
                return x5;
            }
            X x6 = X.f16368h;
            if (kotlin.jvm.internal.F.g(x6.c(), str)) {
                return x6;
            }
            X<Boolean> x7 = X.f16371k;
            if (kotlin.jvm.internal.F.g(x7.c(), str)) {
                return x7;
            }
            X x8 = X.f16372l;
            if (kotlin.jvm.internal.F.g(x8.c(), str)) {
                return x8;
            }
            X<String> x9 = X.f16373m;
            if (kotlin.jvm.internal.F.g(x9.c(), str)) {
                return x9;
            }
            X x10 = X.f16374n;
            if (kotlin.jvm.internal.F.g(x10.c(), str)) {
                return x10;
            }
            X<Float> x11 = X.f16369i;
            if (kotlin.jvm.internal.F.g(x11.c(), str)) {
                return x11;
            }
            X x12 = X.f16370j;
            if (kotlin.jvm.internal.F.g(x12.c(), str)) {
                return x12;
            }
            X<Integer> x13 = X.f16365e;
            if (kotlin.jvm.internal.F.g(x13.c(), str)) {
                return x13;
            }
            if (str != null && str.length() != 0) {
                try {
                    s22 = kotlin.text.z.s2(str, ".", false, 2, null);
                    if (s22 && str2 != null) {
                        str3 = kotlin.jvm.internal.F.C(str2, str);
                    } else {
                        str3 = str;
                    }
                    J12 = kotlin.text.z.J1(str, "[]", false, 2, null);
                    if (J12) {
                        str3 = str3.substring(0, str3.length() - 2);
                        kotlin.jvm.internal.F.o(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class<?> cls = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            return new n(cls);
                        }
                        if (Serializable.class.isAssignableFrom(cls)) {
                            return new p(cls);
                        }
                    } else {
                        Class<?> cls2 = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            return new o(cls2);
                        }
                        if (Enum.class.isAssignableFrom(cls2)) {
                            return new m(cls2);
                        }
                        if (Serializable.class.isAssignableFrom(cls2)) {
                            return new q(cls2);
                        }
                    }
                    throw new IllegalArgumentException(kotlin.jvm.internal.F.C(str3, " is not Serializable or Parcelable."));
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            }
            return x9;
        }

        @W2.n
        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final X<Object> b(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            try {
                try {
                    try {
                        try {
                            X<Integer> x3 = X.f16364d;
                            x3.k(value);
                            return x3;
                        } catch (IllegalArgumentException unused) {
                            X<Float> x4 = X.f16369i;
                            x4.k(value);
                            return x4;
                        }
                    } catch (IllegalArgumentException unused2) {
                        X<Long> x5 = X.f16367g;
                        x5.k(value);
                        return x5;
                    }
                } catch (IllegalArgumentException unused3) {
                    return X.f16373m;
                }
            } catch (IllegalArgumentException unused4) {
                X<Boolean> x6 = X.f16371k;
                x6.k(value);
                return x6;
            }
        }

        @W2.n
        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final X<Object> c(@l3.e Object obj) {
            X<Object> qVar;
            if (obj instanceof Integer) {
                return X.f16364d;
            }
            if (obj instanceof int[]) {
                return X.f16366f;
            }
            if (obj instanceof Long) {
                return X.f16367g;
            }
            if (obj instanceof long[]) {
                return X.f16368h;
            }
            if (obj instanceof Float) {
                return X.f16369i;
            }
            if (obj instanceof float[]) {
                return X.f16370j;
            }
            if (obj instanceof Boolean) {
                return X.f16371k;
            }
            if (obj instanceof boolean[]) {
                return X.f16372l;
            }
            if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    return X.f16374n;
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    kotlin.jvm.internal.F.m(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        if (componentType2 != null) {
                            qVar = new n<>(componentType2);
                            return qVar;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    kotlin.jvm.internal.F.m(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        if (componentType4 != null) {
                            qVar = new p<>(componentType4);
                            return qVar;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    }
                }
                if (obj instanceof Parcelable) {
                    qVar = new o<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    qVar = new m<>(obj.getClass());
                } else if (obj instanceof Serializable) {
                    qVar = new q<>(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + ((Object) obj.getClass().getName()) + " is not supported for navigation arguments.");
                }
                return qVar;
            }
            return X.f16373m;
        }

        private l() {
        }
    }

    /* loaded from: classes.dex */
    public static final class m<D extends Enum<?>> extends q<D> {

        /* renamed from: p, reason: collision with root package name */
        @l3.d
        private final Class<D> f16377p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@l3.d Class<D> type) {
            super(false, type);
            kotlin.jvm.internal.F.p(type, "type");
            if (type.isEnum()) {
                this.f16377p = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.X.q, androidx.navigation.X
        @l3.d
        public String c() {
            String name = this.f16377p.getName();
            kotlin.jvm.internal.F.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.X.q
        @l3.d
        /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D k(@l3.d String value) {
            D d4;
            boolean K12;
            kotlin.jvm.internal.F.p(value, "value");
            D[] enumConstants = this.f16377p.getEnumConstants();
            kotlin.jvm.internal.F.o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    d4 = enumConstants[i4];
                    i4++;
                    K12 = kotlin.text.z.K1(d4.name(), value, true);
                    if (K12) {
                        break;
                    }
                } else {
                    d4 = null;
                    break;
                }
            }
            D d5 = d4;
            if (d5 != null) {
                return d5;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + ((Object) this.f16377p.getName()) + '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D extends Parcelable> extends X<D[]> {

        /* renamed from: o, reason: collision with root package name */
        @l3.d
        private final Class<D[]> f16378o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@l3.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.F.p(type, "type");
            if (Parcelable.class.isAssignableFrom(type)) {
                try {
                    this.f16378o = (Class<D[]>) Class.forName("[L" + ((Object) type.getName()) + ';');
                    return;
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            String name = this.f16378o.getName();
            kotlin.jvm.internal.F.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && kotlin.jvm.internal.F.g(n.class, obj.getClass())) {
                return kotlin.jvm.internal.F.g(this.f16378o, ((n) obj).f16378o);
            }
            return false;
        }

        public int hashCode() {
            return this.f16378o.hashCode();
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.X
        @l3.d
        public D[] k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e D[] dArr) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            this.f16378o.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D> extends X<D> {

        /* renamed from: o, reason: collision with root package name */
        @l3.d
        private final Class<D> f16379o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@l3.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.F.p(type, "type");
            if (!Parcelable.class.isAssignableFrom(type) && !Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
            }
            this.f16379o = type;
        }

        @Override // androidx.navigation.X
        @l3.e
        public D b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            String name = this.f16379o.getName();
            kotlin.jvm.internal.F.o(name, "type.name");
            return name;
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && kotlin.jvm.internal.F.g(o.class, obj.getClass())) {
                return kotlin.jvm.internal.F.g(this.f16379o, ((o) obj).f16379o);
            }
            return false;
        }

        @Override // androidx.navigation.X
        /* renamed from: h */
        public D k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f16379o.hashCode();
        }

        @Override // androidx.navigation.X
        public void i(@l3.d Bundle bundle, @l3.d String key, D d4) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            this.f16379o.cast(d4);
            if (d4 != null && !(d4 instanceof Parcelable)) {
                if (d4 instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) d4);
                    return;
                }
                return;
            }
            bundle.putParcelable(key, (Parcelable) d4);
        }
    }

    /* loaded from: classes.dex */
    public static final class p<D extends Serializable> extends X<D[]> {

        /* renamed from: o, reason: collision with root package name */
        @l3.d
        private final Class<D[]> f16380o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@l3.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.F.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                try {
                    this.f16380o = (Class<D[]>) Class.forName("[L" + ((Object) type.getName()) + ';');
                    return;
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            String name = this.f16380o.getName();
            kotlin.jvm.internal.F.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && kotlin.jvm.internal.F.g(p.class, obj.getClass())) {
                return kotlin.jvm.internal.F.g(this.f16380o, ((p) obj).f16380o);
            }
            return false;
        }

        public int hashCode() {
            return this.f16380o.hashCode();
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.X
        @l3.d
        public D[] k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.e D[] dArr) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            this.f16380o.cast(dArr);
            bundle.putSerializable(key, dArr);
        }
    }

    public X(boolean z3) {
        this.f16375a = z3;
    }

    @W2.n
    @l3.d
    public static X<?> a(@l3.e String str, @l3.e String str2) {
        return f16363c.a(str, str2);
    }

    @W2.n
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final X<Object> d(@l3.d String str) {
        return f16363c.b(str);
    }

    @W2.n
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final X<Object> e(@l3.e Object obj) {
        return f16363c.c(obj);
    }

    @l3.e
    public abstract T b(@l3.d Bundle bundle, @l3.d String str);

    @l3.d
    public String c() {
        return this.f16376b;
    }

    public boolean f() {
        return this.f16375a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T g(@l3.d Bundle bundle, @l3.d String key, @l3.d String value) {
        kotlin.jvm.internal.F.p(bundle, "bundle");
        kotlin.jvm.internal.F.p(key, "key");
        kotlin.jvm.internal.F.p(value, "value");
        T k4 = k(value);
        i(bundle, key, k4);
        return k4;
    }

    /* renamed from: h */
    public abstract T k(@l3.d String str);

    public abstract void i(@l3.d Bundle bundle, @l3.d String str, T t3);

    @l3.d
    public String toString() {
        return c();
    }

    /* loaded from: classes.dex */
    public static class q<D extends Serializable> extends X<D> {

        /* renamed from: o, reason: collision with root package name */
        @l3.d
        private final Class<D> f16381o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@l3.d Class<D> type) {
            super(true);
            kotlin.jvm.internal.F.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                if (true ^ type.isEnum()) {
                    this.f16381o = type;
                    return;
                }
                throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.X
        @l3.d
        public String c() {
            String name = this.f16381o.getName();
            kotlin.jvm.internal.F.o(name, "type.name");
            return name;
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            return kotlin.jvm.internal.F.g(this.f16381o, ((q) obj).f16381o);
        }

        public int hashCode() {
            return this.f16381o.hashCode();
        }

        @Override // androidx.navigation.X
        @l3.e
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D b(@l3.d Bundle bundle, @l3.d String key) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.X
        @l3.d
        public D k(@l3.d String value) {
            kotlin.jvm.internal.F.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.X
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l3.d Bundle bundle, @l3.d String key, @l3.d D value) {
            kotlin.jvm.internal.F.p(bundle, "bundle");
            kotlin.jvm.internal.F.p(key, "key");
            kotlin.jvm.internal.F.p(value, "value");
            this.f16381o.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z3, @l3.d Class<D> type) {
            super(z3);
            kotlin.jvm.internal.F.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f16381o = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
