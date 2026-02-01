package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new h();

    /* renamed from: E, reason: collision with root package name */
    Messenger f27916E;

    /* renamed from: F, reason: collision with root package name */
    InterfaceC1160c f27917F;

    public j(IBinder iBinder) {
        this.f27916E = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f27916E;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f27917F.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f27916E;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f27917F.e0(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((j) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Messenger messenger = this.f27916E;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f27917F.asBinder());
        }
    }
}
