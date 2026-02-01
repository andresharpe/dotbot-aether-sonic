package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.GetCallerIdentityResult;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
public class s implements com.amazonaws.transform.m<GetCallerIdentityResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static s f24208a;

    public static s b() {
        if (f24208a == null) {
            f24208a = new s();
        }
        return f24208a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetCallerIdentityResult a(com.amazonaws.transform.l lVar) throws Exception {
        GetCallerIdentityResult getCallerIdentityResult = new GetCallerIdentityResult();
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
                if (lVar.i("UserId", i4)) {
                    getCallerIdentityResult.f(j.k.b().a(lVar));
                } else if (lVar.i("Account", i4)) {
                    getCallerIdentityResult.d(j.k.b().a(lVar));
                } else if (lVar.i("Arn", i4)) {
                    getCallerIdentityResult.e(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return getCallerIdentityResult;
    }
}
