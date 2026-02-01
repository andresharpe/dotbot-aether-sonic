package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: A, reason: collision with root package name */
        static final int f4359A = 32;

        /* renamed from: B, reason: collision with root package name */
        static final int f4360B = 45;

        /* renamed from: C, reason: collision with root package name */
        static final int f4361C = 37;

        /* renamed from: D, reason: collision with root package name */
        static final int f4362D = 38;

        /* renamed from: E, reason: collision with root package name */
        static final int f4363E = 47;

        /* renamed from: F, reason: collision with root package name */
        static final int f4364F = 41;

        /* renamed from: G, reason: collision with root package name */
        static final int f4365G = 42;

        /* renamed from: H, reason: collision with root package name */
        static final int f4366H = 43;

        /* renamed from: I, reason: collision with root package name */
        static final int f4367I = 44;

        /* renamed from: J, reason: collision with root package name */
        static final int f4368J = 33;

        /* renamed from: K, reason: collision with root package name */
        static final int f4369K = 34;

        /* renamed from: L, reason: collision with root package name */
        static final int f4370L = 35;

        /* renamed from: M, reason: collision with root package name */
        static final int f4371M = 36;

        /* renamed from: N, reason: collision with root package name */
        static final int f4372N = 13;

        /* renamed from: O, reason: collision with root package name */
        static final int f4373O = 14;

        /* renamed from: P, reason: collision with root package name */
        static final int f4374P = 15;

        /* renamed from: Q, reason: collision with root package name */
        static final int f4375Q = 16;

        /* renamed from: R, reason: collision with root package name */
        static final int f4376R = 17;

        /* renamed from: S, reason: collision with root package name */
        static final int f4377S = 18;

        /* renamed from: T, reason: collision with root package name */
        static final int f4378T = 19;

        /* renamed from: U, reason: collision with root package name */
        static final int f4379U = 20;

        /* renamed from: V, reason: collision with root package name */
        static final int f4380V = 21;

        /* renamed from: W, reason: collision with root package name */
        static final int f4381W = 22;

        /* renamed from: X, reason: collision with root package name */
        static final int f4382X = 23;

        /* renamed from: Y, reason: collision with root package name */
        static final int f4383Y = 24;

        /* renamed from: Z, reason: collision with root package name */
        static final int f4384Z = 25;

        /* renamed from: a0, reason: collision with root package name */
        static final int f4385a0 = 51;

        /* renamed from: b0, reason: collision with root package name */
        static final int f4386b0 = 46;

        /* renamed from: c0, reason: collision with root package name */
        static final int f4387c0 = 39;

        /* renamed from: d0, reason: collision with root package name */
        static final int f4388d0 = 40;

        /* renamed from: e0, reason: collision with root package name */
        static final int f4389e0 = 48;

        /* renamed from: f0, reason: collision with root package name */
        static final int f4390f0 = 26;

        /* renamed from: i, reason: collision with root package name */
        private static final String f4391i = "android.support.v4.media.session.IMediaSession";

        /* renamed from: j, reason: collision with root package name */
        static final int f4392j = 1;

        /* renamed from: k, reason: collision with root package name */
        static final int f4393k = 2;

        /* renamed from: l, reason: collision with root package name */
        static final int f4394l = 3;

        /* renamed from: m, reason: collision with root package name */
        static final int f4395m = 4;

        /* renamed from: n, reason: collision with root package name */
        static final int f4396n = 5;

        /* renamed from: o, reason: collision with root package name */
        static final int f4397o = 6;

        /* renamed from: p, reason: collision with root package name */
        static final int f4398p = 7;

        /* renamed from: q, reason: collision with root package name */
        static final int f4399q = 8;

        /* renamed from: r, reason: collision with root package name */
        static final int f4400r = 9;

        /* renamed from: s, reason: collision with root package name */
        static final int f4401s = 10;

        /* renamed from: t, reason: collision with root package name */
        static final int f4402t = 11;

        /* renamed from: u, reason: collision with root package name */
        static final int f4403u = 12;

        /* renamed from: v, reason: collision with root package name */
        static final int f4404v = 27;

        /* renamed from: w, reason: collision with root package name */
        static final int f4405w = 28;

        /* renamed from: x, reason: collision with root package name */
        static final int f4406x = 29;

        /* renamed from: y, reason: collision with root package name */
        static final int f4407y = 30;

        /* renamed from: z, reason: collision with root package name */
        static final int f4408z = 31;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0032a implements b {

            /* renamed from: i, reason: collision with root package name */
            private IBinder f4409i;

            C0032a(IBinder iBinder) {
                this.f4409i = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void A0(android.support.v4.media.session.a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f4409i.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void A1(boolean z3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeInt(z3 ? 1 : 0);
                    this.f4409i.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int B() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo B1() throws RemoteException {
                ParcelableVolumeInfo parcelableVolumeInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        parcelableVolumeInfo = null;
                    }
                    return parcelableVolumeInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void C0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void D(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeInt(i4);
                    this.f4409i.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void D0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void G0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void I0(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void J(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void M(android.support.v4.media.session.a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f4409i.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean P() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    boolean z3 = false;
                    this.f4409i.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void Q(RatingCompat ratingCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void R(int i4, int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    this.f4409i.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void T(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean T0(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    boolean z3 = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z3 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z3;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void V0(int i4, int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    this.f4409i.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void Z0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public long a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4409i;
            }

            @Override // android.support.v4.media.session.b
            public void b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean b0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    boolean z3 = false;
                    this.f4409i.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void d1(MediaDescriptionCompat mediaDescriptionCompat, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    this.f4409i.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat e() throws RemoteException {
                MediaMetadataCompat mediaMetadataCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        mediaMetadataCompat = null;
                    }
                    return mediaMetadataCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat f() throws RemoteException {
                PlaybackStateCompat playbackStateCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        playbackStateCompat = null;
                    }
                    return playbackStateCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public String g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent g0() throws RemoteException {
                PendingIntent pendingIntent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2);
                    } else {
                        pendingIntent = null;
                    }
                    return pendingIntent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void h(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void i(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void i0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public int j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public CharSequence m() throws RemoteException {
                CharSequence charSequence;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2);
                    } else {
                        charSequence = null;
                    }
                    return charSequence;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void m0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void m1(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeInt(i4);
                    this.f4409i.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void p(long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeLong(j4);
                    this.f4409i.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void q1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void r1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public String s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void t(boolean z3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeInt(z3 ? 1 : 0);
                    this.f4409i.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void u1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String v() {
                return a.f4391i;
            }

            @Override // android.support.v4.media.session.b
            public int w() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean x() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    boolean z3 = false;
                    this.f4409i.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public List<MediaSessionCompat.QueueItem> y() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    this.f4409i.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void y0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4409i.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void z(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeInt(i4);
                    this.f4409i.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void z1(long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4391i);
                    obtain.writeLong(j4);
                    this.f4409i.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f4391i);
        }

        public static b v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f4391i);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0032a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            RatingCompat ratingCompat;
            Bundle bundle;
            Uri uri;
            Uri uri2;
            Bundle bundle2 = null;
            MediaDescriptionCompat mediaDescriptionCompat = null;
            MediaDescriptionCompat mediaDescriptionCompat2 = null;
            MediaDescriptionCompat mediaDescriptionCompat3 = null;
            Bundle bundle3 = null;
            Bundle bundle4 = null;
            Bundle bundle5 = null;
            Bundle bundle6 = null;
            RatingCompat ratingCompat2 = null;
            Bundle bundle7 = null;
            Bundle bundle8 = null;
            Bundle bundle9 = null;
            KeyEvent keyEvent = null;
            MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
            if (i4 != 51) {
                if (i4 != 1598968902) {
                    boolean z3 = false;
                    switch (i4) {
                        case 1:
                            parcel.enforceInterface(f4391i);
                            String readString = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            } else {
                                bundle = null;
                            }
                            if (parcel.readInt() != 0) {
                                resultReceiverWrapper = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                            }
                            r1(readString, bundle, resultReceiverWrapper);
                            parcel2.writeNoException();
                            return true;
                        case 2:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                            }
                            boolean T02 = T0(keyEvent);
                            parcel2.writeNoException();
                            parcel2.writeInt(T02 ? 1 : 0);
                            return true;
                        case 3:
                            parcel.enforceInterface(f4391i);
                            M(a.AbstractBinderC0030a.v(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case 4:
                            parcel.enforceInterface(f4391i);
                            A0(a.AbstractBinderC0030a.v(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case 5:
                            parcel.enforceInterface(f4391i);
                            boolean b02 = b0();
                            parcel2.writeNoException();
                            parcel2.writeInt(b02 ? 1 : 0);
                            return true;
                        case 6:
                            parcel.enforceInterface(f4391i);
                            String g4 = g();
                            parcel2.writeNoException();
                            parcel2.writeString(g4);
                            return true;
                        case 7:
                            parcel.enforceInterface(f4391i);
                            String s4 = s();
                            parcel2.writeNoException();
                            parcel2.writeString(s4);
                            return true;
                        case 8:
                            parcel.enforceInterface(f4391i);
                            PendingIntent g02 = g0();
                            parcel2.writeNoException();
                            if (g02 != null) {
                                parcel2.writeInt(1);
                                g02.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 9:
                            parcel.enforceInterface(f4391i);
                            long a4 = a();
                            parcel2.writeNoException();
                            parcel2.writeLong(a4);
                            return true;
                        case 10:
                            parcel.enforceInterface(f4391i);
                            ParcelableVolumeInfo B12 = B1();
                            parcel2.writeNoException();
                            if (B12 != null) {
                                parcel2.writeInt(1);
                                B12.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 11:
                            parcel.enforceInterface(f4391i);
                            V0(parcel.readInt(), parcel.readInt(), parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case 12:
                            parcel.enforceInterface(f4391i);
                            R(parcel.readInt(), parcel.readInt(), parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case 13:
                            parcel.enforceInterface(f4391i);
                            q1();
                            parcel2.writeNoException();
                            return true;
                        case 14:
                            parcel.enforceInterface(f4391i);
                            String readString2 = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            C0(readString2, bundle9);
                            parcel2.writeNoException();
                            return true;
                        case 15:
                            parcel.enforceInterface(f4391i);
                            String readString3 = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            D0(readString3, bundle8);
                            parcel2.writeNoException();
                            return true;
                        case 16:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                            } else {
                                uri = null;
                            }
                            if (parcel.readInt() != 0) {
                                bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            I0(uri, bundle7);
                            parcel2.writeNoException();
                            return true;
                        case 17:
                            parcel.enforceInterface(f4391i);
                            z1(parcel.readLong());
                            parcel2.writeNoException();
                            return true;
                        case 18:
                            parcel.enforceInterface(f4391i);
                            b();
                            parcel2.writeNoException();
                            return true;
                        case 19:
                            parcel.enforceInterface(f4391i);
                            stop();
                            parcel2.writeNoException();
                            return true;
                        case 20:
                            parcel.enforceInterface(f4391i);
                            next();
                            parcel2.writeNoException();
                            return true;
                        case 21:
                            parcel.enforceInterface(f4391i);
                            previous();
                            parcel2.writeNoException();
                            return true;
                        case 22:
                            parcel.enforceInterface(f4391i);
                            G0();
                            parcel2.writeNoException();
                            return true;
                        case 23:
                            parcel.enforceInterface(f4391i);
                            u1();
                            parcel2.writeNoException();
                            return true;
                        case 24:
                            parcel.enforceInterface(f4391i);
                            p(parcel.readLong());
                            parcel2.writeNoException();
                            return true;
                        case 25:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                ratingCompat2 = RatingCompat.CREATOR.createFromParcel(parcel);
                            }
                            Q(ratingCompat2);
                            parcel2.writeNoException();
                            return true;
                        case 26:
                            parcel.enforceInterface(f4391i);
                            String readString4 = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            J(readString4, bundle6);
                            parcel2.writeNoException();
                            return true;
                        case 27:
                            parcel.enforceInterface(f4391i);
                            MediaMetadataCompat e4 = e();
                            parcel2.writeNoException();
                            if (e4 != null) {
                                parcel2.writeInt(1);
                                e4.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 28:
                            parcel.enforceInterface(f4391i);
                            PlaybackStateCompat f4 = f();
                            parcel2.writeNoException();
                            if (f4 != null) {
                                parcel2.writeInt(1);
                                f4.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 29:
                            parcel.enforceInterface(f4391i);
                            List<MediaSessionCompat.QueueItem> y3 = y();
                            parcel2.writeNoException();
                            parcel2.writeTypedList(y3);
                            return true;
                        case 30:
                            parcel.enforceInterface(f4391i);
                            CharSequence m4 = m();
                            parcel2.writeNoException();
                            if (m4 != null) {
                                parcel2.writeInt(1);
                                TextUtils.writeToParcel(m4, parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 31:
                            parcel.enforceInterface(f4391i);
                            Bundle extras = getExtras();
                            parcel2.writeNoException();
                            if (extras != null) {
                                parcel2.writeInt(1);
                                extras.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 32:
                            parcel.enforceInterface(f4391i);
                            int j4 = j();
                            parcel2.writeNoException();
                            parcel2.writeInt(j4);
                            return true;
                        case 33:
                            parcel.enforceInterface(f4391i);
                            m0();
                            parcel2.writeNoException();
                            return true;
                        case 34:
                            parcel.enforceInterface(f4391i);
                            String readString5 = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            y0(readString5, bundle5);
                            parcel2.writeNoException();
                            return true;
                        case 35:
                            parcel.enforceInterface(f4391i);
                            String readString6 = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            i0(readString6, bundle4);
                            parcel2.writeNoException();
                            return true;
                        case 36:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                            } else {
                                uri2 = null;
                            }
                            if (parcel.readInt() != 0) {
                                bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            T(uri2, bundle3);
                            parcel2.writeNoException();
                            return true;
                        case 37:
                            parcel.enforceInterface(f4391i);
                            int B3 = B();
                            parcel2.writeNoException();
                            parcel2.writeInt(B3);
                            return true;
                        case 38:
                            parcel.enforceInterface(f4391i);
                            boolean P3 = P();
                            parcel2.writeNoException();
                            parcel2.writeInt(P3 ? 1 : 0);
                            return true;
                        case 39:
                            parcel.enforceInterface(f4391i);
                            z(parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        case 40:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                z3 = true;
                            }
                            A1(z3);
                            parcel2.writeNoException();
                            return true;
                        case 41:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                            }
                            i(mediaDescriptionCompat3);
                            parcel2.writeNoException();
                            return true;
                        case 42:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                            }
                            d1(mediaDescriptionCompat2, parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        case 43:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                            }
                            h(mediaDescriptionCompat);
                            parcel2.writeNoException();
                            return true;
                        case 44:
                            parcel.enforceInterface(f4391i);
                            m1(parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        case 45:
                            parcel.enforceInterface(f4391i);
                            boolean x3 = x();
                            parcel2.writeNoException();
                            parcel2.writeInt(x3 ? 1 : 0);
                            return true;
                        case 46:
                            parcel.enforceInterface(f4391i);
                            if (parcel.readInt() != 0) {
                                z3 = true;
                            }
                            t(z3);
                            parcel2.writeNoException();
                            return true;
                        case 47:
                            parcel.enforceInterface(f4391i);
                            int w3 = w();
                            parcel2.writeNoException();
                            parcel2.writeInt(w3);
                            return true;
                        case 48:
                            parcel.enforceInterface(f4391i);
                            D(parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        default:
                            return super.onTransact(i4, parcel, parcel2, i5);
                    }
                }
                parcel2.writeString(f4391i);
                return true;
            }
            parcel.enforceInterface(f4391i);
            if (parcel.readInt() != 0) {
                ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
            } else {
                ratingCompat = null;
            }
            if (parcel.readInt() != 0) {
                bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            Z0(ratingCompat, bundle2);
            parcel2.writeNoException();
            return true;
        }
    }

    void A0(android.support.v4.media.session.a aVar) throws RemoteException;

    void A1(boolean z3) throws RemoteException;

    int B() throws RemoteException;

    ParcelableVolumeInfo B1() throws RemoteException;

    void C0(String str, Bundle bundle) throws RemoteException;

    void D(int i4) throws RemoteException;

    void D0(String str, Bundle bundle) throws RemoteException;

    void G0() throws RemoteException;

    void I0(Uri uri, Bundle bundle) throws RemoteException;

    void J(String str, Bundle bundle) throws RemoteException;

    void M(android.support.v4.media.session.a aVar) throws RemoteException;

    boolean P() throws RemoteException;

    void Q(RatingCompat ratingCompat) throws RemoteException;

    void R(int i4, int i5, String str) throws RemoteException;

    void T(Uri uri, Bundle bundle) throws RemoteException;

    boolean T0(KeyEvent keyEvent) throws RemoteException;

    void V0(int i4, int i5, String str) throws RemoteException;

    void Z0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    long a() throws RemoteException;

    void b() throws RemoteException;

    boolean b0() throws RemoteException;

    void d1(MediaDescriptionCompat mediaDescriptionCompat, int i4) throws RemoteException;

    MediaMetadataCompat e() throws RemoteException;

    PlaybackStateCompat f() throws RemoteException;

    String g() throws RemoteException;

    PendingIntent g0() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    void h(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void i(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void i0(String str, Bundle bundle) throws RemoteException;

    int j() throws RemoteException;

    CharSequence m() throws RemoteException;

    void m0() throws RemoteException;

    void m1(int i4) throws RemoteException;

    void next() throws RemoteException;

    void p(long j4) throws RemoteException;

    void previous() throws RemoteException;

    void q1() throws RemoteException;

    void r1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    String s() throws RemoteException;

    void stop() throws RemoteException;

    void t(boolean z3) throws RemoteException;

    void u1() throws RemoteException;

    int w() throws RemoteException;

    boolean x() throws RemoteException;

    List<MediaSessionCompat.QueueItem> y() throws RemoteException;

    void y0(String str, Bundle bundle) throws RemoteException;

    void z(int i4) throws RemoteException;

    void z1(long j4) throws RemoteException;
}
