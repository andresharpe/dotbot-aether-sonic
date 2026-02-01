package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.C1070c;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/* renamed from: com.amazonaws.auth.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1024b extends n implements G, C, y {

    /* renamed from: j, reason: collision with root package name */
    protected static final String f23414j = "AWS4-HMAC-SHA256";

    /* renamed from: k, reason: collision with root package name */
    protected static final String f23415k = "aws4_request";

    /* renamed from: l, reason: collision with root package name */
    private static final String f23416l = "yyyyMMdd";

    /* renamed from: m, reason: collision with root package name */
    private static final String f23417m = "yyyyMMdd'T'HHmmss'Z'";

    /* renamed from: n, reason: collision with root package name */
    private static final long f23418n = 1000;

    /* renamed from: o, reason: collision with root package name */
    private static final long f23419o = 604800;

    /* renamed from: p, reason: collision with root package name */
    protected static final com.amazonaws.logging.c f23420p = LogFactory.c(C1024b.class);

    /* renamed from: f, reason: collision with root package name */
    protected String f23421f;

    /* renamed from: g, reason: collision with root package name */
    protected String f23422g;

    /* renamed from: h, reason: collision with root package name */
    protected Date f23423h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f23424i;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.amazonaws.auth.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f23425a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23426b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f23427c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f23428d;

        public a(String str, String str2, byte[] bArr, byte[] bArr2) {
            this.f23425a = str;
            this.f23426b = str2;
            this.f23427c = bArr;
            this.f23428d = bArr2;
        }

        public String a() {
            return this.f23425a;
        }

        public byte[] b() {
            byte[] bArr = this.f23427c;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public String c() {
            return this.f23426b;
        }

        public byte[] d() {
            byte[] bArr = this.f23428d;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public C1024b() {
        this(true);
    }

    protected void D(com.amazonaws.f<?> fVar) {
        String host = fVar.s().getHost();
        if (com.amazonaws.util.n.h(fVar.s())) {
            host = host + ":" + fVar.s().getPort();
        }
        fVar.addHeader(com.amazonaws.http.h.f23648g, host);
    }

    protected String E(com.amazonaws.f<?> fVar) {
        InputStream h4 = h(fVar);
        h4.mark(-1);
        String e4 = com.amazonaws.util.g.e(u(h4));
        try {
            h4.reset();
            return e4;
        } catch (IOException e5) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e5);
        }
    }

    protected String F(com.amazonaws.f<?> fVar) {
        return E(fVar);
    }

    protected final a G(com.amazonaws.f<?> fVar, String str, String str2, String str3, String str4, InterfaceC1029g interfaceC1029g) {
        String H3 = H(fVar.s());
        String I3 = I(fVar.s());
        String str5 = str + "/" + H3 + "/" + I3 + "/" + f23415k;
        String P3 = P(str3, str2, str5, J(fVar, str4));
        String str6 = "AWS4" + interfaceC1029g.c();
        Charset charset = com.amazonaws.util.w.f24366b;
        byte[] bytes = str6.getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] z3 = z(f23415k, z(I3, z(H3, z(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
        return new a(str2, str5, z3, A(P3.getBytes(charset), z3, signingAlgorithm));
    }

    protected String H(URI uri) {
        String str = this.f23422g;
        if (str != null) {
            return str;
        }
        return C1070c.b(uri.getHost(), this.f23421f);
    }

    protected String I(URI uri) {
        String str = this.f23421f;
        if (str != null) {
            return str;
        }
        return C1070c.e(uri);
    }

    protected String J(com.amazonaws.f<?> fVar, String str) {
        String str2 = fVar.l().toString() + "\n" + o(com.amazonaws.util.n.a(fVar.s().getPath(), fVar.p()), this.f23424i) + "\n" + l(fVar) + "\n" + K(fVar) + "\n" + O(fVar) + "\n" + str;
        f23420p.a("AWS4 Canonical Request: '\"" + str2 + "\"");
        return str2;
    }

    protected String K(com.amazonaws.f<?> fVar) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(fVar.a().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (R(str)) {
                String replaceAll = com.amazonaws.util.w.n(str).replaceAll("\\s+", " ");
                String str2 = fVar.a().get(str);
                sb.append(replaceAll);
                sb.append(":");
                if (str2 != null) {
                    sb.append(str2.replaceAll("\\s+", " "));
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    protected final long L(com.amazonaws.f<?> fVar) {
        Date s4 = s(t(fVar));
        Date date = this.f23423h;
        if (date != null) {
            s4 = date;
        }
        return s4.getTime();
    }

    protected final String M(long j4) {
        return com.amazonaws.util.k.c(f23416l, new Date(j4));
    }

    protected String N(com.amazonaws.f<?> fVar, String str) {
        return str + "/" + H(fVar.s()) + "/" + I(fVar.s()) + "/" + f23415k;
    }

    protected String O(com.amazonaws.f<?> fVar) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(fVar.a().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (R(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(com.amazonaws.util.w.n(str));
            }
        }
        return sb.toString();
    }

    protected String P(String str, String str2, String str3, String str4) {
        String str5 = str + "\n" + str2 + "\n" + str3 + "\n" + com.amazonaws.util.g.e(v(str4));
        f23420p.a("AWS4 String to Sign: '\"" + str5 + "\"");
        return str5;
    }

    protected final String Q(long j4) {
        return com.amazonaws.util.k.c("yyyyMMdd'T'HHmmss'Z'", new Date(j4));
    }

    boolean R(String str) {
        if (!"date".equalsIgnoreCase(str) && !"Content-MD5".equalsIgnoreCase(str) && !"host".equalsIgnoreCase(str) && !str.startsWith("x-amz") && !str.startsWith("X-Amz")) {
            return false;
        }
        return true;
    }

    void S(Date date) {
        this.f23423h = date;
    }

    protected void T(com.amazonaws.f<?> fVar, a aVar) {
    }

    @Override // com.amazonaws.auth.G
    public void a(String str) {
        this.f23421f = str;
    }

    @Override // com.amazonaws.auth.I
    public void b(com.amazonaws.f<?> fVar, InterfaceC1029g interfaceC1029g) {
        if (interfaceC1029g instanceof o) {
            return;
        }
        InterfaceC1029g y3 = y(interfaceC1029g);
        if (y3 instanceof m) {
            e(fVar, (m) y3);
        }
        D(fVar);
        long L3 = L(fVar);
        String M3 = M(L3);
        String N3 = N(fVar, M3);
        String E3 = E(fVar);
        String Q3 = Q(L3);
        fVar.addHeader("X-Amz-Date", Q3);
        if (fVar.a().get("x-amz-content-sha256") != null && "required".equals(fVar.a().get("x-amz-content-sha256"))) {
            fVar.addHeader("x-amz-content-sha256", E3);
        }
        String str = y3.a() + "/" + N3;
        a G3 = G(fVar, M3, Q3, f23414j, E3, y3);
        fVar.addHeader(com.amazonaws.http.h.f23643b, "AWS4-HMAC-SHA256 " + ("Credential=" + str) + ", " + ("SignedHeaders=" + O(fVar)) + ", " + ("Signature=" + com.amazonaws.util.g.e(G3.d())));
        T(fVar, G3);
    }

    @Override // com.amazonaws.auth.C
    public void c(String str) {
        this.f23422g = str;
    }

    @Override // com.amazonaws.auth.y
    public void d(com.amazonaws.f<?> fVar, InterfaceC1029g interfaceC1029g, Date date) {
        long j4;
        if (interfaceC1029g instanceof o) {
            return;
        }
        if (date != null) {
            j4 = (date.getTime() - System.currentTimeMillis()) / 1000;
        } else {
            j4 = 604800;
        }
        if (j4 <= f23419o) {
            D(fVar);
            InterfaceC1029g y3 = y(interfaceC1029g);
            if (y3 instanceof m) {
                fVar.o("X-Amz-Security-Token", ((m) y3).b());
            }
            long L3 = L(fVar);
            String M3 = M(L3);
            String str = y3.a() + "/" + N(fVar, M3);
            String Q3 = Q(L3);
            fVar.o("X-Amz-Algorithm", f23414j);
            fVar.o("X-Amz-Date", Q3);
            fVar.o("X-Amz-SignedHeaders", O(fVar));
            fVar.o("X-Amz-Expires", Long.toString(j4));
            fVar.o("X-Amz-Credential", str);
            fVar.o("X-Amz-Signature", com.amazonaws.util.g.e(G(fVar, M3, Q3, f23414j, F(fVar), y3).d()));
            return;
        }
        throw new AmazonClientException("Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. The expiration date set on the current request [" + Q(date.getTime()) + "] has exceeded this limit.");
    }

    @Override // com.amazonaws.auth.n
    protected void e(com.amazonaws.f<?> fVar, m mVar) {
        fVar.addHeader("x-amz-security-token", mVar.b());
    }

    public C1024b(boolean z3) {
        this.f23424i = z3;
    }
}
