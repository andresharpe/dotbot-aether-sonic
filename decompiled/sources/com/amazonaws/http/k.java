package com.amazonaws.http;

import com.amazonaws.util.w;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23668a = "UTF-8";

    private void a(Map<String, String> map, com.amazonaws.f<?> fVar, e eVar, com.amazonaws.d dVar) {
        URI s4 = fVar.s();
        String host = s4.getHost();
        if (com.amazonaws.util.n.h(s4)) {
            host = host + ":" + s4.getPort();
        }
        map.put(h.f23648g, host);
        for (Map.Entry<String, String> entry : fVar.a().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || map.get("Content-Type").isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + w.n("UTF-8"));
        }
        if (eVar != null && eVar.b() != null) {
            map.put(h.f23650i, c(dVar, eVar.b()));
        }
    }

    private String c(com.amazonaws.d dVar, String str) {
        if (dVar.q().contains(str)) {
            return dVar.q();
        }
        return dVar.q() + " " + str;
    }

    public j b(com.amazonaws.f<?> fVar, com.amazonaws.d dVar, e eVar) {
        boolean z3;
        boolean z4 = true;
        String b4 = com.amazonaws.util.n.b(fVar.s().toString(), fVar.p(), true);
        String c4 = com.amazonaws.util.n.c(fVar);
        HttpMethodName l4 = fVar.l();
        if (fVar.getContent() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        HttpMethodName httpMethodName = HttpMethodName.POST;
        if (l4 == httpMethodName && !z3) {
            z4 = false;
        }
        if (c4 != null && z4) {
            b4 = b4 + "?" + c4;
        }
        HashMap hashMap = new HashMap();
        a(hashMap, fVar, eVar, dVar);
        InputStream content = fVar.getContent();
        HttpMethodName httpMethodName2 = HttpMethodName.PATCH;
        if (l4 == httpMethodName2) {
            hashMap.put("X-HTTP-Method-Override", httpMethodName2.toString());
            l4 = httpMethodName;
        }
        if (l4 == httpMethodName && fVar.getContent() == null && c4 != null) {
            byte[] bytes = c4.getBytes(w.f24366b);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            hashMap.put(h.f23644c, String.valueOf(bytes.length));
            content = byteArrayInputStream;
        }
        if (dVar.s() && hashMap.get("Accept-Encoding") == null) {
            hashMap.put("Accept-Encoding", "gzip");
        } else {
            hashMap.put("Accept-Encoding", "identity");
        }
        j jVar = new j(l4.toString(), URI.create(b4), hashMap, content);
        jVar.g(fVar.isStreaming());
        return jVar;
    }
}
