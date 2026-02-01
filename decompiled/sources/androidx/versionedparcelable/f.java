package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
class f extends VersionedParcel {

    /* renamed from: C, reason: collision with root package name */
    private static final Charset f20428C = Charset.forName("UTF-16");

    /* renamed from: D, reason: collision with root package name */
    private static final int f20429D = 0;

    /* renamed from: E, reason: collision with root package name */
    private static final int f20430E = 1;

    /* renamed from: F, reason: collision with root package name */
    private static final int f20431F = 2;

    /* renamed from: G, reason: collision with root package name */
    private static final int f20432G = 3;

    /* renamed from: H, reason: collision with root package name */
    private static final int f20433H = 4;

    /* renamed from: I, reason: collision with root package name */
    private static final int f20434I = 5;

    /* renamed from: J, reason: collision with root package name */
    private static final int f20435J = 6;

    /* renamed from: K, reason: collision with root package name */
    private static final int f20436K = 7;

    /* renamed from: L, reason: collision with root package name */
    private static final int f20437L = 8;

    /* renamed from: M, reason: collision with root package name */
    private static final int f20438M = 9;

    /* renamed from: N, reason: collision with root package name */
    private static final int f20439N = 10;

    /* renamed from: O, reason: collision with root package name */
    private static final int f20440O = 11;

    /* renamed from: P, reason: collision with root package name */
    private static final int f20441P = 12;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f20442Q = 13;

    /* renamed from: R, reason: collision with root package name */
    private static final int f20443R = 14;

    /* renamed from: A, reason: collision with root package name */
    private int f20444A;

    /* renamed from: B, reason: collision with root package name */
    int f20445B;

    /* renamed from: t, reason: collision with root package name */
    private final DataInputStream f20446t;

    /* renamed from: u, reason: collision with root package name */
    private final DataOutputStream f20447u;

    /* renamed from: v, reason: collision with root package name */
    private DataInputStream f20448v;

    /* renamed from: w, reason: collision with root package name */
    private DataOutputStream f20449w;

    /* renamed from: x, reason: collision with root package name */
    private b f20450x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20451y;

    /* renamed from: z, reason: collision with root package name */
    int f20452z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final ByteArrayOutputStream f20454a;

        /* renamed from: b, reason: collision with root package name */
        final DataOutputStream f20455b;

        /* renamed from: c, reason: collision with root package name */
        private final int f20456c;

        /* renamed from: d, reason: collision with root package name */
        private final DataOutputStream f20457d;

        b(int i4, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f20454a = byteArrayOutputStream;
            this.f20455b = new DataOutputStream(byteArrayOutputStream);
            this.f20456c = i4;
            this.f20457d = dataOutputStream;
        }

        void a() throws IOException {
            int i4;
            this.f20455b.flush();
            int size = this.f20454a.size();
            int i5 = this.f20456c << 16;
            if (size >= 65535) {
                i4 = 65535;
            } else {
                i4 = size;
            }
            this.f20457d.writeInt(i5 | i4);
            if (size >= 65535) {
                this.f20457d.writeInt(size);
            }
            this.f20454a.writeTo(this.f20457d);
        }
    }

    public f(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    private void o1(int i4, String str, Bundle bundle) {
        switch (i4) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i4);
        }
    }

    private void p1(Object obj) {
        if (obj == null) {
            L0(0);
            return;
        }
        if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            L0(3);
            e1((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
            return;
        }
        if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d4) {
        try {
            this.f20449w.writeDouble(d4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i4) {
        while (true) {
            try {
                int i5 = this.f20444A;
                if (i5 == i4) {
                    return true;
                }
                if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                    return false;
                }
                if (this.f20452z < this.f20445B) {
                    this.f20446t.skip(r2 - r1);
                }
                this.f20445B = -1;
                int readInt = this.f20446t.readInt();
                this.f20452z = 0;
                int i6 = readInt & 65535;
                if (i6 == 65535) {
                    i6 = this.f20446t.readInt();
                }
                this.f20444A = (readInt >> 16) & 65535;
                this.f20445B = i6;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        try {
            return this.f20448v.readFloat();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f4) {
        try {
            this.f20449w.writeFloat(f4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        try {
            return this.f20448v.readInt();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i4) {
        try {
            this.f20449w.writeInt(i4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        try {
            return this.f20448v.readLong();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j4) {
        try {
            this.f20449w.writeLong(j4);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        if (this.f20451y) {
        } else {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        b bVar = this.f20450x;
        if (bVar != null) {
            try {
                if (bVar.f20454a.size() != 0) {
                    this.f20450x.a();
                }
                this.f20450x = null;
            } catch (IOException e4) {
                throw new VersionedParcel.ParcelException(e4);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        return new f(this.f20448v, this.f20449w, this.f20413a, this.f20414b, this.f20415c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        try {
            int readInt = this.f20448v.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f20448v.readFully(bArr);
                return new String(bArr, f20428C);
            }
            return null;
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f20428C);
                this.f20449w.writeInt(bytes.length);
                this.f20449w.write(bytes);
            } else {
                this.f20449w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        if (this.f20451y) {
        } else {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean i() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i4) {
        a();
        b bVar = new b(i4, this.f20447u);
        this.f20450x = bVar;
        this.f20449w = bVar.f20455b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        if (this.f20451y) {
        } else {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void j0(boolean z3, boolean z4) {
        if (z3) {
            this.f20451y = z4;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        try {
            return this.f20448v.readBoolean();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z3) {
        try {
            this.f20449w.writeBoolean(z3);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i4 = 0; i4 < L3; i4++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        try {
            if (bundle != null) {
                Set<String> keySet = bundle.keySet();
                this.f20449w.writeInt(keySet.size());
                for (String str : keySet) {
                    e1(str);
                    p1(bundle.get(str));
                }
                return;
            }
            this.f20449w.writeInt(-1);
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        try {
            int readInt = this.f20448v.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f20448v.readFully(bArr);
                return bArr;
            }
            return null;
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f20449w.writeInt(bArr.length);
                this.f20449w.write(bArr);
            } else {
                this.f20449w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i4, int i5) {
        try {
            if (bArr != null) {
                this.f20449w.writeInt(i5);
                this.f20449w.write(bArr, i4, i5);
            } else {
                this.f20449w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        try {
            return this.f20448v.readDouble();
        } catch (IOException e4) {
            throw new VersionedParcel.ParcelException(e4);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        if (this.f20451y) {
        } else {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    private f(InputStream inputStream, OutputStream outputStream, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f20452z = 0;
        this.f20444A = -1;
        this.f20445B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f20446t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f20447u = dataOutputStream;
        this.f20448v = dataInputStream;
        this.f20449w = dataOutputStream;
    }

    /* loaded from: classes.dex */
    class a extends FilterInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            f fVar = f.this;
            int i4 = fVar.f20445B;
            if (i4 != -1 && fVar.f20452z >= i4) {
                throw new IOException();
            }
            int read = super.read();
            f.this.f20452z++;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j4) throws IOException {
            f fVar = f.this;
            int i4 = fVar.f20445B;
            if (i4 != -1 && fVar.f20452z >= i4) {
                throw new IOException();
            }
            long skip = super.skip(j4);
            if (skip > 0) {
                f.this.f20452z += (int) skip;
            }
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            f fVar = f.this;
            int i6 = fVar.f20445B;
            if (i6 != -1 && fVar.f20452z >= i6) {
                throw new IOException();
            }
            int read = super.read(bArr, i4, i5);
            if (read > 0) {
                f.this.f20452z += read;
            }
            return read;
        }
    }
}
