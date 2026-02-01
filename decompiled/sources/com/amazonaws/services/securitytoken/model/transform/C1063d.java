package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult;
import com.amazonaws.transform.j;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1063d implements com.amazonaws.transform.m<AssumeRoleWithSAMLResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static C1063d f24198a;

    public static C1063d b() {
        if (f24198a == null) {
            f24198a = new C1063d();
        }
        return f24198a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AssumeRoleWithSAMLResult a(com.amazonaws.transform.l lVar) throws Exception {
        AssumeRoleWithSAMLResult assumeRoleWithSAMLResult = new AssumeRoleWithSAMLResult();
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
                    assumeRoleWithSAMLResult.k(j.b().a(lVar));
                } else if (lVar.i("AssumedRoleUser", i4)) {
                    assumeRoleWithSAMLResult.i(C1067h.b().a(lVar));
                } else if (lVar.i("PackedPolicySize", i4)) {
                    assumeRoleWithSAMLResult.n(j.i.b().a(lVar));
                } else if (lVar.i("Subject", i4)) {
                    assumeRoleWithSAMLResult.o(j.k.b().a(lVar));
                } else if (lVar.i("SubjectType", i4)) {
                    assumeRoleWithSAMLResult.p(j.k.b().a(lVar));
                } else if (lVar.i("Issuer", i4)) {
                    assumeRoleWithSAMLResult.l(j.k.b().a(lVar));
                } else if (lVar.i("Audience", i4)) {
                    assumeRoleWithSAMLResult.j(j.k.b().a(lVar));
                } else if (lVar.i("NameQualifier", i4)) {
                    assumeRoleWithSAMLResult.m(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return assumeRoleWithSAMLResult;
    }
}
