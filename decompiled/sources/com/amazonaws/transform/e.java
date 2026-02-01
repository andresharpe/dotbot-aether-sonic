package com.amazonaws.transform;

import com.amazonaws.util.json.AwsJsonToken;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e<T> implements m<List<T>, c> {

    /* renamed from: a, reason: collision with root package name */
    private final m<T, c> f24215a;

    public e(m<T, c> mVar) {
        this.f24215a = mVar;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<T> a(c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (c4.peek() == AwsJsonToken.VALUE_NULL) {
            c4.f();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c4.d();
        while (c4.hasNext()) {
            arrayList.add(this.f24215a.a(cVar));
        }
        c4.c();
        return arrayList;
    }
}
