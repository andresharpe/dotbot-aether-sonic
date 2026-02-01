package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.N;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j;
import com.google.firebase.components.u;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

@I0.a
@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @N
    @SuppressLint({"MissingPermission"})
    @I0.a
    public List<C1792f<?>> getComponents() {
        return Arrays.asList(C1792f.d(com.google.firebase.analytics.connector.a.class).b(u.j(com.google.firebase.e.class)).b(u.j(Context.class)).b(u.j(y1.d.class)).f(new j() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                com.google.firebase.analytics.connector.a j4;
                j4 = com.google.firebase.analytics.connector.b.j((com.google.firebase.e) gVar.a(com.google.firebase.e.class), (Context) gVar.a(Context.class), (y1.d) gVar.a(y1.d.class));
                return j4;
            }
        }).e().d(), h.b("fire-analytics", "21.1.1"));
    }
}
