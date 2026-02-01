package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.Tag;

/* loaded from: classes.dex */
class G {

    /* renamed from: a, reason: collision with root package name */
    private static G f24195a;

    G() {
    }

    public static G a() {
        if (f24195a == null) {
            f24195a = new G();
        }
        return f24195a;
    }

    public void b(Tag tag, com.amazonaws.f<?> fVar, String str) {
        if (tag.a() != null) {
            fVar.o(str + "Key", com.amazonaws.util.w.k(tag.a()));
        }
        if (tag.b() != null) {
            fVar.o(str + "Value", com.amazonaws.util.w.k(tag.b()));
        }
    }
}
