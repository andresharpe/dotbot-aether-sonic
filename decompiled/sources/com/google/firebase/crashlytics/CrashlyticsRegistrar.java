package com.google.firebase.crashlytics;

import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.u;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public i b(com.google.firebase.components.g gVar) {
        return i.e((com.google.firebase.e) gVar.a(com.google.firebase.e.class), (com.google.firebase.installations.j) gVar.a(com.google.firebase.installations.j.class), gVar.f(com.google.firebase.crashlytics.internal.a.class), gVar.f(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1792f<?>> getComponents() {
        return Arrays.asList(C1792f.d(i.class).b(u.j(com.google.firebase.e.class)).b(u.j(com.google.firebase.installations.j.class)).b(u.a(com.google.firebase.crashlytics.internal.a.class)).b(u.a(com.google.firebase.analytics.connector.a.class)).f(new com.google.firebase.components.j() { // from class: com.google.firebase.crashlytics.g
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                i b4;
                b4 = CrashlyticsRegistrar.this.b(gVar);
                return b4;
            }
        }).e().d(), com.google.firebase.platforminfo.h.b("fire-cls", e.f34961f));
    }
}
