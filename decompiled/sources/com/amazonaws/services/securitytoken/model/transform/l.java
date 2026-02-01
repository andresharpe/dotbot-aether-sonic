package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
public class l implements com.amazonaws.transform.m<DecodeAuthorizationMessageResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static l f24204a;

    public static l b() {
        if (f24204a == null) {
            f24204a = new l();
        }
        return f24204a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public DecodeAuthorizationMessageResult a(com.amazonaws.transform.l lVar) throws Exception {
        DecodeAuthorizationMessageResult decodeAuthorizationMessageResult = new DecodeAuthorizationMessageResult();
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
                if (lVar.i("DecodedMessage", i4)) {
                    decodeAuthorizationMessageResult.b(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return decodeAuthorizationMessageResult;
    }
}
