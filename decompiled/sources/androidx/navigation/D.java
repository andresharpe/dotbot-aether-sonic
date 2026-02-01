package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.C2197u;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final Uri f16270a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final String f16271b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final String f16272c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        public static final C0154a f16273d = new C0154a(null);

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private Uri f16274a;

        /* renamed from: b, reason: collision with root package name */
        @l3.e
        private String f16275b;

        /* renamed from: c, reason: collision with root package name */
        @l3.e
        private String f16276c;

        /* renamed from: androidx.navigation.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0154a {
            public /* synthetic */ C0154a(C2197u c2197u) {
                this();
            }

            @W2.n
            @l3.d
            public final a a(@l3.d String action) {
                kotlin.jvm.internal.F.p(action, "action");
                if (action.length() > 0) {
                    a aVar = new a(null);
                    aVar.e(action);
                    return aVar;
                }
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }

            @W2.n
            @l3.d
            public final a b(@l3.d String mimeType) {
                kotlin.jvm.internal.F.p(mimeType, "mimeType");
                a aVar = new a(null);
                aVar.f(mimeType);
                return aVar;
            }

            @W2.n
            @l3.d
            public final a c(@l3.d Uri uri) {
                kotlin.jvm.internal.F.p(uri, "uri");
                a aVar = new a(null);
                aVar.g(uri);
                return aVar;
            }

            private C0154a() {
            }
        }

        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public static final a b(@l3.d String str) {
            return f16273d.a(str);
        }

        @W2.n
        @l3.d
        public static final a c(@l3.d String str) {
            return f16273d.b(str);
        }

        @W2.n
        @l3.d
        public static final a d(@l3.d Uri uri) {
            return f16273d.c(uri);
        }

        @l3.d
        public final D a() {
            return new D(this.f16274a, this.f16275b, this.f16276c);
        }

        @l3.d
        public final a e(@l3.d String action) {
            kotlin.jvm.internal.F.p(action, "action");
            if (action.length() > 0) {
                this.f16275b = action;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
        }

        @l3.d
        public final a f(@l3.d String mimeType) {
            kotlin.jvm.internal.F.p(mimeType, "mimeType");
            if (new Regex("^[-\\w*.]+/[-\\w+*.]+$").k(mimeType)) {
                this.f16276c = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        @l3.d
        public final a g(@l3.d Uri uri) {
            kotlin.jvm.internal.F.p(uri, "uri");
            this.f16274a = uri;
            return this;
        }

        private a() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public D(@l3.e Uri uri, @l3.e String str, @l3.e String str2) {
        this.f16270a = uri;
        this.f16271b = str;
        this.f16272c = str2;
    }

    @l3.e
    public String a() {
        return this.f16271b;
    }

    @l3.e
    public String b() {
        return this.f16272c;
    }

    @l3.e
    public Uri c() {
        return this.f16270a;
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb.append(" action=");
            sb.append(a());
        }
        if (b() != null) {
            sb.append(" mimetype=");
            sb.append(b());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public D(@l3.d Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        kotlin.jvm.internal.F.p(intent, "intent");
    }
}
