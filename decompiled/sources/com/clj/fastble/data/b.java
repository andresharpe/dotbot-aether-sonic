package com.clj.fastble.data;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    private BluetoothDevice f27046E;

    /* renamed from: F, reason: collision with root package name */
    private byte[] f27047F;

    /* renamed from: G, reason: collision with root package name */
    private int f27048G;

    /* renamed from: H, reason: collision with root package name */
    private long f27049H;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i4) {
            return new b[i4];
        }
    }

    public b(BluetoothDevice bluetoothDevice) {
        this.f27046E = bluetoothDevice;
    }

    public BluetoothDevice a() {
        return this.f27046E;
    }

    public String b() {
        if (this.f27046E != null) {
            return this.f27046E.getName() + this.f27046E.getAddress();
        }
        return "";
    }

    public String c() {
        BluetoothDevice bluetoothDevice = this.f27046E;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        return null;
    }

    public String d() {
        BluetoothDevice bluetoothDevice = this.f27046E;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getName();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f27048G;
    }

    public byte[] g() {
        return this.f27047F;
    }

    public long h() {
        return this.f27049H;
    }

    public void i(BluetoothDevice bluetoothDevice) {
        this.f27046E = bluetoothDevice;
    }

    public void l(int i4) {
        this.f27048G = i4;
    }

    public void m(byte[] bArr) {
        this.f27047F = bArr;
    }

    public void n(long j4) {
        this.f27049H = j4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f27046E, i4);
        parcel.writeByteArray(this.f27047F);
        parcel.writeInt(this.f27048G);
        parcel.writeLong(this.f27049H);
    }

    public b(BluetoothDevice bluetoothDevice, int i4, byte[] bArr, long j4) {
        this.f27046E = bluetoothDevice;
        this.f27047F = bArr;
        this.f27048G = i4;
        this.f27049H = j4;
    }

    protected b(Parcel parcel) {
        this.f27046E = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f27047F = parcel.createByteArray();
        this.f27048G = parcel.readInt();
        this.f27049H = parcel.readLong();
    }
}
