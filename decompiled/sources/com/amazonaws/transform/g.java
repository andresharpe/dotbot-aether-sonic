package com.amazonaws.transform;

import com.amazonaws.util.json.AwsJsonToken;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g<V> implements m<Map<String, V>, c> {

    /* renamed from: a, reason: collision with root package name */
    private final m<V, c> f24218a;

    public g(m<V, c> mVar) {
        this.f24218a = mVar;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map<String, V> a(c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (c4.peek() == AwsJsonToken.VALUE_NULL) {
            c4.f();
            return null;
        }
        HashMap hashMap = new HashMap();
        c4.b();
        while (c4.hasNext()) {
            hashMap.put(c4.h(), this.f24218a.a(cVar));
        }
        c4.a();
        return hashMap;
    }
}
