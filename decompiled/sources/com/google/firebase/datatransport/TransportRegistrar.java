package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.v;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.j;
import com.google.firebase.components.u;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import t1.C2413a;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h lambda$getComponents$0(g gVar) {
        v.f((Context) gVar.a(Context.class));
        return v.c().g(a.f27180k);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1792f<?>> getComponents() {
        return Arrays.asList(C1792f.d(h.class).b(u.j(Context.class)).f(new j() { // from class: t1.c
            @Override // com.google.firebase.components.j
            public final Object a(g gVar) {
                h lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(gVar);
                return lambda$getComponents$0;
            }
        }).d(), com.google.firebase.platforminfo.h.b("fire-transport", C2413a.f57662f));
    }
}
