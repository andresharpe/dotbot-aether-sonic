package com.android.volley.toolbox;

import android.content.Context;
import androidx.annotation.N;
import com.android.volley.toolbox.j;
import java.io.File;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24545a = "volley";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements j.d {

        /* renamed from: a, reason: collision with root package name */
        private File f24546a = null;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f24547b;

        a(Context context) {
            this.f24547b = context;
        }

        @Override // com.android.volley.toolbox.j.d
        public File get() {
            if (this.f24546a == null) {
                this.f24546a = new File(this.f24547b.getCacheDir(), E.f24545a);
            }
            return this.f24546a;
        }
    }

    @N
    public static com.android.volley.n a(Context context) {
        return c(context, null);
    }

    @N
    private static com.android.volley.n b(Context context, com.android.volley.j jVar) {
        com.android.volley.n nVar = new com.android.volley.n(new j(new a(context.getApplicationContext())), jVar);
        nVar.o();
        return nVar;
    }

    @N
    public static com.android.volley.n c(Context context, AbstractC1077e abstractC1077e) {
        g gVar;
        if (abstractC1077e == null) {
            gVar = new g((AbstractC1077e) new p());
        } else {
            gVar = new g(abstractC1077e);
        }
        return b(context, gVar);
    }

    @N
    @Deprecated
    public static com.android.volley.n d(Context context, o oVar) {
        if (oVar == null) {
            return c(context, null);
        }
        return b(context, new g(oVar));
    }
}
