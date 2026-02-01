package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.collection.l;

/* loaded from: classes2.dex */
public class a extends androidx.customview.view.a {
    public static final Parcelable.Creator<a> CREATOR = new C0298a();

    /* renamed from: G, reason: collision with root package name */
    @N
    public final l<String, Bundle> f33445G;

    /* renamed from: com.google.android.material.stateful.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0298a implements Parcelable.ClassLoaderCreator<a> {
        C0298a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @P
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@N Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0298a c0298a) {
        this(parcel, classLoader);
    }

    @N
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f33445G + "}";
    }

    @Override // androidx.customview.view.a, android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        int size = this.f33445G.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = this.f33445G.m(i5);
            bundleArr[i5] = this.f33445G.q(i5);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f33445G = new l<>();
    }

    private a(@N Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f33445G = new l<>(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f33445G.put(strArr[i4], bundleArr[i4]);
        }
    }
}
