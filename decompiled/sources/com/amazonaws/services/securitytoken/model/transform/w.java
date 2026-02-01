package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;

/* loaded from: classes.dex */
public class w implements com.amazonaws.transform.m<GetSessionTokenResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static w f24210a;

    public static w b() {
        if (f24210a == null) {
            f24210a = new w();
        }
        return f24210a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetSessionTokenResult a(com.amazonaws.transform.l lVar) throws Exception {
        GetSessionTokenResult getSessionTokenResult = new GetSessionTokenResult();
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
                    getSessionTokenResult.b(j.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return getSessionTokenResult;
    }
}
