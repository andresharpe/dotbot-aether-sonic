package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import com.google.android.material.datepicker.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements a.c {

    /* renamed from: G, reason: collision with root package name */
    private static final int f32198G = 1;

    /* renamed from: H, reason: collision with root package name */
    private static final int f32199H = 2;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final InterfaceC0284d f32202E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final List<a.c> f32203F;

    /* renamed from: I, reason: collision with root package name */
    private static final InterfaceC0284d f32200I = new a();

    /* renamed from: J, reason: collision with root package name */
    private static final InterfaceC0284d f32201J = new b();
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC0284d {
        a() {
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0284d
        public boolean a(@N List<a.c> list, long j4) {
            for (a.c cVar : list) {
                if (cVar != null && cVar.D(j4)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0284d
        public int getId() {
            return 1;
        }
    }

    /* loaded from: classes2.dex */
    class b implements InterfaceC0284d {
        b() {
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0284d
        public boolean a(@N List<a.c> list, long j4) {
            for (a.c cVar : list) {
                if (cVar != null && !cVar.D(j4)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0284d
        public int getId() {
            return 2;
        }
    }

    /* loaded from: classes2.dex */
    class c implements Parcelable.Creator<d> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(@N Parcel parcel) {
            InterfaceC0284d interfaceC0284d;
            ArrayList readArrayList = parcel.readArrayList(a.c.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                interfaceC0284d = d.f32201J;
            } else {
                interfaceC0284d = readInt == 1 ? d.f32200I : d.f32201J;
            }
            return new d((List) androidx.core.util.u.l(readArrayList), interfaceC0284d, null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i4) {
            return new d[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.datepicker.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0284d {
        boolean a(@N List<a.c> list, long j4);

        int getId();
    }

    /* synthetic */ d(List list, InterfaceC0284d interfaceC0284d, a aVar) {
        this(list, interfaceC0284d);
    }

    @N
    public static a.c c(@N List<a.c> list) {
        return new d(list, f32201J);
    }

    @N
    public static a.c d(@N List<a.c> list) {
        return new d(list, f32200I);
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean D(long j4) {
        return this.f32202E.a(this.f32203F, j4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f32203F.equals(dVar.f32203F) && this.f32202E.getId() == dVar.f32202E.getId()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f32203F.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        parcel.writeList(this.f32203F);
        parcel.writeInt(this.f32202E.getId());
    }

    private d(@N List<a.c> list, InterfaceC0284d interfaceC0284d) {
        this.f32203F = list;
        this.f32202E = interfaceC0284d;
    }
}
