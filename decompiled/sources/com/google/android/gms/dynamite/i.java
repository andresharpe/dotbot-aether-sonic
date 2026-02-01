package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class i implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0272a interfaceC0272a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b4 = interfaceC0272a.b(context, str);
        bVar.f29086a = b4;
        if (b4 != 0) {
            bVar.f29088c = -1;
        } else {
            int a4 = interfaceC0272a.a(context, str, true);
            bVar.f29087b = a4;
            if (a4 != 0) {
                bVar.f29088c = 1;
            }
        }
        return bVar;
    }
}
