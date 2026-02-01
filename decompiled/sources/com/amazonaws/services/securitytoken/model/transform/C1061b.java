package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.AssumeRoleResult;
import com.amazonaws.transform.j;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1061b implements com.amazonaws.transform.m<AssumeRoleResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static C1061b f24197a;

    public static C1061b b() {
        if (f24197a == null) {
            f24197a = new C1061b();
        }
        return f24197a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AssumeRoleResult a(com.amazonaws.transform.l lVar) throws Exception {
        AssumeRoleResult assumeRoleResult = new AssumeRoleResult();
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
                    assumeRoleResult.e(j.b().a(lVar));
                } else if (lVar.i("AssumedRoleUser", i4)) {
                    assumeRoleResult.d(C1067h.b().a(lVar));
                } else if (lVar.i("PackedPolicySize", i4)) {
                    assumeRoleResult.f(j.i.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return assumeRoleResult;
    }
}
