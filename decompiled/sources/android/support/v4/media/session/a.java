package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0030a extends Binder implements a {

        /* renamed from: i, reason: collision with root package name */
        private static final String f4344i = "android.support.v4.media.session.IMediaControllerCallback";

        /* renamed from: j, reason: collision with root package name */
        static final int f4345j = 1;

        /* renamed from: k, reason: collision with root package name */
        static final int f4346k = 2;

        /* renamed from: l, reason: collision with root package name */
        static final int f4347l = 3;

        /* renamed from: m, reason: collision with root package name */
        static final int f4348m = 4;

        /* renamed from: n, reason: collision with root package name */
        static final int f4349n = 5;

        /* renamed from: o, reason: collision with root package name */
        static final int f4350o = 6;

        /* renamed from: p, reason: collision with root package name */
        static final int f4351p = 7;

        /* renamed from: q, reason: collision with root package name */
        static final int f4352q = 8;

        /* renamed from: r, reason: collision with root package name */
        static final int f4353r = 9;

        /* renamed from: s, reason: collision with root package name */
        static final int f4354s = 10;

        /* renamed from: t, reason: collision with root package name */
        static final int f4355t = 11;

        /* renamed from: u, reason: collision with root package name */
        static final int f4356u = 12;

        /* renamed from: v, reason: collision with root package name */
        static final int f4357v = 13;

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0031a implements a {

            /* renamed from: i, reason: collision with root package name */
            private IBinder f4358i;

            C0031a(IBinder iBinder) {
                this.f4358i = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public void E(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4358i.transact(1, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void H1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4358i.transact(3, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void J0(boolean z3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    obtain.writeInt(z3 ? 1 : 0);
                    this.f4358i.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void M1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4358i.transact(8, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void U0(boolean z3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    obtain.writeInt(z3 ? 1 : 0);
                    this.f4358i.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4358i;
            }

            @Override // android.support.v4.media.session.a
            public void e1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4358i.transact(4, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void i1(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    obtain.writeInt(i4);
                    this.f4358i.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void k(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4358i.transact(7, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void l(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    obtain.writeTypedList(list);
                    this.f4358i.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void o0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    this.f4358i.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void o1(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    obtain.writeInt(i4);
                    this.f4358i.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void q(CharSequence charSequence) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4358i.transact(6, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0030a.f4344i);
                    this.f4358i.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String v() {
                return AbstractBinderC0030a.f4344i;
            }
        }

        public AbstractBinderC0030a() {
            attachInterface(this, f4344i);
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f4344i);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0031a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 != 1598968902) {
                boolean z3 = false;
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompat = null;
                PlaybackStateCompat playbackStateCompat = null;
                switch (i4) {
                    case 1:
                        parcel.enforceInterface(f4344i);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        E(readString, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface(f4344i);
                        r();
                        return true;
                    case 3:
                        parcel.enforceInterface(f4344i);
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        H1(playbackStateCompat);
                        return true;
                    case 4:
                        parcel.enforceInterface(f4344i);
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        e1(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface(f4344i);
                        l(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface(f4344i);
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        q(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface(f4344i);
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        k(bundle2);
                        return true;
                    case 8:
                        parcel.enforceInterface(f4344i);
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        M1(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface(f4344i);
                        i1(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface(f4344i);
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        U0(z3);
                        return true;
                    case 11:
                        parcel.enforceInterface(f4344i);
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        J0(z3);
                        return true;
                    case 12:
                        parcel.enforceInterface(f4344i);
                        o1(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface(f4344i);
                        o0();
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString(f4344i);
            return true;
        }
    }

    void E(String str, Bundle bundle) throws RemoteException;

    void H1(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void J0(boolean z3) throws RemoteException;

    void M1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void U0(boolean z3) throws RemoteException;

    void e1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void i1(int i4) throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void l(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void o0() throws RemoteException;

    void o1(int i4) throws RemoteException;

    void q(CharSequence charSequence) throws RemoteException;

    void r() throws RemoteException;
}
