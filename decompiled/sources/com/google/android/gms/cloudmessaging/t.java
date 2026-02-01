package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.P;

/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final Messenger f27937a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final j f27938b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(IBinder iBinder) throws RemoteException {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f27937a = new Messenger(iBinder);
            this.f27938b = null;
        } else {
            if (InterfaceC1160c.f27901e.equals(interfaceDescriptor)) {
                this.f27938b = new j(iBinder);
                this.f27937a = null;
                return;
            }
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f27937a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        j jVar = this.f27938b;
        if (jVar != null) {
            jVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
