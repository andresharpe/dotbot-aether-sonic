package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.B;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.P;
import com.android.volley.e;
import com.android.volley.p;
import com.android.volley.s;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.text.F;

/* loaded from: classes.dex */
public abstract class Request<T> implements Comparable<Request<T>> {

    /* renamed from: V, reason: collision with root package name */
    private static final String f24375V = "UTF-8";

    /* renamed from: E, reason: collision with root package name */
    private final s.a f24376E;

    /* renamed from: F, reason: collision with root package name */
    private final int f24377F;

    /* renamed from: G, reason: collision with root package name */
    private final String f24378G;

    /* renamed from: H, reason: collision with root package name */
    private final int f24379H;

    /* renamed from: I, reason: collision with root package name */
    private final Object f24380I;

    /* renamed from: J, reason: collision with root package name */
    @P
    @B("mLock")
    private p.a f24381J;

    /* renamed from: K, reason: collision with root package name */
    private Integer f24382K;

    /* renamed from: L, reason: collision with root package name */
    private n f24383L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f24384M;

    /* renamed from: N, reason: collision with root package name */
    @B("mLock")
    private boolean f24385N;

    /* renamed from: O, reason: collision with root package name */
    @B("mLock")
    private boolean f24386O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f24387P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f24388Q;

    /* renamed from: R, reason: collision with root package name */
    private r f24389R;

    /* renamed from: S, reason: collision with root package name */
    @P
    private e.a f24390S;

    /* renamed from: T, reason: collision with root package name */
    private Object f24391T;

    /* renamed from: U, reason: collision with root package name */
    @B("mLock")
    private c f24392U;

    /* loaded from: classes.dex */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f24393E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f24394F;

        a(String str, long j4) {
            this.f24393E = str;
            this.f24394F = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            Request.this.f24376E.a(this.f24393E, this.f24394F);
            Request.this.f24376E.b(Request.this.toString());
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f24396a = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f24397b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f24398c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f24399d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f24400e = 3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f24401f = 4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f24402g = 5;

        /* renamed from: h, reason: collision with root package name */
        public static final int f24403h = 6;

        /* renamed from: i, reason: collision with root package name */
        public static final int f24404i = 7;
    }

    /* loaded from: classes.dex */
    interface c {
        void a(Request<?> request);

        void b(Request<?> request, p<?> pVar);
    }

    @Deprecated
    public Request(String str, p.a aVar) {
        this(-1, str, aVar);
    }

    private byte[] k(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue(), str));
                    sb.append(F.f52748d);
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("Encoding not supported: " + str, e4);
        }
    }

    private static int l(String str) {
        Uri parse;
        String host;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            return host.hashCode();
        }
        return 0;
    }

    public Priority A() {
        return Priority.NORMAL;
    }

    public r B() {
        return this.f24389R;
    }

    public final int C() {
        Integer num = this.f24382K;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object D() {
        return this.f24391T;
    }

    public final int E() {
        return B().b();
    }

    public int F() {
        return this.f24379H;
    }

    public String G() {
        return this.f24378G;
    }

    public boolean H() {
        boolean z3;
        synchronized (this.f24380I) {
            z3 = this.f24386O;
        }
        return z3;
    }

    public boolean I() {
        boolean z3;
        synchronized (this.f24380I) {
            z3 = this.f24385N;
        }
        return z3;
    }

    public void J() {
        synchronized (this.f24380I) {
            this.f24386O = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K() {
        c cVar;
        synchronized (this.f24380I) {
            cVar = this.f24392U;
        }
        if (cVar != null) {
            cVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(p<?> pVar) {
        c cVar;
        synchronized (this.f24380I) {
            cVar = this.f24392U;
        }
        if (cVar != null) {
            cVar.b(this, pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VolleyError M(VolleyError volleyError) {
        return volleyError;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract p<T> N(l lVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i4) {
        n nVar = this.f24383L;
        if (nVar != null) {
            nVar.m(this, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> P(e.a aVar) {
        this.f24390S = aVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(c cVar) {
        synchronized (this.f24380I) {
            this.f24392U = cVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> R(n nVar) {
        this.f24383L = nVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> S(r rVar) {
        this.f24389R = rVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> T(int i4) {
        this.f24382K = Integer.valueOf(i4);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> U(boolean z3) {
        this.f24384M = z3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> V(boolean z3) {
        this.f24388Q = z3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> W(boolean z3) {
        this.f24387P = z3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> X(Object obj) {
        this.f24391T = obj;
        return this;
    }

    public final boolean Y() {
        return this.f24384M;
    }

    public final boolean Z() {
        return this.f24388Q;
    }

    public final boolean a0() {
        return this.f24387P;
    }

    public void e(String str) {
        if (s.a.f24527c) {
            this.f24376E.a(str, Thread.currentThread().getId());
        }
    }

    @InterfaceC0566i
    public void f() {
        synchronized (this.f24380I) {
            this.f24385N = true;
            this.f24381J = null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(Request<T> request) {
        Priority A3 = A();
        Priority A4 = request.A();
        if (A3 == A4) {
            return this.f24382K.intValue() - request.f24382K.intValue();
        }
        return A4.ordinal() - A3.ordinal();
    }

    public void i(VolleyError volleyError) {
        p.a aVar;
        synchronized (this.f24380I) {
            aVar = this.f24381J;
        }
        if (aVar != null) {
            aVar.c(volleyError);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void j(T t3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str) {
        n nVar = this.f24383L;
        if (nVar != null) {
            nVar.g(this);
        }
        if (s.a.f24527c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
            } else {
                this.f24376E.a(str, id);
                this.f24376E.b(toString());
            }
        }
    }

    public byte[] n() throws AuthFailureError {
        Map<String, String> u3 = u();
        if (u3 != null && u3.size() > 0) {
            return k(u3, v());
        }
        return null;
    }

    public String o() {
        return "application/x-www-form-urlencoded; charset=" + v();
    }

    @P
    public e.a p() {
        return this.f24390S;
    }

    public String q() {
        String G3 = G();
        int t3 = t();
        if (t3 != 0 && t3 != -1) {
            return Integer.toString(t3) + '-' + G3;
        }
        return G3;
    }

    @P
    public p.a r() {
        p.a aVar;
        synchronized (this.f24380I) {
            aVar = this.f24381J;
        }
        return aVar;
    }

    public Map<String, String> s() throws AuthFailureError {
        return Collections.emptyMap();
    }

    public int t() {
        return this.f24377F;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(F());
        StringBuilder sb = new StringBuilder();
        if (I()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(G());
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(A());
        sb.append(" ");
        sb.append(this.f24382K);
        return sb.toString();
    }

    @P
    protected Map<String, String> u() throws AuthFailureError {
        return null;
    }

    protected String v() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] w() throws AuthFailureError {
        Map<String, String> y3 = y();
        if (y3 != null && y3.size() > 0) {
            return k(y3, z());
        }
        return null;
    }

    @Deprecated
    public String x() {
        return o();
    }

    @P
    @Deprecated
    protected Map<String, String> y() throws AuthFailureError {
        return u();
    }

    @Deprecated
    protected String z() {
        return v();
    }

    public Request(int i4, String str, @P p.a aVar) {
        this.f24376E = s.a.f24527c ? new s.a() : null;
        this.f24380I = new Object();
        this.f24384M = true;
        this.f24385N = false;
        this.f24386O = false;
        this.f24387P = false;
        this.f24388Q = false;
        this.f24390S = null;
        this.f24377F = i4;
        this.f24378G = str;
        this.f24381J = aVar;
        S(new g());
        this.f24379H = l(str);
    }
}
