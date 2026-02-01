package com.clj.fastble.exception;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class BleException implements Serializable {

    /* renamed from: G, reason: collision with root package name */
    private static final long f27086G = 8004414918500865564L;

    /* renamed from: H, reason: collision with root package name */
    public static final int f27087H = 100;

    /* renamed from: I, reason: collision with root package name */
    public static final int f27088I = 101;

    /* renamed from: J, reason: collision with root package name */
    public static final int f27089J = 102;

    /* renamed from: E, reason: collision with root package name */
    private int f27090E;

    /* renamed from: F, reason: collision with root package name */
    private String f27091F;

    public BleException(int i4, String str) {
        this.f27090E = i4;
        this.f27091F = str;
    }

    public int a() {
        return this.f27090E;
    }

    public String b() {
        return this.f27091F;
    }

    public BleException c(int i4) {
        this.f27090E = i4;
        return this;
    }

    public BleException d(String str) {
        this.f27091F = str;
        return this;
    }

    public String toString() {
        return "BleException { code=" + this.f27090E + ", description='" + this.f27091F + "'}";
    }
}
