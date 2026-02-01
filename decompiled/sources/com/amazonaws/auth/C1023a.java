package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.LogFactory;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/* renamed from: com.amazonaws.auth.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1023a extends n {

    /* renamed from: g, reason: collision with root package name */
    private static final String f23408g = "X-Amzn-Authorization";

    /* renamed from: h, reason: collision with root package name */
    private static final String f23409h = "x-amz-nonce";

    /* renamed from: i, reason: collision with root package name */
    private static final String f23410i = "AWS3";

    /* renamed from: j, reason: collision with root package name */
    private static final String f23411j = "AWS3-HTTPS";

    /* renamed from: k, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23412k = LogFactory.c(C1023a.class);

    /* renamed from: f, reason: collision with root package name */
    private String f23413f;

    private String F(com.amazonaws.f<?> fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("SignedHeaders=");
        boolean z3 = true;
        for (String str : E(fVar)) {
            if (!z3) {
                sb.append(";");
            }
            sb.append(str);
            z3 = false;
        }
        return sb.toString();
    }

    protected String D(com.amazonaws.f<?> fVar) {
        List<String> E3 = E(fVar);
        for (int i4 = 0; i4 < E3.size(); i4++) {
            E3.set(i4, com.amazonaws.util.w.n(E3.get(i4)));
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : fVar.a().entrySet()) {
            if (E3.contains(com.amazonaws.util.w.n(entry.getKey()))) {
                treeMap.put(com.amazonaws.util.w.n(entry.getKey()), entry.getValue());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb.append(com.amazonaws.util.w.n((String) entry2.getKey()));
            sb.append(":");
            sb.append((String) entry2.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    protected List<String> E(com.amazonaws.f<?> fVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, String>> it = fVar.a().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            String n4 = com.amazonaws.util.w.n(key);
            if (n4.startsWith("x-amz") || "host".equals(n4)) {
                arrayList.add(key);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    void G(String str) {
        this.f23413f = str;
    }

    boolean H(com.amazonaws.f<?> fVar) {
        try {
            String n4 = com.amazonaws.util.w.n(fVar.s().toURL().getProtocol());
            if ("http".equals(n4)) {
                return false;
            }
            if ("https".equals(n4)) {
                return true;
            }
            throw new AmazonClientException("Unknown request endpoint protocol encountered while signing request: " + n4);
        } catch (MalformedURLException e4) {
            throw new AmazonClientException("Unable to parse request endpoint during signing", e4);
        }
    }

    @Override // com.amazonaws.auth.I
    public void b(com.amazonaws.f<?> fVar, InterfaceC1029g interfaceC1029g) {
        if (interfaceC1029g instanceof o) {
            return;
        }
        InterfaceC1029g y3 = y(interfaceC1029g);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        UUID.randomUUID().toString();
        String e4 = com.amazonaws.util.k.e(s(t(fVar)));
        String str = this.f23413f;
        if (str != null) {
            e4 = str;
        }
        fVar.addHeader(com.amazonaws.http.h.f23646e, e4);
        fVar.addHeader("X-Amz-Date", e4);
        String host = fVar.s().getHost();
        if (com.amazonaws.util.n.h(fVar.s())) {
            host = host + ":" + fVar.s().getPort();
        }
        fVar.addHeader(com.amazonaws.http.h.f23648g, host);
        if (y3 instanceof m) {
            e(fVar, (m) y3);
        }
        String str2 = fVar.l().toString() + "\n" + n(com.amazonaws.util.n.a(fVar.s().getPath(), fVar.p())) + "\n" + m(fVar.e()) + "\n" + D(fVar) + "\n" + r(fVar);
        byte[] v3 = v(str2);
        f23412k.a("Calculated StringToSign: " + str2);
        String C3 = C(v3, y3.c(), signingAlgorithm);
        StringBuilder sb = new StringBuilder();
        sb.append(f23410i);
        sb.append(" ");
        sb.append("AWSAccessKeyId=" + y3.a() + ",");
        sb.append("Algorithm=" + signingAlgorithm.toString() + ",");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(F(fVar));
        sb2.append(",");
        sb.append(sb2.toString());
        sb.append("Signature=" + C3);
        fVar.addHeader(f23408g, sb.toString());
    }

    @Override // com.amazonaws.auth.n
    protected void e(com.amazonaws.f<?> fVar, m mVar) {
        fVar.addHeader("x-amz-security-token", mVar.b());
    }
}
