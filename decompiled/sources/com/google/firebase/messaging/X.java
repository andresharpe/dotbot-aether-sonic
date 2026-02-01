package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1762c;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36821a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.B("this")
    private final Map<String, AbstractC1770k<String>> f36822b = new androidx.collection.a();

    /* loaded from: classes2.dex */
    interface a {
        AbstractC1770k<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X(Executor executor) {
        this.f36821a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k c(String str, AbstractC1770k abstractC1770k) throws Exception {
        synchronized (this) {
            this.f36822b.remove(str);
        }
        return abstractC1770k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized AbstractC1770k<String> b(final String str, a aVar) {
        AbstractC1770k<String> abstractC1770k = this.f36822b.get(str);
        if (abstractC1770k != null) {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Joining ongoing request for: " + str);
            }
            return abstractC1770k;
        }
        if (Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "Making new request for: " + str);
        }
        AbstractC1770k p4 = aVar.start().p(this.f36821a, new InterfaceC1762c() { // from class: com.google.firebase.messaging.W
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k2) {
                AbstractC1770k c4;
                c4 = X.this.c(str, abstractC1770k2);
                return c4;
            }
        });
        this.f36822b.put(str, p4);
        return p4;
    }
}
