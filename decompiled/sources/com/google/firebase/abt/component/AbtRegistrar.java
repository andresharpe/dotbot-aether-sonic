package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.j;
import com.google.firebase.components.u;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(g gVar) {
        return new a((Context) gVar.a(Context.class), gVar.b(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1792f<?>> getComponents() {
        return Arrays.asList(C1792f.d(a.class).b(u.j(Context.class)).b(u.i(com.google.firebase.analytics.connector.a.class)).f(new j() { // from class: com.google.firebase.abt.component.b
            @Override // com.google.firebase.components.j
            public final Object a(g gVar) {
                a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(gVar);
                return lambda$getComponents$0;
            }
        }).d(), h.b("fire-abt", com.google.firebase.abt.b.f34500f));
    }
}
