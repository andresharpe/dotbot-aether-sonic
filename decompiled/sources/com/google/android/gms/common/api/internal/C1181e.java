package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C1285y;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1181e {

    @I0.a
    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    /* loaded from: classes.dex */
    public interface b<R> {
        @I0.a
        void a(@androidx.annotation.N Status status);

        @I0.a
        void b(@androidx.annotation.N R r4);
    }

    @I0.a
    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    /* loaded from: classes.dex */
    public static abstract class a<R extends com.google.android.gms.common.api.q, A extends C1164a.b> extends BasePendingResult<R> implements b<R> {

        /* renamed from: a, reason: collision with root package name */
        @I0.a
        private final C1164a.c<A> f28266a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.P
        @I0.a
        private final C1164a<?> f28267b;

        @I0.a
        @Deprecated
        protected a(@androidx.annotation.N C1164a.c<A> cVar, @androidx.annotation.N com.google.android.gms.common.api.i iVar) {
            super((com.google.android.gms.common.api.i) C1285y.m(iVar, "GoogleApiClient must not be null"));
            this.f28266a = (C1164a.c) C1285y.l(cVar);
            this.f28267b = null;
        }

        @I0.a
        private void j(@androidx.annotation.N RemoteException remoteException) {
            a(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @Override // com.google.android.gms.common.api.internal.C1181e.b
        @I0.a
        public final void a(@androidx.annotation.N Status status) {
            C1285y.b(!status.B0(), "Failed result must not be success");
            R createFailedResult = createFailedResult(status);
            setResult(createFailedResult);
            h(createFailedResult);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.C1181e.b
        @I0.a
        public /* bridge */ /* synthetic */ void b(@androidx.annotation.N Object obj) {
            super.setResult((com.google.android.gms.common.api.q) obj);
        }

        @I0.a
        protected abstract void e(@androidx.annotation.N A a4) throws RemoteException;

        @androidx.annotation.P
        @I0.a
        public final C1164a<?> f() {
            return this.f28267b;
        }

        @I0.a
        @androidx.annotation.N
        public final C1164a.c<A> g() {
            return this.f28266a;
        }

        @I0.a
        protected void h(@androidx.annotation.N R r4) {
        }

        @I0.a
        public final void i(@androidx.annotation.N A a4) throws DeadObjectException {
            try {
                e(a4);
            } catch (DeadObjectException e4) {
                j(e4);
                throw e4;
            } catch (RemoteException e5) {
                j(e5);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @I0.a
        public a(@androidx.annotation.N C1164a<?> c1164a, @androidx.annotation.N com.google.android.gms.common.api.i iVar) {
            super((com.google.android.gms.common.api.i) C1285y.m(iVar, "GoogleApiClient must not be null"));
            C1285y.m(c1164a, "Api must not be null");
            this.f28266a = (C1164a.c<A>) c1164a.b();
            this.f28267b = c1164a;
        }

        @androidx.annotation.i0
        @I0.a
        protected a(@androidx.annotation.N BasePendingResult.a<R> aVar) {
            super(aVar);
            this.f28266a = new C1164a.c<>();
            this.f28267b = null;
        }
    }
}
