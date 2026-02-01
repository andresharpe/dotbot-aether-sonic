package androidx.navigation;

import W.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.RestrictTo;
import androidx.navigation.C0947y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.H0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.C2096k;
import kotlin.collections.C2107u;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public class F {

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    public static final b f16277N = new b(null);

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final Map<String, Class<?>> f16278O = new LinkedHashMap();

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final String f16279E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private J f16280F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private String f16281G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private CharSequence f16282H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final List<C0947y> f16283I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final androidx.collection.m<C0934k> f16284J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private Map<String, C0939p> f16285K;

    /* renamed from: L, reason: collision with root package name */
    private int f16286L;

    /* renamed from: M, reason: collision with root package name */
    @l3.e
    private String f16287M;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @P2.c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    @P2.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    /* loaded from: classes.dex */
    public @interface a {
        Class<?> value();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends Lambda implements X2.l<F, F> {

            /* renamed from: F, reason: collision with root package name */
            public static final a f16288F = new a();

            a() {
                super(1);
            }

            @Override // X2.l
            @l3.e
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final F C(@l3.d F it) {
                kotlin.jvm.internal.F.p(it, "it");
                return it.w();
            }
        }

        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        @W2.n
        public static /* synthetic */ void d(F f4) {
        }

        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String a(@l3.e String str) {
            if (str != null) {
                return kotlin.jvm.internal.F.C("android-app://androidx.navigation/", str);
            }
            return "";
        }

        @W2.n
        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String b(@l3.d Context context, int i4) {
            String valueOf;
            kotlin.jvm.internal.F.p(context, "context");
            if (i4 <= 16777215) {
                return String.valueOf(i4);
            }
            try {
                valueOf = context.getResources().getResourceName(i4);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i4);
            }
            kotlin.jvm.internal.F.o(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        @l3.d
        public final kotlin.sequences.m<F> c(@l3.d F f4) {
            kotlin.jvm.internal.F.p(f4, "<this>");
            return kotlin.sequences.p.n(f4, a.f16288F);
        }

        @W2.n
        @l3.d
        protected final <C> Class<? extends C> e(@l3.d Context context, @l3.d String name, @l3.d Class<? extends C> expectedClassType) {
            String str;
            kotlin.jvm.internal.F.p(context, "context");
            kotlin.jvm.internal.F.p(name, "name");
            kotlin.jvm.internal.F.p(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = kotlin.jvm.internal.F.C(context.getPackageName(), name);
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) F.f16278O.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    F.f16278O.put(name, cls);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            }
            kotlin.jvm.internal.F.m(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @W2.n
        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <C> Class<? extends C> f(@l3.d Context context, @l3.d String name, @l3.d Class<? extends C> expectedClassType) {
            kotlin.jvm.internal.F.p(context, "context");
            kotlin.jvm.internal.F.p(name, "name");
            kotlin.jvm.internal.F.p(expectedClassType, "expectedClassType");
            return F.C(context, name, expectedClassType);
        }

        private b() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final F f16289E;

        /* renamed from: F, reason: collision with root package name */
        @l3.e
        private final Bundle f16290F;

        /* renamed from: G, reason: collision with root package name */
        private final boolean f16291G;

        /* renamed from: H, reason: collision with root package name */
        private final boolean f16292H;

        /* renamed from: I, reason: collision with root package name */
        private final int f16293I;

        public c(@l3.d F destination, @l3.e Bundle bundle, boolean z3, boolean z4, int i4) {
            kotlin.jvm.internal.F.p(destination, "destination");
            this.f16289E = destination;
            this.f16290F = bundle;
            this.f16291G = z3;
            this.f16292H = z4;
            this.f16293I = i4;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@l3.d c other) {
            kotlin.jvm.internal.F.p(other, "other");
            boolean z3 = this.f16291G;
            if (z3 && !other.f16291G) {
                return 1;
            }
            if (!z3 && other.f16291G) {
                return -1;
            }
            Bundle bundle = this.f16290F;
            if (bundle != null && other.f16290F == null) {
                return 1;
            }
            if (bundle == null && other.f16290F != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.f16290F;
                kotlin.jvm.internal.F.m(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z4 = this.f16292H;
            if (z4 && !other.f16292H) {
                return 1;
            }
            if (!z4 && other.f16292H) {
                return -1;
            }
            return this.f16293I - other.f16293I;
        }

        @l3.d
        public final F e() {
            return this.f16289E;
        }

        @l3.e
        public final Bundle f() {
            return this.f16290F;
        }
    }

    public F(@l3.d String navigatorName) {
        kotlin.jvm.internal.F.p(navigatorName, "navigatorName");
        this.f16279E = navigatorName;
        this.f16283I = new ArrayList();
        this.f16284J = new androidx.collection.m<>();
        this.f16285K = new LinkedHashMap();
    }

    @W2.n
    @l3.d
    protected static final <C> Class<? extends C> C(@l3.d Context context, @l3.d String str, @l3.d Class<? extends C> cls) {
        return f16277N.e(context, str, cls);
    }

    @W2.n
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <C> Class<? extends C> D(@l3.d Context context, @l3.d String str, @l3.d Class<? extends C> cls) {
        return f16277N.f(context, str, cls);
    }

    public static /* synthetic */ int[] n(F f4, F f5, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                f5 = null;
            }
            return f4.m(f5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    @W2.n
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String r(@l3.d Context context, int i4) {
        return f16277N.b(context, i4);
    }

    @l3.d
    public static final kotlin.sequences.m<F> s(@l3.d F f4) {
        return f16277N.c(f4);
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public c A(@l3.d D navDeepLinkRequest) {
        Bundle bundle;
        boolean z3;
        int i4;
        kotlin.jvm.internal.F.p(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f16283I.isEmpty()) {
            return null;
        }
        c cVar = null;
        for (C0947y c0947y : this.f16283I) {
            Uri c4 = navDeepLinkRequest.c();
            if (c4 != null) {
                bundle = c0947y.f(c4, p());
            } else {
                bundle = null;
            }
            String a4 = navDeepLinkRequest.a();
            if (a4 != null && kotlin.jvm.internal.F.g(a4, c0947y.d())) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3;
            String b4 = navDeepLinkRequest.b();
            if (b4 != null) {
                i4 = c0947y.h(b4);
            } else {
                i4 = -1;
            }
            if (bundle != null || z4 || i4 > -1) {
                c cVar2 = new c(this, bundle, c0947y.l(), z4, i4);
                if (cVar == null || cVar2.compareTo(cVar) > 0) {
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }

    @InterfaceC0566i
    public void B(@l3.d Context context, @l3.d AttributeSet attrs) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, a.b.f3804y);
        kotlin.jvm.internal.F.o(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        M(obtainAttributes.getString(a.b.f3779B));
        if (obtainAttributes.hasValue(a.b.f3778A)) {
            J(obtainAttributes.getResourceId(a.b.f3778A, 0));
            this.f16281G = f16277N.b(context, t());
        }
        K(obtainAttributes.getText(a.b.f3805z));
        H0 h02 = H0.f51801a;
        obtainAttributes.recycle();
    }

    public final void E(@androidx.annotation.D int i4, @androidx.annotation.D int i5) {
        F(i4, new C0934k(i5, null, null, 6, null));
    }

    public final void F(@androidx.annotation.D int i4, @l3.d C0934k action) {
        kotlin.jvm.internal.F.p(action, "action");
        if (N()) {
            if (i4 != 0) {
                this.f16284J.p(i4, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i4 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void H(@androidx.annotation.D int i4) {
        this.f16284J.s(i4);
    }

    public final void I(@l3.d String argumentName) {
        kotlin.jvm.internal.F.p(argumentName, "argumentName");
        this.f16285K.remove(argumentName);
    }

    public final void J(@androidx.annotation.D int i4) {
        this.f16286L = i4;
        this.f16281G = null;
    }

    public final void K(@l3.e CharSequence charSequence) {
        this.f16282H = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void L(@l3.e J j4) {
        this.f16280F = j4;
    }

    public final void M(@l3.e String str) {
        Object obj;
        if (str == null) {
            J(0);
        } else if (!kotlin.text.q.S1(str)) {
            String a4 = f16277N.a(str);
            J(a4.hashCode());
            j(a4);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List<C0947y> list = this.f16283I;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.F.g(((C0947y) obj).k(), f16277N.a(this.f16287M))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        list.remove(obj);
        this.f16287M = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean N() {
        return true;
    }

    public final void c(@l3.d String argumentName, @l3.d C0939p argument) {
        kotlin.jvm.internal.F.p(argumentName, "argumentName");
        kotlin.jvm.internal.F.p(argument, "argument");
        this.f16285K.put(argumentName, argument);
    }

    public final void d(@l3.d C0947y navDeepLink) {
        kotlin.jvm.internal.F.p(navDeepLink, "navDeepLink");
        Map<String, C0939p> p4 = p();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0939p> entry : p4.entrySet()) {
            C0939p value = entry.getValue();
            if (!value.d() && !value.c()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!navDeepLink.e().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f16283I.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + ((Object) navDeepLink.k()) + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    public boolean equals(@l3.e Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (obj == null || !(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        if (C2107u.i3(this.f16283I, f4.f16283I).size() == this.f16283I.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f16284J.B() == f4.f16284J.B()) {
            Iterator it = kotlin.sequences.p.e(androidx.collection.n.k(this.f16284J)).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!f4.f16284J.f((C0934k) it.next())) {
                        break;
                    }
                } else {
                    Iterator it2 = kotlin.sequences.p.e(androidx.collection.n.k(f4.f16284J)).iterator();
                    while (it2.hasNext()) {
                        if (!this.f16284J.f((C0934k) it2.next())) {
                        }
                    }
                    z4 = true;
                }
            }
        }
        z4 = false;
        if (p().size() == f4.p().size()) {
            Iterator it3 = kotlin.collections.V.T0(p()).iterator();
            while (true) {
                if (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!f4.p().containsKey(entry.getKey()) || !kotlin.jvm.internal.F.g(f4.p().get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                } else {
                    for (Map.Entry entry2 : kotlin.collections.V.T0(f4.p())) {
                        if (p().containsKey(entry2.getKey()) && kotlin.jvm.internal.F.g(p().get(entry2.getKey()), entry2.getValue())) {
                        }
                    }
                    z5 = true;
                }
            }
        }
        z5 = false;
        if (this.f16286L != f4.f16286L || !kotlin.jvm.internal.F.g(this.f16287M, f4.f16287M) || !z3 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Set<String> keySet;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i4 = this.f16286L * 31;
        String str = this.f16287M;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = i4 + hashCode;
        for (C0947y c0947y : this.f16283I) {
            int i6 = i5 * 31;
            String k4 = c0947y.k();
            if (k4 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = k4.hashCode();
            }
            int i7 = (i6 + hashCode5) * 31;
            String d4 = c0947y.d();
            if (d4 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = d4.hashCode();
            }
            int i8 = (i7 + hashCode6) * 31;
            String g4 = c0947y.g();
            if (g4 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = g4.hashCode();
            }
            i5 = i8 + hashCode7;
        }
        Iterator k5 = androidx.collection.n.k(this.f16284J);
        while (k5.hasNext()) {
            C0934k c0934k = (C0934k) k5.next();
            int b4 = ((i5 * 31) + c0934k.b()) * 31;
            T c4 = c0934k.c();
            if (c4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = c4.hashCode();
            }
            i5 = b4 + hashCode3;
            Bundle a4 = c0934k.a();
            if (a4 != null && (keySet = a4.keySet()) != null) {
                for (String str2 : keySet) {
                    int i9 = i5 * 31;
                    Bundle a5 = c0934k.a();
                    kotlin.jvm.internal.F.m(a5);
                    Object obj = a5.get(str2);
                    if (obj == null) {
                        hashCode4 = 0;
                    } else {
                        hashCode4 = obj.hashCode();
                    }
                    i5 = i9 + hashCode4;
                }
            }
        }
        for (String str3 : p().keySet()) {
            int hashCode8 = ((i5 * 31) + str3.hashCode()) * 31;
            C0939p c0939p = p().get(str3);
            if (c0939p == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c0939p.hashCode();
            }
            i5 = hashCode8 + hashCode2;
        }
        return i5;
    }

    public final void j(@l3.d String uriPattern) {
        kotlin.jvm.internal.F.p(uriPattern, "uriPattern");
        d(new C0947y.a().g(uriPattern).a());
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle k(@l3.e Bundle bundle) {
        Map<String, C0939p> map;
        if (bundle == null && ((map = this.f16285K) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, C0939p> entry : this.f16285K.entrySet()) {
            entry.getValue().e(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, C0939p> entry2 : this.f16285K.entrySet()) {
                String key = entry2.getKey();
                C0939p value = entry2.getValue();
                if (!value.f(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.b().c() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    @W2.j
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] l() {
        return n(this, null, 1, null);
    }

    @W2.j
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] m(@l3.e F f4) {
        J j4;
        C2096k c2096k = new C2096k();
        F f5 = this;
        while (true) {
            kotlin.jvm.internal.F.m(f5);
            J j5 = f5.f16280F;
            if (f4 == null) {
                j4 = null;
            } else {
                j4 = f4.f16280F;
            }
            if (j4 != null) {
                J j6 = f4.f16280F;
                kotlin.jvm.internal.F.m(j6);
                if (j6.U(f5.f16286L) == f5) {
                    c2096k.addFirst(f5);
                    break;
                }
            }
            if (j5 == null || j5.c0() != f5.f16286L) {
                c2096k.addFirst(f5);
            }
            if (kotlin.jvm.internal.F.g(j5, f4) || j5 == null) {
                break;
            }
            f5 = j5;
        }
        List V5 = C2107u.V5(c2096k);
        ArrayList arrayList = new ArrayList(C2107u.b0(V5, 10));
        Iterator it = V5.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((F) it.next()).t()));
        }
        return C2107u.U5(arrayList);
    }

    @l3.e
    public final C0934k o(@androidx.annotation.D int i4) {
        C0934k i5;
        if (this.f16284J.n()) {
            i5 = null;
        } else {
            i5 = this.f16284J.i(i4);
        }
        if (i5 == null) {
            J j4 = this.f16280F;
            if (j4 == null) {
                return null;
            }
            return j4.o(i4);
        }
        return i5;
    }

    @l3.d
    public final Map<String, C0939p> p() {
        return kotlin.collections.V.D0(this.f16285K);
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String q() {
        String str = this.f16281G;
        if (str == null) {
            return String.valueOf(this.f16286L);
        }
        return str;
    }

    @androidx.annotation.D
    public final int t() {
        return this.f16286L;
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f16281G;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f16286L));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f16287M;
        if (str2 != null && !kotlin.text.q.S1(str2)) {
            sb.append(" route=");
            sb.append(this.f16287M);
        }
        if (this.f16282H != null) {
            sb.append(" label=");
            sb.append(this.f16282H);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "sb.toString()");
        return sb2;
    }

    @l3.e
    public final CharSequence u() {
        return this.f16282H;
    }

    @l3.d
    public final String v() {
        return this.f16279E;
    }

    @l3.e
    public final J w() {
        return this.f16280F;
    }

    @l3.e
    public final String x() {
        return this.f16287M;
    }

    public boolean y(@l3.d Uri deepLink) {
        kotlin.jvm.internal.F.p(deepLink, "deepLink");
        return z(new D(deepLink, null, null));
    }

    public boolean z(@l3.d D deepLinkRequest) {
        kotlin.jvm.internal.F.p(deepLinkRequest, "deepLinkRequest");
        if (A(deepLinkRequest) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(@l3.d c0<? extends F> navigator) {
        this(d0.f16421b.a(navigator.getClass()));
        kotlin.jvm.internal.F.p(navigator, "navigator");
    }
}
