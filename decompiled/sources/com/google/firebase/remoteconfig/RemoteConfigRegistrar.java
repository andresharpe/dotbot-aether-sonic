package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.c;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t lambda$getComponents$0(com.google.firebase.components.g gVar) {
        return new t((Context) gVar.a(Context.class), (com.google.firebase.e) gVar.a(com.google.firebase.e.class), (com.google.firebase.installations.j) gVar.a(com.google.firebase.installations.j.class), ((com.google.firebase.abt.component.a) gVar.a(com.google.firebase.abt.component.a.class)).b(c.a.f34506J), gVar.b(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1792f<?>> getComponents() {
        return Arrays.asList(C1792f.d(t.class).b(com.google.firebase.components.u.j(Context.class)).b(com.google.firebase.components.u.j(com.google.firebase.e.class)).b(com.google.firebase.components.u.j(com.google.firebase.installations.j.class)).b(com.google.firebase.components.u.j(com.google.firebase.abt.component.a.class)).b(com.google.firebase.components.u.i(com.google.firebase.analytics.connector.a.class)).f(new com.google.firebase.components.j() { // from class: com.google.firebase.remoteconfig.v
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                t lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(gVar);
                return lambda$getComponents$0;
            }
        }).e().d(), com.google.firebase.platforminfo.h.b("fire-rc", a.f37364f));
    }
}
