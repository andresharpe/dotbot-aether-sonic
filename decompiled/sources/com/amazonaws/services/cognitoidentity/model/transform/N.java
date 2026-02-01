package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
public class N implements com.amazonaws.transform.m<ListTagsForResourceResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static N f24086a;

    public static N b() {
        if (f24086a == null) {
            f24086a = new N();
        }
        return f24086a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ListTagsForResourceResult a(com.amazonaws.transform.c cVar) throws Exception {
        ListTagsForResourceResult listTagsForResourceResult = new ListTagsForResourceResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            if (c4.h().equals("Tags")) {
                listTagsForResourceResult.d(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return listTagsForResourceResult;
    }
}
