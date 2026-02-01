package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.u;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$0(com.google.firebase.components.g gVar) {
        return new i((com.google.firebase.e) gVar.a(com.google.firebase.e.class), gVar.b(com.google.firebase.heartbeatinfo.k.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1792f<?>> getComponents() {
        return Arrays.asList(C1792f.d(j.class).b(u.j(com.google.firebase.e.class)).b(u.i(com.google.firebase.heartbeatinfo.k.class)).f(new com.google.firebase.components.j() { // from class: com.google.firebase.installations.k
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                j lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(gVar);
                return lambda$getComponents$0;
            }
        }).d(), com.google.firebase.heartbeatinfo.j.a(), com.google.firebase.platforminfo.h.b("fire-installations", "17.0.2"));
    }
}
