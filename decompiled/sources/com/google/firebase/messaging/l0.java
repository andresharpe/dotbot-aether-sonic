package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.google.firebase.messaging.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l0 extends Binder {

    /* renamed from: i, reason: collision with root package name */
    private final a f37060i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        AbstractC1770k<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(a aVar) {
        this.f37060i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final o0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "service received new intent via bind strategy");
            }
            this.f37060i.a(aVar.f37086a).f(new androidx.profileinstaller.g(), new InterfaceC1764e() { // from class: com.google.firebase.messaging.k0
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    o0.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
