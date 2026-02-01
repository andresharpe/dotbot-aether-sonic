package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class k implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0272a interfaceC0272a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.f29086a = interfaceC0272a.b(context, str);
        int a4 = interfaceC0272a.a(context, str, true);
        bVar.f29087b = a4;
        int i4 = bVar.f29086a;
        if (i4 == 0) {
            i4 = 0;
            if (a4 == 0) {
                bVar.f29088c = 0;
                return bVar;
            }
        }
        if (i4 >= a4) {
            bVar.f29088c = -1;
        } else {
            bVar.f29088c = 1;
        }
        return bVar;
    }
}
