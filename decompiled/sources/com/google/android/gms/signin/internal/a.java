package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.AbstractC1260l;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1255i0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1268p;

@I0.a
/* loaded from: classes2.dex */
public class a extends AbstractC1260l<g> implements com.google.android.gms.signin.f {

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ int f31089U = 0;

    /* renamed from: Q, reason: collision with root package name */
    private final boolean f31090Q;

    /* renamed from: R, reason: collision with root package name */
    private final C1250g f31091R;

    /* renamed from: S, reason: collision with root package name */
    private final Bundle f31092S;

    /* renamed from: T, reason: collision with root package name */
    @P
    private final Integer f31093T;

    public a(@N Context context, @N Looper looper, boolean z3, @N C1250g c1250g, @N Bundle bundle, @N i.b bVar, @N i.c cVar) {
        super(context, looper, 44, c1250g, bVar, cVar);
        this.f31090Q = true;
        this.f31091R = c1250g;
        this.f31092S = bundle;
        this.f31093T = c1250g.l();
    }

    @I0.a
    @N
    public static Bundle u0(@N C1250g c1250g) {
        c1250g.k();
        Integer l4 = c1250g.l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1250g.b());
        if (l4 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", l4.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @N
    public final /* synthetic */ IInterface A(@N IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @N
    protected final Bundle I() {
        if (!G().getPackageName().equals(this.f31091R.h())) {
            this.f31092S.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f31091R.h());
        }
        return this.f31092S;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @N
    public final String N() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @N
    protected final String O() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void b() {
        try {
            ((g) M()).N1(((Integer) C1285y.l(this.f31093T)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.signin.f
    public final void d() {
        l(new AbstractC1246e.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void r(f fVar) {
        GoogleSignInAccount googleSignInAccount;
        C1285y.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account d4 = this.f31091R.d();
            if ("<<default account>>".equals(d4.name)) {
                googleSignInAccount = com.google.android.gms.auth.api.signin.internal.c.b(G()).c();
            } else {
                googleSignInAccount = null;
            }
            ((g) M()).P1(new j(1, new C1255i0(d4, ((Integer) C1285y.l(this.f31093T)).intValue(), googleSignInAccount)), fVar);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.n0(new l(1, new C1231c(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e, com.google.android.gms.common.api.C1164a.f
    public final int s() {
        return C1290k.f28840a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void u(@N InterfaceC1268p interfaceC1268p, boolean z3) {
        try {
            ((g) M()).O1(interfaceC1268p, ((Integer) C1285y.l(this.f31093T)).intValue(), z3);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e, com.google.android.gms.common.api.C1164a.f
    public final boolean x() {
        return this.f31090Q;
    }
}
