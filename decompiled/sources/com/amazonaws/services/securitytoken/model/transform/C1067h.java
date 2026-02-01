package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.AssumedRoleUser;
import com.amazonaws.transform.j;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1067h implements com.amazonaws.transform.m<AssumedRoleUser, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static C1067h f24201a;

    C1067h() {
    }

    public static C1067h b() {
        if (f24201a == null) {
            f24201a = new C1067h();
        }
        return f24201a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AssumedRoleUser a(com.amazonaws.transform.l lVar) throws Exception {
        AssumedRoleUser assumedRoleUser = new AssumedRoleUser();
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
                if (lVar.i("AssumedRoleId", i4)) {
                    assumedRoleUser.d(j.k.b().a(lVar));
                } else if (lVar.i("Arn", i4)) {
                    assumedRoleUser.c(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return assumedRoleUser;
    }
}
