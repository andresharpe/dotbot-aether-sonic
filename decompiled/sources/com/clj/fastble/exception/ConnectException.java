package com.clj.fastble.exception;

import android.bluetooth.BluetoothGatt;

/* loaded from: classes.dex */
public class ConnectException extends BleException {

    /* renamed from: K, reason: collision with root package name */
    private BluetoothGatt f27092K;

    /* renamed from: L, reason: collision with root package name */
    private int f27093L;

    public ConnectException(BluetoothGatt bluetoothGatt, int i4) {
        super(101, "Gatt Exception Occurred! ");
        this.f27092K = bluetoothGatt;
        this.f27093L = i4;
    }

    public BluetoothGatt e() {
        return this.f27092K;
    }

    public int f() {
        return this.f27093L;
    }

    public ConnectException g(BluetoothGatt bluetoothGatt) {
        this.f27092K = bluetoothGatt;
        return this;
    }

    public ConnectException h(int i4) {
        this.f27093L = i4;
        return this;
    }

    @Override // com.clj.fastble.exception.BleException
    public String toString() {
        return "ConnectException{gattStatus=" + this.f27093L + ", bluetoothGatt=" + this.f27092K + "} " + super.toString();
    }
}
