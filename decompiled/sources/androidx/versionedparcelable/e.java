package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
class e extends VersionedParcel {

    /* renamed from: B, reason: collision with root package name */
    private static final boolean f20418B = false;

    /* renamed from: C, reason: collision with root package name */
    private static final String f20419C = "VersionedParcelParcel";

    /* renamed from: A, reason: collision with root package name */
    private int f20420A;

    /* renamed from: t, reason: collision with root package name */
    private final SparseIntArray f20421t;

    /* renamed from: u, reason: collision with root package name */
    private final Parcel f20422u;

    /* renamed from: v, reason: collision with root package name */
    private final int f20423v;

    /* renamed from: w, reason: collision with root package name */
    private final int f20424w;

    /* renamed from: x, reason: collision with root package name */
    private final String f20425x;

    /* renamed from: y, reason: collision with root package name */
    private int f20426y;

    /* renamed from: z, reason: collision with root package name */
    private int f20427z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d4) {
        this.f20422u.writeDouble(d4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i4) {
        while (this.f20427z < this.f20424w) {
            int i5 = this.f20420A;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f20422u.setDataPosition(this.f20427z);
            int readInt = this.f20422u.readInt();
            this.f20420A = this.f20422u.readInt();
            this.f20427z += readInt;
        }
        if (this.f20420A != i4) {
            return false;
        }
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        return this.f20422u.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f4) {
        this.f20422u.writeFloat(f4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        return this.f20422u.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i4) {
        this.f20422u.writeInt(i4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        return this.f20422u.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j4) {
        this.f20422u.writeLong(j4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return (T) this.f20422u.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        this.f20422u.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i4 = this.f20426y;
        if (i4 >= 0) {
            int i5 = this.f20421t.get(i4);
            int dataPosition = this.f20422u.dataPosition();
            this.f20422u.setDataPosition(i5);
            this.f20422u.writeInt(dataPosition - i5);
            this.f20422u.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        Parcel parcel = this.f20422u;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f20427z;
        if (i4 == this.f20423v) {
            i4 = this.f20424w;
        }
        return new e(parcel, dataPosition, i4, this.f20425x + "  ", this.f20413a, this.f20414b, this.f20415c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        return this.f20422u.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return this.f20422u.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        this.f20422u.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        this.f20422u.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i4) {
        a();
        this.f20426y = i4;
        this.f20421t.put(i4, this.f20422u.dataPosition());
        L0(0);
        L0(i4);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        this.f20422u.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        if (this.f20422u.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z3) {
        this.f20422u.writeInt(z3 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        return this.f20422u.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        this.f20422u.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        int readInt = this.f20422u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f20422u.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        if (bArr != null) {
            this.f20422u.writeInt(bArr.length);
            this.f20422u.writeByteArray(bArr);
        } else {
            this.f20422u.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f20422u);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i4, int i5) {
        if (bArr != null) {
            this.f20422u.writeInt(bArr.length);
            this.f20422u.writeByteArray(bArr, i4, i5);
        } else {
            this.f20422u.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        return this.f20422u.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f20422u, 0);
    }

    private e(Parcel parcel, int i4, int i5, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f20421t = new SparseIntArray();
        this.f20426y = -1;
        this.f20420A = -1;
        this.f20422u = parcel;
        this.f20423v = i4;
        this.f20424w = i5;
        this.f20427z = i4;
        this.f20425x = str;
    }
}
