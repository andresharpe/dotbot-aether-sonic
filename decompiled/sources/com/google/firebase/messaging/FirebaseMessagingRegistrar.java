package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;

@I0.a
@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.g gVar) {
        return new FirebaseMessaging((com.google.firebase.e) gVar.a(com.google.firebase.e.class), (B1.a) gVar.a(B1.a.class), gVar.b(com.google.firebase.platforminfo.i.class), gVar.b(HeartBeatInfo.class), (com.google.firebase.installations.j) gVar.a(com.google.firebase.installations.j.class), (com.google.android.datatransport.h) gVar.a(com.google.android.datatransport.h.class), (y1.d) gVar.a(y1.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1792f<?>> getComponents() {
        return Arrays.asList(C1792f.d(FirebaseMessaging.class).b(com.google.firebase.components.u.j(com.google.firebase.e.class)).b(com.google.firebase.components.u.h(B1.a.class)).b(com.google.firebase.components.u.i(com.google.firebase.platforminfo.i.class)).b(com.google.firebase.components.u.i(HeartBeatInfo.class)).b(com.google.firebase.components.u.h(com.google.android.datatransport.h.class)).b(com.google.firebase.components.u.j(com.google.firebase.installations.j.class)).b(com.google.firebase.components.u.j(y1.d.class)).f(new com.google.firebase.components.j() { // from class: com.google.firebase.messaging.D
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(gVar);
                return lambda$getComponents$0;
            }
        }).c().d(), com.google.firebase.platforminfo.h.b("fire-fcm", C1817b.f36871f));
    }
}
