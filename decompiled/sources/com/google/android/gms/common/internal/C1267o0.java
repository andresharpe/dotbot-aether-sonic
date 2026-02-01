package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.common.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267o0 extends RemoteCreator<C1241b0> {

    /* renamed from: c, reason: collision with root package name */
    private static final C1267o0 f28797c = new C1267o0();

    private C1267o0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i4, int i5) throws RemoteCreator.RemoteCreatorException {
        C1267o0 c1267o0 = f28797c;
        try {
            C1263m0 c1263m0 = new C1263m0(1, i4, i5, null);
            return (View) com.google.android.gms.dynamic.f.G(c1267o0.b(context).N1(com.google.android.gms.dynamic.f.O0(context), c1263m0));
        } catch (Exception e4) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i4);
            sb.append(" and color ");
            sb.append(i5);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e4);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ C1241b0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof C1241b0) {
            return (C1241b0) queryLocalInterface;
        }
        return new C1241b0(iBinder);
    }
}
