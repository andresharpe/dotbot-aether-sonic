package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0885c implements Parcelable {
    public static final Parcelable.Creator<C0885c> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    final List<String> f15251E;

    /* renamed from: F, reason: collision with root package name */
    final List<C0884b> f15252F;

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C0885c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0885c createFromParcel(Parcel parcel) {
            return new C0885c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0885c[] newArray(int i4) {
            return new C0885c[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0885c(List<String> list, List<C0884b> list2) {
        this.f15251E = list;
        this.f15252F = list2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public List<C0883a> a(@androidx.annotation.N FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.f15251E.size());
        for (String str : this.f15251E) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.f14997J, fragment);
            } else {
                A C3 = fragmentManager.D0().C(str, null);
                if (C3 != null) {
                    Fragment a4 = C3.a(fragmentManager.C0(), fragmentManager.F0().g().getClassLoader());
                    hashMap.put(a4.f14997J, a4);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C0884b> it = this.f15252F.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        parcel.writeStringList(this.f15251E);
        parcel.writeTypedList(this.f15252F);
    }

    C0885c(@androidx.annotation.N Parcel parcel) {
        this.f15251E = parcel.createStringArrayList();
        this.f15252F = parcel.createTypedArrayList(C0884b.CREATOR);
    }
}
