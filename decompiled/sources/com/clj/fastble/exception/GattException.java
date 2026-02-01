package com.clj.fastble.exception;

/* loaded from: classes.dex */
public class GattException extends BleException {

    /* renamed from: K, reason: collision with root package name */
    private int f27094K;

    public GattException(int i4) {
        super(101, "Gatt Exception Occurred! ");
        this.f27094K = i4;
    }

    public int e() {
        return this.f27094K;
    }

    public GattException f(int i4) {
        this.f27094K = i4;
        return this;
    }

    @Override // com.clj.fastble.exception.BleException
    public String toString() {
        return "GattException{gattStatus=" + this.f27094K + "} " + super.toString();
    }
}
