package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.transform.j;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1065f implements com.amazonaws.transform.m<AssumeRoleWithWebIdentityResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static C1065f f24199a;

    public static C1065f b() {
        if (f24199a == null) {
            f24199a = new C1065f();
        }
        return f24199a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AssumeRoleWithWebIdentityResult a(com.amazonaws.transform.l lVar) throws Exception {
        AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentityResult = new AssumeRoleWithWebIdentityResult();
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
                if (lVar.i("Credentials", i4)) {
                    assumeRoleWithWebIdentityResult.i(j.b().a(lVar));
                } else if (lVar.i("SubjectFromWebIdentityToken", i4)) {
                    assumeRoleWithWebIdentityResult.l(j.k.b().a(lVar));
                } else if (lVar.i("AssumedRoleUser", i4)) {
                    assumeRoleWithWebIdentityResult.g(C1067h.b().a(lVar));
                } else if (lVar.i("PackedPolicySize", i4)) {
                    assumeRoleWithWebIdentityResult.j(j.i.b().a(lVar));
                } else if (lVar.i("Provider", i4)) {
                    assumeRoleWithWebIdentityResult.k(j.k.b().a(lVar));
                } else if (lVar.i("Audience", i4)) {
                    assumeRoleWithWebIdentityResult.h(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return assumeRoleWithWebIdentityResult;
    }
}
