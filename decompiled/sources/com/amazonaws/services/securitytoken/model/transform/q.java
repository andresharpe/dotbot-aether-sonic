package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
public class q implements com.amazonaws.transform.m<GetAccessKeyInfoResult, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static q f24207a;

    public static q b() {
        if (f24207a == null) {
            f24207a = new q();
        }
        return f24207a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetAccessKeyInfoResult a(com.amazonaws.transform.l lVar) throws Exception {
        GetAccessKeyInfoResult getAccessKeyInfoResult = new GetAccessKeyInfoResult();
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
                if (lVar.i("Account", i4)) {
                    getAccessKeyInfoResult.b(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return getAccessKeyInfoResult;
    }
}
