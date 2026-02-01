package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.GetFederationTokenResult;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
public class u implements com.amazonaws.transform.m<GetFederationTokenResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static u f24209a;

    public static u b() {
        if (f24209a == null) {
            f24209a = new u();
        }
        return f24209a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetFederationTokenResult a(com.amazonaws.transform.l lVar) throws Exception {
        GetFederationTokenResult getFederationTokenResult = new GetFederationTokenResult();
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
                    getFederationTokenResult.d(j.b().a(lVar));
                } else if (lVar.i("FederatedUser", i4)) {
                    getFederationTokenResult.e(o.b().a(lVar));
                } else if (lVar.i("PackedPolicySize", i4)) {
                    getFederationTokenResult.f(j.i.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return getFederationTokenResult;
    }
}
