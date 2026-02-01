package com.google.android.gms.common.data;

import K0.c;
import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C1285y;
import com.google.firebase.messaging.C1821f;

@I0.a
/* loaded from: classes.dex */
public class g<T extends K0.c> extends a<T> {

    /* renamed from: G, reason: collision with root package name */
    private static final String[] f28534G = {C1821f.C0339f.a.f37006R};

    /* renamed from: F, reason: collision with root package name */
    private final Parcelable.Creator<T> f28535F;

    @I0.a
    public g(@N DataHolder dataHolder, @N Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.f28535F = creator;
    }

    @I0.a
    public static <T extends K0.c> void b(@N DataHolder.a aVar, @N T t3) {
        Parcel obtain = Parcel.obtain();
        t3.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(C1821f.C0339f.a.f37006R, obtain.marshall());
        aVar.c(contentValues);
        obtain.recycle();
    }

    @I0.a
    @N
    public static DataHolder.a c() {
        return DataHolder.c0(f28534G);
    }

    @Override // com.google.android.gms.common.data.a, com.google.android.gms.common.data.b
    @I0.a
    @N
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T get(int i4) {
        DataHolder dataHolder = (DataHolder) C1285y.l(this.f28527E);
        byte[] u02 = dataHolder.u0(C1821f.C0339f.a.f37006R, i4, dataHolder.E0(i4));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(u02, 0, u02.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.f28535F.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
