package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.Tag;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
class H implements com.amazonaws.transform.m<Tag, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static H f24196a;

    H() {
    }

    public static H b() {
        if (f24196a == null) {
            f24196a = new H();
        }
        return f24196a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Tag a(com.amazonaws.transform.l lVar) throws Exception {
        Tag tag = new Tag();
        int a4 = lVar.a();
        int i4 = a4 + 1;
        if (lVar.d()) {
            i4 = a4 + 3;
        }
        while (true) {
            int e4 = lVar.e();
            if (e4 == 1) {
                break;
            }
            if (e4 == 2) {
                if (lVar.i("Key", i4)) {
                    tag.c(j.k.b().a(lVar));
                } else if (lVar.i("Value", i4)) {
                    tag.d(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return tag;
    }
}
