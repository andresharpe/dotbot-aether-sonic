package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* renamed from: androidx.navigation.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947y {

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private static final b f16630l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    private static final Pattern f16631m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final String f16632a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final String f16633b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final String f16634c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final List<String> f16635d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final Map<String, d> f16636e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private String f16637f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final kotlin.A f16638g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16639h;

    /* renamed from: i, reason: collision with root package name */
    @l3.e
    private String f16640i;

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private final kotlin.A f16641j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16642k;

    /* renamed from: androidx.navigation.y$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        public static final C0157a f16643d = new C0157a(null);

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private String f16644a;

        /* renamed from: b, reason: collision with root package name */
        @l3.e
        private String f16645b;

        /* renamed from: c, reason: collision with root package name */
        @l3.e
        private String f16646c;

        /* renamed from: androidx.navigation.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0157a {
            public /* synthetic */ C0157a(C2197u c2197u) {
                this();
            }

            @W2.n
            @l3.d
            public final a a(@l3.d String action) {
                kotlin.jvm.internal.F.p(action, "action");
                if (action.length() > 0) {
                    a aVar = new a();
                    aVar.e(action);
                    return aVar;
                }
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }

            @W2.n
            @l3.d
            public final a b(@l3.d String mimeType) {
                kotlin.jvm.internal.F.p(mimeType, "mimeType");
                a aVar = new a();
                aVar.f(mimeType);
                return aVar;
            }

            @W2.n
            @l3.d
            public final a c(@l3.d String uriPattern) {
                kotlin.jvm.internal.F.p(uriPattern, "uriPattern");
                a aVar = new a();
                aVar.g(uriPattern);
                return aVar;
            }

            private C0157a() {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a() {
        }

        @W2.n
        @l3.d
        public static final a b(@l3.d String str) {
            return f16643d.a(str);
        }

        @W2.n
        @l3.d
        public static final a c(@l3.d String str) {
            return f16643d.b(str);
        }

        @W2.n
        @l3.d
        public static final a d(@l3.d String str) {
            return f16643d.c(str);
        }

        @l3.d
        public final C0947y a() {
            return new C0947y(this.f16644a, this.f16645b, this.f16646c);
        }

        @l3.d
        public final a e(@l3.d String action) {
            kotlin.jvm.internal.F.p(action, "action");
            if (action.length() > 0) {
                this.f16645b = action;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        @l3.d
        public final a f(@l3.d String mimeType) {
            kotlin.jvm.internal.F.p(mimeType, "mimeType");
            this.f16646c = mimeType;
            return this;
        }

        @l3.d
        public final a g(@l3.d String uriPattern) {
            kotlin.jvm.internal.F.p(uriPattern, "uriPattern");
            this.f16644a = uriPattern;
            return this;
        }
    }

    /* renamed from: androidx.navigation.y$b */
    /* loaded from: classes.dex */
    private static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.navigation.y$c */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private String f16647E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private String f16648F;

        public c(@l3.d String mimeType) {
            List H3;
            kotlin.jvm.internal.F.p(mimeType, "mimeType");
            List<String> p4 = new Regex("/").p(mimeType, 0);
            if (!p4.isEmpty()) {
                ListIterator<String> listIterator = p4.listIterator(p4.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        H3 = kotlin.collections.D.J5(p4, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            H3 = CollectionsKt__CollectionsKt.H();
            this.f16647E = (String) H3.get(0);
            this.f16648F = (String) H3.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@l3.d c other) {
            int i4;
            kotlin.jvm.internal.F.p(other, "other");
            if (kotlin.jvm.internal.F.g(this.f16647E, other.f16647E)) {
                i4 = 2;
            } else {
                i4 = 0;
            }
            if (kotlin.jvm.internal.F.g(this.f16648F, other.f16648F)) {
                return i4 + 1;
            }
            return i4;
        }

        @l3.d
        public final String e() {
            return this.f16648F;
        }

        @l3.d
        public final String f() {
            return this.f16647E;
        }

        public final void g(@l3.d String str) {
            kotlin.jvm.internal.F.p(str, "<set-?>");
            this.f16648F = str;
        }

        public final void i(@l3.d String str) {
            kotlin.jvm.internal.F.p(str, "<set-?>");
            this.f16647E = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.navigation.y$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private String f16649a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final List<String> f16650b = new ArrayList();

        public final void a(@l3.d String name) {
            kotlin.jvm.internal.F.p(name, "name");
            this.f16650b.add(name);
        }

        @l3.d
        public final String b(int i4) {
            return this.f16650b.get(i4);
        }

        @l3.d
        public final List<String> c() {
            return this.f16650b;
        }

        @l3.e
        public final String d() {
            return this.f16649a;
        }

        public final void e(@l3.e String str) {
            this.f16649a = str;
        }

        public final int f() {
            return this.f16650b.size();
        }
    }

    /* renamed from: androidx.navigation.y$e */
    /* loaded from: classes.dex */
    static final class e extends Lambda implements X2.a<Pattern> {
        e() {
            super(0);
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pattern n() {
            String str = C0947y.this.f16640i;
            if (str == null) {
                return null;
            }
            return Pattern.compile(str);
        }
    }

    /* renamed from: androidx.navigation.y$f */
    /* loaded from: classes.dex */
    static final class f extends Lambda implements X2.a<Pattern> {
        f() {
            super(0);
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pattern n() {
            String str = C0947y.this.f16637f;
            if (str == null) {
                return null;
            }
            return Pattern.compile(str, 2);
        }
    }

    public C0947y(@l3.e String str, @l3.e String str2, @l3.e String str3) {
        kotlin.A a4;
        kotlin.A a5;
        String i22;
        String i23;
        String i24;
        this.f16632a = str;
        this.f16633b = str2;
        this.f16634c = str3;
        this.f16635d = new ArrayList();
        this.f16636e = new LinkedHashMap();
        a4 = kotlin.C.a(new f());
        this.f16638g = a4;
        a5 = kotlin.C.a(new e());
        this.f16641j = a5;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f16639h = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f16631m.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (this.f16639h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    kotlin.jvm.internal.F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    kotlin.jvm.internal.F.o(fillInPattern, "fillInPattern");
                    this.f16642k = c(substring, sb, fillInPattern);
                }
                for (String paramName : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(paramName);
                    if (queryParameter != null) {
                        Matcher matcher2 = fillInPattern.matcher(queryParameter);
                        d dVar = new d();
                        int i4 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group(1);
                            if (group != null) {
                                dVar.a(group);
                                String substring2 = queryParameter.substring(i4, matcher2.start());
                                kotlin.jvm.internal.F.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb2.append(Pattern.quote(substring2));
                                sb2.append("(.+?)?");
                                i4 = matcher2.end();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                        if (i4 < queryParameter.length()) {
                            String substring3 = queryParameter.substring(i4);
                            kotlin.jvm.internal.F.o(substring3, "this as java.lang.String).substring(startIndex)");
                            sb2.append(Pattern.quote(substring3));
                        }
                        String sb3 = sb2.toString();
                        kotlin.jvm.internal.F.o(sb3, "argRegex.toString()");
                        i24 = kotlin.text.z.i2(sb3, ".*", "\\E.*\\Q", false, 4, null);
                        dVar.e(i24);
                        Map<String, d> map = this.f16636e;
                        kotlin.jvm.internal.F.o(paramName, "paramName");
                        map.put(paramName, dVar);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            } else {
                kotlin.jvm.internal.F.o(fillInPattern, "fillInPattern");
                this.f16642k = c(str, sb, fillInPattern);
            }
            String sb4 = sb.toString();
            kotlin.jvm.internal.F.o(sb4, "uriRegex.toString()");
            i23 = kotlin.text.z.i2(sb4, ".*", "\\E.*\\Q", false, 4, null);
            this.f16637f = i23;
        }
        if (this.f16634c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f16634c).matches()) {
                c cVar = new c(this.f16634c);
                i22 = kotlin.text.z.i2("^(" + cVar.f() + "|[*]+)/(" + cVar.e() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
                this.f16640i = i22;
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + ((Object) g()) + " does not match to required \"type/subtype\" format").toString());
        }
    }

    private final boolean c(String str, StringBuilder sb, Pattern pattern) {
        boolean T22;
        Matcher matcher = pattern.matcher(str);
        T22 = kotlin.text.A.T2(str, ".*", false, 2, null);
        boolean z3 = !T22;
        int i4 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f16635d.add(group);
                String substring = str.substring(i4, matcher.start());
                kotlin.jvm.internal.F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i4 = matcher.end();
                z3 = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i4 < str.length()) {
            String substring2 = str.substring(i4);
            kotlin.jvm.internal.F.o(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z3;
    }

    private final Pattern i() {
        return (Pattern) this.f16641j.getValue();
    }

    private final Pattern j() {
        return (Pattern) this.f16638g.getValue();
    }

    private final boolean m(String str) {
        boolean z3;
        boolean z4;
        if (str == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str2 = this.f16633b;
        if (str2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4 && (str == null || kotlin.jvm.internal.F.g(str2, str))) {
            return true;
        }
        return false;
    }

    private final boolean n(String str) {
        boolean z3;
        boolean z4;
        if (str == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f16634c != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            if (str == null) {
                return true;
            }
            Pattern i4 = i();
            kotlin.jvm.internal.F.m(i4);
            if (i4.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean o(Uri uri) {
        boolean z3;
        boolean z4;
        if (uri == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (j() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            if (uri == null) {
                return true;
            }
            Pattern j4 = j();
            kotlin.jvm.internal.F.m(j4);
            if (j4.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean r(Bundle bundle, String str, String str2, C0939p c0939p) {
        if (c0939p != null) {
            try {
                c0939p.b().g(bundle, str, str2);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        }
        bundle.putString(str, str2);
        return false;
    }

    @l3.e
    public final String d() {
        return this.f16633b;
    }

    @l3.d
    public final List<String> e() {
        List<String> D4;
        List<String> list = this.f16635d;
        Collection<d> values = this.f16636e.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            kotlin.collections.A.q0(arrayList, ((d) it.next()).c());
        }
        D4 = kotlin.collections.D.D4(list, arrayList);
        return D4;
    }

    public boolean equals(@l3.e Object obj) {
        if (obj == null || !(obj instanceof C0947y)) {
            return false;
        }
        C0947y c0947y = (C0947y) obj;
        if (!kotlin.jvm.internal.F.g(this.f16632a, c0947y.f16632a) || !kotlin.jvm.internal.F.g(this.f16633b, c0947y.f16633b) || !kotlin.jvm.internal.F.g(this.f16634c, c0947y.f16634c)) {
            return false;
        }
        return true;
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle f(@l3.d Uri deepLink, @l3.d Map<String, C0939p> arguments) {
        Matcher matcher;
        Matcher matcher2;
        String str;
        kotlin.jvm.internal.F.p(deepLink, "deepLink");
        kotlin.jvm.internal.F.p(arguments, "arguments");
        Pattern j4 = j();
        if (j4 == null) {
            matcher = null;
        } else {
            matcher = j4.matcher(deepLink.toString());
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f16635d.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            String str2 = this.f16635d.get(i4);
            String value = Uri.decode(matcher.group(i5));
            C0939p c0939p = arguments.get(str2);
            kotlin.jvm.internal.F.o(value, "value");
            if (r(bundle, str2, value, c0939p)) {
                return null;
            }
            i4 = i5;
        }
        if (this.f16639h) {
            for (String str3 : this.f16636e.keySet()) {
                d dVar = this.f16636e.get(str3);
                String queryParameter = deepLink.getQueryParameter(str3);
                if (queryParameter != null) {
                    kotlin.jvm.internal.F.m(dVar);
                    matcher2 = Pattern.compile(dVar.d()).matcher(queryParameter);
                    if (!matcher2.matches()) {
                        return null;
                    }
                } else {
                    matcher2 = null;
                }
                kotlin.jvm.internal.F.m(dVar);
                int f4 = dVar.f();
                int i6 = 0;
                while (i6 < f4) {
                    int i7 = i6 + 1;
                    if (matcher2 != null) {
                        str = matcher2.group(i7);
                    } else {
                        str = null;
                    }
                    String b4 = dVar.b(i6);
                    C0939p c0939p2 = arguments.get(b4);
                    if (str != null) {
                        if (!kotlin.jvm.internal.F.g(str, '{' + b4 + '}') && r(bundle, b4, str, c0939p2)) {
                            return null;
                        }
                    }
                    i6 = i7;
                }
            }
        }
        for (Map.Entry<String, C0939p> entry : arguments.entrySet()) {
            String key = entry.getKey();
            C0939p value2 = entry.getValue();
            if (value2 != null && !value2.d() && !value2.c() && !bundle.containsKey(key)) {
                return null;
            }
        }
        return bundle;
    }

    @l3.e
    public final String g() {
        return this.f16634c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int h(@l3.d String mimeType) {
        kotlin.jvm.internal.F.p(mimeType, "mimeType");
        if (this.f16634c != null) {
            Pattern i4 = i();
            kotlin.jvm.internal.F.m(i4);
            if (i4.matcher(mimeType).matches()) {
                return new c(this.f16634c).compareTo(new c(mimeType));
            }
        }
        return -1;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f16632a;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f16633b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str3 = this.f16634c;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }

    @l3.e
    public final String k() {
        return this.f16632a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean l() {
        return this.f16642k;
    }

    public final boolean p(@l3.d Uri uri) {
        kotlin.jvm.internal.F.p(uri, "uri");
        return q(new D(uri, null, null));
    }

    public final boolean q(@l3.d D deepLinkRequest) {
        kotlin.jvm.internal.F.p(deepLinkRequest, "deepLinkRequest");
        if (!o(deepLinkRequest.c()) || !m(deepLinkRequest.a())) {
            return false;
        }
        return n(deepLinkRequest.b());
    }

    public final void s(boolean z3) {
        this.f16642k = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C0947y(@l3.d String uri) {
        this(uri, null, null);
        kotlin.jvm.internal.F.p(uri, "uri");
    }
}
