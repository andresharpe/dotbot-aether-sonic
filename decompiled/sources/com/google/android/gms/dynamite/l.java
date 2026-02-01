package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class l implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0272a interfaceC0272a) throws DynamiteModule.LoadingException {
        int a4;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b4 = interfaceC0272a.b(context, str);
        bVar.f29086a = b4;
        int i4 = 0;
        if (b4 != 0) {
            a4 = interfaceC0272a.a(context, str, false);
            bVar.f29087b = a4;
        } else {
            a4 = interfaceC0272a.a(context, str, true);
            bVar.f29087b = a4;
        }
        int i5 = bVar.f29086a;
        if (i5 == 0) {
            if (a4 == 0) {
                bVar.f29088c = 0;
                return bVar;
            }
        } else {
            i4 = i5;
        }
        if (i4 >= a4) {
            bVar.f29088c = -1;
        } else {
            bVar.f29088c = 1;
        }
        return bVar;
    }
}
