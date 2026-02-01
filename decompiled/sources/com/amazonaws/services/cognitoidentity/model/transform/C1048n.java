package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1048n implements com.amazonaws.transform.m<DescribeIdentityResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1048n f24106a;

    public static C1048n b() {
        if (f24106a == null) {
            f24106a = new C1048n();
        }
        return f24106a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public DescribeIdentityResult a(com.amazonaws.transform.c cVar) throws Exception {
        DescribeIdentityResult describeIdentityResult = new DescribeIdentityResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityId")) {
                describeIdentityResult.f(i.k.b().a(cVar));
            } else if (h4.equals("Logins")) {
                describeIdentityResult.h(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("CreationDate")) {
                describeIdentityResult.e(i.f.b().a(cVar));
            } else if (h4.equals("LastModifiedDate")) {
                describeIdentityResult.g(i.f.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return describeIdentityResult;
    }
}
